package com.like.lion.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //다대일 관계
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    //일대다
    @OneToMany(mappedBy = "orders")
    private List<OrderItem> orderItems;

    //일대일. 주문이 없어지면 배달도 없어져야하니 cascade로 종속
    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    // H2에서는 timestamp로 받아줌
    private LocalDateTime orderDate;

    //문자열로 받음
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}