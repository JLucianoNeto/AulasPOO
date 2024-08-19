/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagrafo.atividadeheranca;

/**
 *
 * @author T-GAMER
 */
public class Funcionario extends Pessoa {
    private double salarioBase;
    private int tempoDeServico;
    
    public Funcionario(String nome, String cpf, String matricula, double salarioBase) {
        super(nome, cpf, matricula);
        this.salarioBase = salarioBase;
        this.tempoDeServico=0;
        
    }

    public double computaSalario(){
        /*
                ? ? ? ?
        */
        
        return getSalarioBase() * getTempoDeServico();
    }
    
    
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getTempoDeServico() {
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico) {
        this.tempoDeServico = tempoDeServico;
    }

    @Override
    public String toString() {
        super.toString();
        return "Funcionario{" + "salarioBase=" + salarioBase + ", tempoDeServico=" + tempoDeServico + '}';
    }
    
    
}
