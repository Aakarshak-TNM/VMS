package com.technman.vms.Controller;

import com.technman.vms.Entity.Consultant;
import com.technman.vms.Service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v1")
public class ConsultantController {
    @Autowired
    ConsultantService consultantService;

    //    Get all Consultants
    @GetMapping("/getConsultant")
    public List<Consultant> getAllConsultants() {
        return consultantService.get();
    }

    //    Create New Consultant
    @PostMapping("/createConsultant")
    public Consultant createNewConsultant(@RequestBody Consultant consultant) {
        return consultantService.post(consultant);
    }
}
