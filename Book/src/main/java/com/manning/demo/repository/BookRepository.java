package com.manning.demo.repository;

import com.manning.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhangmanying on 2018/6/21.
 */
@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
     List<Book> findByAuthor(String author);
}
