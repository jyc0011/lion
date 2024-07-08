package com.like.lion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.like.lion.domain.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}