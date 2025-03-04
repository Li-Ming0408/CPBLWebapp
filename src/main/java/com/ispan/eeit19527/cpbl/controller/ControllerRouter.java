package com.ispan.eeit19527.cpbl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerRouter {

	@GetMapping({"/","/index"})
    public String index() {
 
        return "/index";
    }
	
    @GetMapping("/cpbl")
    public String cpblPage() {
 
        return "/cpbl";
    }

    @GetMapping("/display")
    public String displayPage() {

        return "/display";
    }

}
