package com.szeptra.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CategoryController {
	
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String home(){
        return "bootstraphelloworld";
    }
    
    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String Greeting(){
    	
    	System.out.println("greeting called");
        return "Message From SpringBoot Service - Hello World!";
    }
}
