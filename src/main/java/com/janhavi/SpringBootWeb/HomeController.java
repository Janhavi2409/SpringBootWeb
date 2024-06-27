package com.janhavi.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String login(){
        System.out.println("Home method called");
//        return "index.jsp";
        return "index";

    }

//    @RequestMapping("login")
////    public String welcome(HttpServletRequest request, HttpSession session){
//    public String welcome(@RequestParam("email") String emailID, @RequestParam String password, HttpSession session){
//        User user = new User();
//
////        String email = request.getParameter("email");
////        String password = request.getParameter("password");
//        System.out.println("Email: "+emailID);
//        System.out.println("Password: "+password);
//        session.setAttribute("email", emailID);
////        return "welcome.jsp";
//        return "welcome";
//    }

//    @RequestMapping("welcome")
//    public ModelAndView welcome(@RequestParam("email") String emailID, @RequestParam String password, ModelAndView mv){
//        User user = new User();
//        user.setEmail(emailID);
//        user.setPassword(password);
//        mv.addObject("user", user);
//        mv.setViewName("welcome");
//        return mv;
//    }

    @RequestMapping("welcome")
    public String welcome(@ModelAttribute User user){
        return "welcome";
    }
}
