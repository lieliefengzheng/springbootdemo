package com.manning.demo.controller;

import com.manning.demo.entity.Book;
import com.manning.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;
import java.util.List;

/**
 * Created by zhangmanying on 2018/6/21.
 */

@EnableAutoConfiguration
@RestController
public class AuthorController {
    private BookService bookService;

    @Autowired
    private AuthorController(BookService bookService){
        this.bookService = bookService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Book> searchAuthorPara(@RequestParam(value="author",required = false,defaultValue ="0")String author, Model model){
        List<Book> result = bookService.findBooksByAuthor(author);
//        model.addAttribute(result);
        return result;
    }

    @RequestMapping(value = "/wilson/index.html",method = RequestMethod.GET)
    public String AuthorIndex(){
        return "index";
    }

}
