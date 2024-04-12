package com.rafi.quizApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data //lombok will generate all the get set and other data fetching queries
@Entity //maps the class with the table
public class Question {

    @Id // it makes the id Primary Key
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // make the id auto generated
    private Integer id;
    private String category;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
}
