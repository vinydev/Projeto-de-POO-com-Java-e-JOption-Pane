/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class FormaDePagamento {
    
    private int idPagamento;
    private String descricao;
    private double valor;

    public FormaDePagamento() {
    }

    public FormaDePagamento(int idPagamento, String descricao, double valor) {
        this.idPagamento = idPagamento;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "FormaDePagamento{" + "idPagamento=" + idPagamento + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

    public void setIdPagamento() {
        this.idPagamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o id da Forma de Pagamento"));
    }

    public void setValor() {
        this.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que irá colocar na opção = " + getDescricao()));
    }
    
    
    
}
