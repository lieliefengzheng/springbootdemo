package com.manning.demo.serviceImpl;

import com.manning.demo.entity.Book;
import com.manning.demo.repository.BookRepository;
import com.manning.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangmanying on 2018/6/22.
 */
@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;
    @Autowired
    BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public List<Book> findBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
}
