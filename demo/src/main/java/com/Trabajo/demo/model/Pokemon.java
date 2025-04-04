package com.Trabajo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {
    @Id
    private Long id;
    
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Integer weight;
    private String spriteUrl;
    
    @ElementCollection
    private List<String> types;
    
    @ElementCollection
    private List<String> abilities;
}
