package com.likebookapp.repository;

import com.likebookapp.model.entity.Mood;
import com.likebookapp.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    Set<Post> findByMood(Mood mood);

    Set<Post> findAllByUserId(Long user_id);

    Set<Post> findPostsByUserIdNot(Long user_id);}
