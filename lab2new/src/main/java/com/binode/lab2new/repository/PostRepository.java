package com.binode.lab2new.repository;

import com.binode.lab2new.model.Post;
import com.binode.lab2new.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

<<<<<<< HEAD
//    @Query("SELECT p FROM Post p WHERE p.user_id = :userId")
//    List<Post> findAllPostsByUserId(@Param("userId") Long userId);
=======
    @Query("SELECT p FROM Post p WHERE p.user_id = :userId")
    List<Post> findAllPostsByUserId(@Param("userId") Long userId);
>>>>>>> b71ff7925f82672f2f51e1fc8e86e5d7cfddfe57
}
