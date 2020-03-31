package com.poswoje.landingPageEngine.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SaleLead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String email;

    private String phoneNumber;

    //product interested in


    @Override
    public String toString() {
        return this.name + "," + this.email  + "," + this.phoneNumber;
    }
}
