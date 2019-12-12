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
public class Veiculo {

    private int idVeiculo;
    private boolean disponivel;
    private boolean seguroPago;
    private double valorDiaria;
    private boolean ipva;
    private int quilometragem;
    private String nChassi;
    private String marca;
    private String modelo;
    private String ano;
    private String categoria;
    private String cor;

    public Veiculo() {
    }

    public Veiculo(int idVeiculo, boolean disponivel, boolean seguroPago, double valorDiaria, boolean ipva, int quilometragem, String nChassi, String marca, String modelo, String ano, String categoria, String cor) {
        this.idVeiculo = idVeiculo;
        this.disponivel = disponivel;
        this.seguroPago = seguroPago;
        this.valorDiaria = valorDiaria;
        this.ipva = ipva;
        this.quilometragem = quilometragem;
        this.nChassi = nChassi;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.categoria = categoria;
        this.cor = cor;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean isSeguroPago() {
        return seguroPago;
    }

    public void setSeguroPago(boolean seguroPago) {
        this.seguroPago = seguroPago;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isIpva() {
        return ipva;
    }

    public void setIpva(boolean ipva) {
        this.ipva = ipva;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getnChassi() {
        return nChassi;
    }

    public void setnChassi(String nChassi) {
        this.nChassi = nChassi;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void adicionarQuilometragem(int adicional) {
        this.quilometragem += adicional;
    }

    public void pagamentoDoSeguro() {
        System.out.println("Seguro pago");
        this.seguroPago = true;
    }

    public void pagarIpva() {
        System.out.println("Ipva pago");
        this.ipva = true;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "idVeiculo=" + idVeiculo + ", disponivel=" + disponivel + ", seguroPago=" + seguroPago + ", valorDiaria=" + valorDiaria + ", ipva=" + ipva + ", quilometragem=" + quilometragem + ", nChassi=" + nChassi + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", categoria=" + categoria + ", cor=" + cor + '}';
    }
    
    public void mostrarVeiculo(){
        System.out.println(toString());
    }

    public void setIdVeiculo() {
        this.idVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do veículo"));
    }

    public void setValorDiaria() {
        this.valorDiaria = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da diária do veículo de id = "+getIdVeiculo()));
    }

    public void setQuilometragem() {
        this.quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Informe a quilometragem do carro de id = " + getIdVeiculo()));
    }
    
}
