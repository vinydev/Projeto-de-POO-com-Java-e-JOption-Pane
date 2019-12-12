/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import armazenamentoDeDados.ArraysLists;
import classesbasicas.Cliente;
import classesbasicas.ClientePessoaFisica;
import classesbasicas.ClientePessoaJuridica;
import classesbasicas.FormaDePagamento;
import classesbasicas.Funcionario;
import classesbasicas.Locacao;
import classesbasicas.Veiculo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class TesteJOptionPane {

    public static void main(String[] args) throws ParseException {
           cadastrarLocacao();
    }

    public static void cadastrarFucionario() throws ParseException {
        /*Cadastrando funcionário com iteração com o usuário*/
        Funcionario f = new Funcionario();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            f.setId();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros para o campo Id");
            f.setId();
        }
        f.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
        try {
            f.setDtNascimento();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            f.setDtNascimento();
        }
        f.setCpf(JOptionPane.showInputDialog("Digite o cpf do funcionário " + f.getNome()));
        int reply = JOptionPane.showConfirmDialog(null, "A cnh de " + f.getNome() + " é Provisória?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            f.setCnhProvisoria(true);
        } else {
            f.setCnhProvisoria(false);
        }
        f.setCnh(JOptionPane.showInputDialog("Digite a cnh do funcionário " + f.getNome()));
        f.seteMail(JOptionPane.showInputDialog("Digite o e-mail do funcionário " + f.getNome()));
        try {
            f.setSalario();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números reais");
        }
        f.setAtivo(true);
        ArraysLists.getInstance().setarFuncionario(f);
        f = null;
    }

    public static void cadastrarClientePessoaFisica() throws ParseException {
        /*Cadastrando Cliente Pessoa Física*/
        ClientePessoaFisica cpf = new ClientePessoaFisica();
        try {
            cpf.setId();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros para o campo Id");
            cpf.setId();
        }
        cpf.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        try {
            cpf.setDtNascimento();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            cpf.setDtNascimento();
        }
        cpf.setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente " + cpf.getNome()));
        int reply2 = JOptionPane.showConfirmDialog(null, "A cnh de " + cpf.getNome() + " é Provisória?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply2 == JOptionPane.YES_OPTION) {
            cpf.setCnhProvisoria(true);
        } else {
            cpf.setCnhProvisoria(false);
        }
        cpf.setCnh(JOptionPane.showInputDialog("Digite a cnh do cliente " + cpf.getNome()));
        cpf.seteMail(JOptionPane.showInputDialog("Digite o e-mail do cliente " + cpf.getNome()));
        cpf.setAtivo(true);
        ArraysLists.getInstance().setarCliente(cpf);
        cpf = null;
    }

    public static void cadastrarPessoaJuridica() throws ParseException {
        /*Cadastrando Cliente Pessoa Jurídica*/
        ClientePessoaJuridica cpj = new ClientePessoaJuridica();
        try {
            cpj.setId();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros para o campo Id");
            cpj.setId();
        }
        cpj.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
        try {
            cpj.setDtNascimento();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            cpj.setDtNascimento();
        }
        cpj.setCnpj(JOptionPane.showInputDialog("Digite o cnpj do cliente " + cpj.getNome()));
        int reply = JOptionPane.showConfirmDialog(null, "A cnh de " + cpj.getNome() + " é Provisória?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            cpj.setCnhProvisoria(true);
        } else {
            cpj.setCnhProvisoria(false);
        }
        cpj.setCnh(JOptionPane.showInputDialog("Digite a cnh do condutor " + cpj.getNome()));
        cpj.seteMail(JOptionPane.showInputDialog("Digite o e-mail do cliente " + cpj.getNome()));
        cpj.setAtivo(true);
        ArraysLists.getInstance().setarCliente(cpj);
        cpj = null;
    }

    public static void cadastrarVeiculo() {
        /*Cadastrando Veículo*/
        Veiculo v = new Veiculo();
        try {
            v.setIdVeiculo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            v.setIdVeiculo();
        }
        int reply = JOptionPane.showConfirmDialog(null, "O veículo de id = " + v.getIdVeiculo() + " está disponível?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            v.setDisponivel(true);
        } else {
            v.setDisponivel(false);
        }
        int reply2 = JOptionPane.showConfirmDialog(null, "O veículo de id = " + v.getIdVeiculo() + " está com o seguro pago?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply2 == JOptionPane.YES_OPTION) {
            v.setSeguroPago(true);
        } else {
            v.setSeguroPago(false);
        }
        try {
            v.setValorDiaria();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números reais");
            v.setValorDiaria();
        }
        int reply3 = JOptionPane.showConfirmDialog(null, "O veículo de id = " + v.getIdVeiculo() + " está com o ipva pago?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply3 == JOptionPane.YES_OPTION) {
            v.setIpva(true);
        } else {
            v.setIpva(false);
        }
        try {
            v.setQuilometragem();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            v.setQuilometragem();
        }
        v.setnChassi(JOptionPane.showInputDialog("Informe o número do chassi do carro de id = " + v.getIdVeiculo()));
        v.setMarca(JOptionPane.showInputDialog("Informe a marca do veículo de id = " + v.getIdVeiculo()));
        v.setModelo(JOptionPane.showInputDialog("Informe o medo do carro de id = " + v.getIdVeiculo()));
        v.setAno(JOptionPane.showInputDialog("Informe o ano do carro de id = " + v.getIdVeiculo()));
        v.setCategoria(JOptionPane.showInputDialog("Informe a categoria do carro de id = " + v.getIdVeiculo()));
        v.setCor(JOptionPane.showInputDialog("Informe a cor do carro de id = " + v.getIdVeiculo()));
        ArraysLists.getInstance().setarVeiculo(v);
        v = null;
    }

    public static FormaDePagamento cadastrarFormadePagamento() {
        FormaDePagamento f = new FormaDePagamento();
        try {
            f.setIdPagamento();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            f.setIdPagamento();
        }
        f.setDescricao(JOptionPane.showInputDialog("Informe a descrição da forma de pagamento de id = " + f.getIdPagamento()));
        try {
            f.setValor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números reais");
            f.setValor();
        }
        return f;
    }

    public static void cadastrarLocacao() throws ParseException {
        Locacao l = new Locacao();
        try {
            l.setIdLocacao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            l.setIdLocacao();
        }
        try {
            l.setDataLocacao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            l.setDataLocacao();
        }
        cadastrarVeiculo();
        l.setVeiculo(ArraysLists.getInstance().retornarVeiculoAcabouDeRegistrar());
        l.setValorDiaria(ArraysLists.getInstance().retornarVeiculoAcabouDeRegistrar().getValorDiaria());
        try {
            l.setQuantidadeDeDias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            l.setQuantidadeDeDias();
        }
        try {
            l.setDataInicioLocacao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            l.setDataInicioLocacao();
        }
        try {
            l.setDataEntregaLocacao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato: dd/MM/yyyy");
            l.setDataEntregaLocacao();
        }
        try {
            l.setQuilometragemInicial();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            l.setQuilometragemInicial();
        }
        try {
            l.setQuilometragemFinal();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe apenas números inteiros");
            l.setQuilometragemFinal();
        }
        cadastrarClientePessoaFisica();
        l.setCliente(ArraysLists.getInstance().retornarClienteAcabouDeRegistrar());
        cadastrarFucionario();
        l.setFuncionario(ArraysLists.getInstance().retornarFuncionarioAcabouDeRegistrar());
        int i;
        try {
            i = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar Quantas formas de pagamento?"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Informe Apenas numeros inteiros");
            i = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar Quantas formas de pagamento?"));
        }
        for (int x = 1; x <= i; x++) {
            l.setFormasDePagamento(cadastrarFormadePagamento());
        }
        int reply = JOptionPane.showConfirmDialog(null, "Deseja mostrar a locação que acabou de fazer?", "Informação", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            l.mostrarLocacao();
        } else {
            
        }
    }
}
