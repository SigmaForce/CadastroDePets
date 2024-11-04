package com.petsemfronteiras.CadastroDePets.Vacinas.Model;

import com.petsemfronteiras.CadastroDePets.Animais.Model.AnimalModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_vacinas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class VacinaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;

    @ManyToOne
    @JoinColumn(name="animais_id")
    private AnimalModel animal;


}
