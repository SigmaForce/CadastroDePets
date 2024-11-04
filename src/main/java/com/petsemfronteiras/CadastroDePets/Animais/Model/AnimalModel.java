package com.petsemfronteiras.CadastroDePets.Animais.Model;


import com.petsemfronteiras.CadastroDePets.Vacinas.Model.VacinaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class AnimalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    private String especie;
    private String raca;
    private int idade;
    private String sexo;
    // @ManyToOne um Animal tem uma unica vacina
    @OneToMany(mappedBy = "animal")
    private List<VacinaModel> vacinas;

}
