package com.yevhenchmykhun.controller;

import com.yevhenchmykhun.entity.Book;
import com.yevhenchmykhun.service.BookService;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private BookService bookService;

    public IndexController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/index")
    public String get(Model model) {
        List<Book> books = bookService.findAllByCategoryId(2L, PageRequest.of(0, 12));
        model.addAttribute("books", books);

        return "user/index";
    }

}
