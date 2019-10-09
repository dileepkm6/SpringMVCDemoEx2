package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class UserController
{
    @PostMapping("/display")
    public ModelAndView getUser(HttpServletRequest request)
    {
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        ModelAndView modelAndView=new ModelAndView("display");
        User user =new User(userName,password);
        modelAndView.addObject(user);
        return modelAndView;
    }
}
