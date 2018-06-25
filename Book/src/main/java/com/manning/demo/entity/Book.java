package com.manning.demo.entity;

import javax.persistence.*;

/**
 * Created by zhangmanying on 2018/6/21.
 */
@Entity
@Table(name = "book")
public class Book {
    public Book(){
    }

    public Book(String author,String name){
        this.author = author;
        this.name = name;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String author;
    private String name;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    @Column(name = "author")
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    @Column(name = "name")
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
