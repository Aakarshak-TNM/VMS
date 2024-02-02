package com.technman.vms.Service;

import com.technman.vms.Entity.Consultant;
import com.technman.vms.Repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultantService {

    @Autowired
    ConsultantRepository consultantRepository;

    public List<Consultant> get() {
        return consultantRepository.findAll();
    }

    public Consultant post(Consultant consultant) {
        return consultantRepository.save(consultant);
    }
}
