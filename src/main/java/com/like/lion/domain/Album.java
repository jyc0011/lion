package com.like.lion.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;

}
