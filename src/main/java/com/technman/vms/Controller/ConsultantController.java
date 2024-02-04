package com.technman.vms.Controller;

import com.technman.vms.Entity.Consultant;
import com.technman.vms.Service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")

public class ConsultantController {
    @Autowired
    ConsultantService consultantService;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Consultant consultant) {
//        System.out.println(consultant);
        consultantService.post(consultant);
        return "redirect:/v1/result";
    }

    @GetMapping("/result")
    public String add() {
//        System.out.println(consultant);
        return "result";
    }
}