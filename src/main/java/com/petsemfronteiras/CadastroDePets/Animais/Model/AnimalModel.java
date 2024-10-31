package com.petsemfronteiras.CadastroDePets.Animais.Model;


import com.petsemfronteiras.CadastroDePets.Vacinas.Model.VacinaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
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


    public AnimalModel() {
    }

    public AnimalModel(String nome, String cor, String especie, String raca, int idade, String sexo, List<VacinaModel> vacinas) {
        this.nome = nome;
        this.cor = cor;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.vacinas = vacinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<VacinaModel> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<VacinaModel> vacinas) {
        this.vacinas = vacinas;
    }
}
