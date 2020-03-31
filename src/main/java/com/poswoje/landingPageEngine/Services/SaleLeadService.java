package com.poswoje.landingPageEngine.Services;

import com.poswoje.landingPageEngine.Entities.SaleLead;
import com.poswoje.landingPageEngine.Repositories.SaleLeadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
@RequiredArgsConstructor
public class SaleLeadService {
    private final SaleLeadRepository saleLeadRepository;

    public List<SaleLead> getAllSaleLeads() {
        return saleLeadRepository.findAll();
    }

    //find by product
    //email, phone number?

    public SaleLead addSaleLead(SaleLead saleLead) {
        return saleLeadRepository.save(saleLead);
    }

    public SaleLead editSaleLead(SaleLead saleLead) {
        return saleLeadRepository.save(saleLead);
    }

    public String deleteSaleLead(SaleLead saleLead) {
        saleLeadRepository.delete(saleLead);
        return "Potencjalny klient (" + saleLead + ") został usunięty z bazy.";
    }
}
