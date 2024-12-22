package com.crio.springsecuritydemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.crio.springsecuritydemo.model.Video;

@EnableJpaRepositories
@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByAvailable(boolean available);

}