package com.like.lion.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Member {
    @Id // 키값임을 명시
    @GeneratedValue(strategy = GenerationType.IDENTITY) //디비가 설정 해줄 것임
    private Long id;

    private String name;

    // 객체로 관리 (실제로 생성해보면 전부 유저 하위에 들어옴)
    @Embedded
    private Address address;

    //주문과 일대다로 연결
    @OneToMany(mappedBy = "member")
    private List<Orders> orders;
}
