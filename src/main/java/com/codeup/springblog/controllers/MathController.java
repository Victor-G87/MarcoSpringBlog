package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add")
    @ResponseBody
    public int add(){
        return 3 + 4;
    }

    @GetMapping("/sub")
    @ResponseBody
    public int subtract(){
        return 3 - 10;
    }

    @GetMapping("/multi")
    @ResponseBody
    public int miltiply(){
        return 4 * 5;
    }

    @GetMapping("/divide")
    @ResponseBody
    public int divide(){
        return 6 / 3;
    }

    @GetMapping("/roll-dice")
    public String showGuessPage(){
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{num}")
    public String showGuessedNum(@PathVariable int num, Model vModel){
        vModel.addAttribute("num", num);
        int randomNum = (int) (Math.random() * 6) + 1;
        vModel.addAttribute("randomNum", randomNum);
        return "roll-dice";
    }
}
