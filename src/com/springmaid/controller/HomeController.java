package com.springmaid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Tauseef
 *
 */
@Controller
public class HomeController {

    /**
     * @return
     */
    @RequestMapping(value = {"/user","/"})
    public String home() {
        return "home";
    }

}