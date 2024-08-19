/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagrafo.atividadeheranca;

import java.util.Objects;

/**
 *
 * @author T-GAMER
 */
public class Pessoa {
    private String nome,cpf,matricula;

    public Pessoa(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + '}';
    }
    
    /*
        Equals fazer na sala
    */
    
}
