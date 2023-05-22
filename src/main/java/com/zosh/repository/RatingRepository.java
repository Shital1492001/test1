package com.zosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.modal.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

}
