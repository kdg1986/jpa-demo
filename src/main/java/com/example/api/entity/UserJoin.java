package com.example.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import lombok.Getter;

/**
 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */

// @Entity
// @Getter
// @NamedQuery(name = "Users.findByRegiDate", query = "select u from Users u where u.registration_date = ?1")
// @Table(name="users2")
public class UserJoin {
    // @Id /** pk 필드 */
    // // @Column( = "users.user_id")
    // private Integer user_id;

    // @OneToOne
    // @JoinColumn(name = "user_id")
    // private Users users;

    // @OneToOne
    // @JoinColumn(name = "user_id")
    // private UserDetail userDetail;

    
}
