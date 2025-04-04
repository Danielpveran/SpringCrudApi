package com.Trabajo.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PokemonDTO {
    private Long id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Integer weight;
    private String spriteUrl;
    private List<String> types;
    private List<String> abilities;
}
