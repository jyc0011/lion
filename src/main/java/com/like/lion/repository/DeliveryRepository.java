package com.like.lion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.like.lion.domain.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}