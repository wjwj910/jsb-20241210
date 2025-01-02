package com.mysite.sbb.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findAllByQuestionId(Integer questionId);

    List<Comment> findAllByAnswerId(Integer answerId);
}