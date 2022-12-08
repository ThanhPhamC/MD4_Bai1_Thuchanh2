package rikkei.academy.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import rikkei.academy.model.Customer;
import rikkei.academy.service.CustomerService;
import rikkei.academy.service.impl.SimpleCustomerServiceImpl;

import java.io.*;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(value = "/customers")
//public class CustomerServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        resp.sendRedirect("/customers/showList.jsp");
//    }
//}
@Controller
@RequestMapping("CustomerServlet")
public class CustomerServlet {
    @Autowired
    private SimpleCustomerServiceImpl simpleCustomerService ;
    @RequestMapping("showList")
   public ModelAndView showList(){
        ModelAndView modelAndView= new ModelAndView("showList");
        List<Customer> list=simpleCustomerService.findAll();
        modelAndView.addObject("customers", list);
       return modelAndView  ;
   }
   @GetMapping("detail")
   public String detail(Model model, Long id  ){
        Customer customer= simpleCustomerService.findOne(id);
        model.addAttribute("customerUpdate",customer);
        return "info";
   }
   @PostMapping("Update")
    public String update(Customer customerUpdate){
        simpleCustomerService.merge(customerUpdate);
        return "redirect:showList";
   }


}