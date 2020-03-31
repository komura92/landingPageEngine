package com.poswoje.landingPageEngine.Controllers;

import com.poswoje.landingPageEngine.Entities.SaleLead;
import com.poswoje.landingPageEngine.Services.SaleLeadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saleLeads")
@RequiredArgsConstructor
public class SaleLeadController {
    private final SaleLeadService saleLeadService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<SaleLead>> getAllLeads() {
        return ResponseEntity.ok(saleLeadService.getAllSaleLeads());
    }

    //get by product
    //get by email or phone number

    @PostMapping
    public ResponseEntity<SaleLead> addSaleLead(@RequestBody SaleLead saleLead) {
        return ResponseEntity.ok(saleLeadService.addSaleLead(saleLead));
    }

    @PutMapping
    public ResponseEntity<SaleLead> editSaleLead(@RequestBody SaleLead saleLead) {
        return ResponseEntity.ok(saleLeadService.editSaleLead(saleLead));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteSaleLead(@RequestBody SaleLead saleLead) {
        return ResponseEntity.ok(saleLeadService.deleteSaleLead(saleLead));
    }
}
