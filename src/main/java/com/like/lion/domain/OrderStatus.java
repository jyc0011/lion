package com.like.lion.domain;

// 주문완료, 배송 준비, 배송출발, 배송 도착, 배송 완료, 주문 취소
public enum OrderStatus {
    ORDERED, PREPARE, DEPART, ARRIVE, COMPLETE, CANCELLED
}