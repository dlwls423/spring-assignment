package com.sparta.springfirstassignment.Repository;

import com.sparta.springfirstassignment.Entity.Post;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedAtDesc();

    Post findByPostId(Long postId);
}
