/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class Locacao {

    private int idLocacao;
    private Date dataLocacao;
    private double valorDiaria;
    private int quantidadeDeDias;
    private Date dataEntrega;
    private Date dataInicio;
    private int quilometragemInicial;
    private int quilometragemEntrega;
    private List<FormaDePagamento> formasDePagamento = new ArrayList();
    ;
    private Cliente cliente;
    private Funcionario funcionario;
    private Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(int idLocacao, Date dataLocacao, double valorDiaria, int quantidadeDeDias, Date dataEntrega, Date dataInicio, int quilometragemInicial, int quilometragemEntrega, List<FormaDePagamento> formasDePagamento, Cliente cliente, Funcionario funcionario, Veiculo veiculo) {
        this.idLocacao = idLocacao;
        this.dataLocacao = dataLocacao;
        this.valorDiaria = valorDiaria;
        this.quantidadeDeDias = quantidadeDeDias;
        this.dataEntrega = dataEntrega;
        this.dataInicio = dataInicio;
        this.quilometragemInicial = quilometragemInicial;
        this.quilometragemEntrega = quilometragemEntrega;
        this.formasDePagamento = formasDePagamento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.veiculo = veiculo;
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public void setQuilometragemInicial(int quilometragemInicial) {
        this.quilometragemInicial = quilometragemInicial;
    }

    public int getQuilometragemEntrega() {
        return quilometragemEntrega;
    }

    public void setQuilometragemEntrega(int quilometragemEntrega) {
        this.quilometragemEntrega = quilometragemEntrega;
    }

    public List<FormaDePagamento> getFormasDePagamento() {
        return formasDePagamento;
    }

    public void setFormasDePagamento(FormaDePagamento formasDePagamento) {
        this.formasDePagamento.add(formasDePagamento);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Locacao{" + "idLocacao=" + idLocacao + ", dataLocacao=" + dataLocacao + ", valorDiaria=" + valorDiaria + ", quantidadeDeDias=" + quantidadeDeDias + ", dataEntrega=" + dataEntrega + ", dataInicio=" + dataInicio + ", quilometragemInicial=" + quilometragemInicial + ", quilometragemEntrega=" + quilometragemEntrega + ", cliente=" + cliente + ", funcionario=" + funcionario + ", veiculo=" + veiculo + '}';
    }

    public void mostrarLocacao() {
        System.out.println(toString());
        Iterator it = formasDePagamento.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public void setIdLocacao() {
        this.idLocacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o id da locação"));
    }

    public void setDataLocacao() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataLocacao = (Date) formatter.parse(JOptionPane.showInputDialog("Informe a data da locação de id = " + getIdLocacao()));
    }

    public void setQuantidadeDeDias() {
        this.quantidadeDeDias = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias que o carro de id = " + getVeiculo().getIdVeiculo()));
    }

    public void setDataInicioLocacao() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataInicio = (Date) formatter.parse(JOptionPane.showInputDialog("Informe a data de início da locação de id = " + getIdLocacao()));
    }
    
    public void setDataEntregaLocacao() throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.dataEntrega = (Date) formatter.parse(JOptionPane.showInputDialog("Informe a data de entrga do carro da locação de id = " + getIdLocacao()));
    }

    public void setQuilometragemInicial() {
        this.quilometragemInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem de saída do carro de id = " + veiculo.getIdVeiculo()));
    }

    public void setQuilometragemFinal() {
        this.quilometragemEntrega = Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem de chegada do carro de id = " + veiculo.getIdVeiculo()));
    }
}
