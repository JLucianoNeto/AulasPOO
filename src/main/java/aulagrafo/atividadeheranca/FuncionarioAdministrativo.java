/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagrafo.atividadeheranca;

/**
 *
 * @author T-GAMER
 */
public class FuncionarioAdministrativo extends Funcionario {
    private int funcao;
    
    
    public FuncionarioAdministrativo(String nome, String cpf, String matricula, double salarioBase,int funcao){
        super(nome,cpf,matricula,salarioBase);
        this.funcao=funcao;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        super.toString();
        return "FuncionarioAdministrativo{" + "funcao=" + funcao + '}';
    }
    
    
}
