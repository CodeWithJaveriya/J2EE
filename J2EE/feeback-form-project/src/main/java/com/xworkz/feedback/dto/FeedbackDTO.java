package com.xworkz.feedback.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "feedback_records")
public class FeedbackDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private int feedbackId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    @Column(name = "comments")
    private String comments;



}
