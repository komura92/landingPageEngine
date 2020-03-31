package com.poswoje.landingPageEngine.Repositories;

import com.poswoje.landingPageEngine.Entities.SaleLead;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleLeadRepository extends JpaRepository<SaleLead, Long> {
    //find by product
    List<SaleLead> findAllByName(String name);
}
