package com.example.practise.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Employesallery")
public class EmployeSallery {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeid ")
    private  int employeid;
    @Column(name = "baicsallery")
    private int basicsallery;
    @Column(name = "netsallery")
    private  int netsallery;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}
