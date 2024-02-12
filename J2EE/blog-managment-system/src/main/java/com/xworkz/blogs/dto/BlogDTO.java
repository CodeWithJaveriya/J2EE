package com.xworkz.blogs.dto;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "blog_posts")

public class BlogDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "blog_title")
    private String title;
    @Column(name = "blog_content")
    private String content;
    @Column(name = "blog_author")
    private String author;
    @Column(name = "date")
    private Date creationDate;
    @Column(name = "category")
    private String category;

}