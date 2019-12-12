/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Vinicius
 */
public class Funcionario extends Pessoa{
    private double salario;
    private String cpf;
    private Date dataDemissao;
    
    
    public Funcionario() {
    }

    public Funcionario(double salario, String cpf, int id, boolean cnhProvisoria, String cnh, Date dtNascimento, boolean ativo, String nome, String eMail) {
        super(id, cnhProvisoria, cnh, dtNascimento, ativo, nome, eMail);
        this.salario = salario;
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
    
    public void aumentarSalario(double aumento){
        System.out.println("O salário  de " + getNome() + " teve um aumento de " +aumento + " reais");
        this.salario += aumento;
    }
    
    public void demitirFuncionario(){
        System.out.println("O funcionário " + getNome()+ " foi demitido");
        setDataDemissao(Calendar.getInstance().getTime());
        desativar();
    }

    @Override
    public String toString() {
        
        return "Funcionario{ "+ super.toString() + "salario=" + salario + ", cpf=" + cpf + ", dataDemissao=" + dataDemissao + '}';
    }

    
    
    public void mostrarFuncionario(){
        System.out.println(toString());
    }

    public void setSalario() {
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário "+getNome()));
    }
    
}
