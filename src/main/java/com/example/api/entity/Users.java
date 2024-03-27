package com.example.api.entity;


import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
 */
/**
 * https://www.datanucleus.org/products/accessplatform_6_0/jakarta/annotations.html
 */
@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
@NamedQuery(name = "Users.findByRegiDate", query = "select u from Users u where u.registration_date = ?1")
// @Table(name="users2")
public class Users {

    @Id /** pk 필드 */
    /* 
    IDENTITY 전략은 id 값을 설정하지 않고(null) INSERT Query를 날리면 그때 id의 값을 세팅한다.
    기본 키 생성을 DB에 위임
    id 값을 null로 하면 DB가 알아서 AUTO_INCREMENT 해줌
    */
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    /*
    테이블 마다 시퀀스 오브젝트를 따로 관리하고 싶으면 @SequenceGenerator에 sequenceName 속성을 추가한다.
    1씩 자동증가
    하나의 시퀀스를 다른 테이블이 공유하게 된다
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "MEMBER_SEQ_GENERATOR")
    */

    /*
    @GeneratedValue(strategy = GenerationType.AUTO)
    AUTO는 데이터베이스 방언에 따라 자동 지정되며, strategy 속성의 디폴트 값
    각각 데이터베이스의 전략을 확인 후 선택
    */

    /* 
     * TABLE 
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    /** 
     * 테이블 컬럼을 나타내며 굳이 선언하지 않더라도 해당 클래스 필드는 모두 컬럼임
     * 추가로 필요한 옵션이 있을경우 사용
     */
    //@LastModifiedDate 수정시 사용
    @CreatedDate /* 저장시 save 함수 사용해야 자동으로 맵핑됨 */
    private LocalDateTime registration_date;

    @Column 
    private String username; 
    private String email;

    @OneToOne
    @JoinTable(
    name="OneToOne",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private UserDetail detail;
    
}
