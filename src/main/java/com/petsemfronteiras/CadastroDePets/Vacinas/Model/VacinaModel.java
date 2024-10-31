package com.petsemfronteiras.CadastroDePets.Vacinas.Model;

import com.petsemfronteiras.CadastroDePets.Animais.Model.AnimalModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_vacinas")
public class VacinaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;

    @ManyToOne
    @JoinColumn(name="animais_id")
    private AnimalModel animal;



    public VacinaModel() {
    }

    public VacinaModel(String nome, String marca, AnimalModel animal) {
        this.nome = nome;
        this.marca = marca;
        this.animal = animal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public AnimalModel getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalModel animal) {
        this.animal = animal;
    }
}
