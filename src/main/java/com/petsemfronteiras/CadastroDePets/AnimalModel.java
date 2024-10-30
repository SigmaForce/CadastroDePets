package com.petsemfronteiras.CadastroDePets;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class AnimalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cor;
    private int idade;
    private String sexo;

    public AnimalModel(String nome, String cor, int idade, String sexo) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.sexo = sexo;
    }

    public AnimalModel() {
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
}
