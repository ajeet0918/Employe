package com.example.practise.Entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="Employe")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
    @Column(name = "employename")
    private String employename;
    @Column(name = "companyname")
    private String companyname;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<EmployeSallery> employeeSalaries;
}
