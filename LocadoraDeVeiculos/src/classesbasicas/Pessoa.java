/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Pessoa {

    private int id;
    private boolean cnhProvisoria;
    private String cnh;
    private Date dtNascimento;
    private boolean ativo;
    private String nome;
    private String eMail;

    public Pessoa() {
    }

    public Pessoa(int id, boolean cnhProvisoria, String cnh, Date dtNascimento, boolean ativo, String nome, String eMail) {
        this.id = id;
        this.cnhProvisoria = cnhProvisoria;
        this.cnh = cnh;
        this.dtNascimento = dtNascimento;
        this.ativo = ativo;
        this.nome = nome;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }
    
    public boolean getCnhProvisoria(){
        return cnhProvisoria;
    }

    public void setId() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Funcionario"));
    }

    public boolean isCnhProvisoria() {
        return cnhProvisoria;
    }

    public void setCnhProvisoria(boolean cnhProvisoria) {
        this.cnhProvisoria = cnhProvisoria;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dtNascimento = (Date) formatter.parse(JOptionPane.showInputDialog("Informe a data de nascimento de " + getNome()));
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void desativar() {
        System.out.println(this.nome + " foi desativado");
        this.ativo = false;
    }

    @Override
    public String toString() {
        return "id=" + id + ", cnhProvisoria=" + cnhProvisoria + ", cnh=" + cnh + ", dtNascimento=" + dtNascimento + ", ativo=" + ativo + ", nome=" + nome + ", eMail=" + eMail;
    }

}
