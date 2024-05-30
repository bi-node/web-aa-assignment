package com.binode.lab2new.repository;

import com.binode.lab2new.model.Post;
import com.binode.lab2new.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
