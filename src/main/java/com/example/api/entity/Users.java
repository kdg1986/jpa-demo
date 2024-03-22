package com.example.api.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import lombok.Getter;

/**
 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */
/**
 * https://www.datanucleus.org/products/accessplatform_6_0/jakarta/annotations.html
 */

@Entity
@Getter
@NamedQuery(name = "Users.findByRegiDate", query = "select u from Users u where u.registration_date = ?1")
// @Table(name="users2")
public class Users {
    @Id /** pk 필드 */
    private Integer user_id;

    /** 
     * 테이블 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스 필드는 모두 컬럼임
     * 추가로 필요한 옵션이 있을경우 사용
     */
    @Column 
    private String username; 

    private String email; 
    private String registration_date;

    @OneToOne
    @JoinTable(
    name="OneToOne",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private UserDetail detail;
    
}
