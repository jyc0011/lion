package com.like.lion.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// 단일 테이블 상속 전략. 하위 카테고리에서 구분 코드를 줌.
@DiscriminatorColumn(name = "dtype")
// 구분 컬럼 정의
public abstract class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    // 다대다 관계. 중간 테이블은 디비가 알아서 생성해줌.
    // 직접 풀어줘야하는게 맞긴함
    @ManyToMany
    @JoinTable(name = "item_category",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
}

