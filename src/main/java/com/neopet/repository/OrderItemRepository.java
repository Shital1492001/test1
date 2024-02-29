package com.neopet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neopet.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
