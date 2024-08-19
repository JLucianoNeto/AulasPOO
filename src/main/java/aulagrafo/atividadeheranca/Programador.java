/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagrafo.atividadeheranca;

/**
 *
 * @author T-GAMER
 */
public class Programador extends Funcionario {
    private String[] linguagens;
    private String linguagemPreferida;
    // Private Projeto projeto;
    public Programador(String nome, String cpf, String matricula, double salarioBase,String linguagemPreferida,String[] listaLinguagens) {
        super(nome, cpf, matricula, salarioBase);
        this.linguagemPreferida=linguagemPreferida;
        this.linguagens=listaLinguagens;
        
        
    }

    public String[] getLinguagens() {
        return linguagens;
    }

    public void setLinguagens(String[] linguagens) {
        this.linguagens = linguagens;
    }

    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida) {
        this.linguagemPreferida = linguagemPreferida;
    }

    @Override
    public String toString() {
        super.toString();
        return "Programador{" + "linguagens=" + linguagens + ", linguagemPreferida=" + linguagemPreferida + '}';
    }
    
    
}
