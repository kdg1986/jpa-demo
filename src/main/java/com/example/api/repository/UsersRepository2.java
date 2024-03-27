package com.example.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.api.entity.Users;

public interface UsersRepository2 extends JpaRepository<Users, Integer>{
    @Modifying/* INSERT , UPDATE , DELETE문에서 사용 다중 INSERT , UPDATE , DELETE에서 사용 */
    @Query("delete from Users u where u.user_id = ?1")
    void deleteByIdUser1(Integer user_id);

    @Modifying
    @Query("update Users u set u.username = ?1 where u.user_id = ?2")
    void setUsersUsername(String username , Integer user_id);

    @Modifying
    @Query("insert into Users ( user_id , username, email ) values (?1,?2, ?3)")
    void setUsersInsert( Integer user_id , String username, String email );
    /*@Query("insert into Users ( user_id , username, email, registration_date) values (?1, ?3, ?4)")
    void setUsersInsert( String username, String email , String registration_date );*/
}
