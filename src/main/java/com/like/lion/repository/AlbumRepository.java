package com.like.lion.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.like.lion.domain.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
