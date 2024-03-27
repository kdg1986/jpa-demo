package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entity.Users;
import com.example.api.repository.UsersRepository;
import com.example.api.repository.UsersRepository2;

import jakarta.transaction.Transactional;

@Service
public class Api2Service {
    
    @Autowired
    UsersRepository2 usersRepository2;

    @Autowired
    UsersRepository usersRepository;

    /* 엔티티의 PK id를 넘겨야 삭제가능 */
    public void deleteByUserId(Integer user_id) {
        usersRepository2.deleteById(user_id);
    }

    /* 엔티티의 PK id를 넘겨야 삭제가능 */
    @Transactional
    public void deleteByIdUser1(Integer user_id) {
        usersRepository2.deleteByIdUser1(user_id);
    }

    /*
     * 
     * @Transactional을 사용하면 save를 호출하지 않아도 변경이 되어있다. → 더티체킹
       @Transactional은 영속화를 시키고 함수가 끝나면 commit해준다. 
       더티체킹 : 영속화시키고 그 값을 변경시키면 @Transactional이 종료될 때 변경을 감지해서 db에 수정을 알려주는것 
     * 
     */
    //@Transactional
    public void setUpdateEntity(Integer user_id, Users entity) {
        /*Users users = usersRepository.findById(user_id).orElseThrow(() -> {
            // IllegalArgumentException 예외 처리
            throw new IllegalArgumentException("해당하는 아이디가 없습니다 id : " + user_id);
        });*/

        Users users = ( usersRepository.findById(user_id).isPresent() ) ? usersRepository.findById(user_id).get() : new Users();

        users.setUser_id(user_id);
        users.setUsername(entity.getUsername());
        users.setEmail(entity.getEmail());
        users.setRegistration_date(entity.getRegistration_date());

        usersRepository2.save(users);
    }

    @Transactional /* @Query 사용할경우 Update, Delete , INSERT 경우 Transactional 필수 */
    public void setUsersUsername(Integer user_id, Users entity) {
        usersRepository2.setUsersUsername((String)entity.getUsername() , user_id);
    }

    @Transactional /* @Query 사용할경우 Update, Delete , INSERT 경우 Transactional 필수 */
    public void setUsersInsert(Users entity) {
        //usersRepository2.setUsersInsert(entity.getUsername(), entity.getEmail() , entity.getRegistration_date());
        usersRepository2.setUsersInsert(entity.getUser_id(),entity.getUsername(), entity.getEmail() );
    }

    @Transactional /* @Query 사용할경우 Update, Delete , INSERT 경우 Transactional 필수 */
    public void setSeveEntity(Users entity) {
        usersRepository2.save(entity );
    }
}
