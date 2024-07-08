package com.like.lion.domain;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Delivery {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //일대일
    @OneToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    // 객체로 관리
    @Embedded
    private Address address;

    // 문자열로 받음
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
