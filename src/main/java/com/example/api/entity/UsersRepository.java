package com.example.api.entity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UsersRepository  extends JpaRepository<Users, Integer>{
    
    /** 자체적으로 지원하는 키워드 메소드
     * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.query-creation
     */
    Users findByUsername(String username);

    /** 엔티티에 정의된 @NamedQuery 쿼리보다 우선시됨
     * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.at-query
      */
    @Query("select a from Users a where email = ?1")
    Users QueryEmail(String email);

    /** NamedQuery
     * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.named-queries.annotation-based-configuration
     */
    Users findByRegiDate(String regDate);
    
    /**
     * Like Expressions
     * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.at-query.advanced-like
     */
    @Query(value="select a from Users a where username like %:username%"
    ,countQuery = "select count(a) from Users a where username like %:username%")
    List<Users> UsernameEndWith(@Param("username") String username);

    // @Query(value="select * from users a where username like %:username%"
    // ,countQuery = "select count(*) from users a where username like %:username%"
    // ,nativeQuery = true)
    // List<Users> UsernameEndWithCount(@Param("username") String username,Pageable pageable);

    @Query("select a from Users a")
    List<Users> userNameSort(Sort sort);

}
