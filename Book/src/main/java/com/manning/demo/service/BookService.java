package com.manning.demo.service;

import com.manning.demo.entity.Book;
import com.manning.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmanying on 2018/6/22.
 */
public interface BookService{
    List<Book> findBooksByAuthor(String author);
}
