package com.like.lion.domain;

import java.util.List;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // 다대다 관계. 알아서 풀어줄거임
    @ManyToMany(mappedBy = "categories")
    private List<Item> items;

    // 다대일
    // 부모 카테고리
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    // 일대다
    // 자식 카테고리
    @OneToMany(mappedBy = "parent")
    private List<Category> child;

}
