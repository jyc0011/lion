package com.like.lion.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //다대일
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    //다대일
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    private int orderPrice;
    private int count;
}
