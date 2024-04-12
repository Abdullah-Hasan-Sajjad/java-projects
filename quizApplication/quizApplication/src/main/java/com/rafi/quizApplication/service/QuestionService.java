package com.rafi.quizApplication.service;

import com.rafi.quizApplication.dao.QuestionDao;
import com.rafi.quizApplication.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions(){
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String language){
        return questionDao.findByCategory(language);
    }
}
