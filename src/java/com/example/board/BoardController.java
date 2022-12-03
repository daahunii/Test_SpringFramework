package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class BoardController {
    @Autowired
    BoardDAO boardDAO;

    @RequestMapping(value = "/bo")

}
