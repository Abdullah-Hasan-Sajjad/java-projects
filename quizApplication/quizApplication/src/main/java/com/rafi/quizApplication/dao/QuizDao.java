package com.rafi.quizApplication.dao;

import com.rafi.quizApplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
