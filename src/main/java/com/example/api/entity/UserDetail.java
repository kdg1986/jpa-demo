package com.example.api.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

/**
 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */

@Entity
@Getter
@Table(name="user_details")
public class UserDetail {
    @Id /** pk 필드 */
    private Integer detail_id;
    // @Column(name = "user_id")
    private Integer user_id; 
    private String full_name; 
    private String gender;
    private String date_of_birth;
}
