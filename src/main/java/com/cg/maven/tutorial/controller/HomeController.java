package com.cg.maven.tutorial.controller;

import com.cg.maven.tutorial.model.Customer;
import com.cg.maven.tutorial.service.CustomerService;
import com.cg.maven.tutorial.service.Implement.CustomerServiceImpl;
import com.cg.maven.tutorial.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class HomeController {
    //DEMO CONFIG spring mvc +thymeleaf done
    @GetMapping("/demo")
    public String demo(){
        return  "demo";
    }

    @Autowired
    public CustomerService customerService;

    @GetMapping("/customers")
    public String index(Model model){
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "index";
    }

    @GetMapping("/customer/add")
    public  String create(Model model){
        model.addAttribute("customer",new Customer());
        return "add";
    }

    @PostMapping("/customer/add")
    public String save(Customer customer, RedirectAttributes redirectAttributes){
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Save customer successfully !");
        return "redirect:/customers";
    }

}
