package com.technman.vms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.technman.vms.Entity.Consultant;

public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
}
