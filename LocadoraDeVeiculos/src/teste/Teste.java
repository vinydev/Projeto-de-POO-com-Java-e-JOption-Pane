/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import classesbasicas.ClientePessoaFisica;
import classesbasicas.FormaDePagamento;
import classesbasicas.Funcionario;
import classesbasicas.Locacao;
import classesbasicas.Pessoa;
import classesbasicas.Veiculo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Vinicius
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        ArrayList<Funcionario> funcionarios = new ArrayList();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Funcionario f = new Funcionario(400, "210391230", 2, false, "09348230", (Date) formatter.parse("11/03/1983"), true, "Carlos", "vcm");
        funcionarios.add(f);
        funcionarios.get(0).mostrarFuncionario();
        funcionarios.get(0).demitirFuncionario();
        funcionarios.get(0).mostrarFuncionario();
        funcionarios.remove(0);
        Iterator it = funcionarios.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
        Funcionario f2 = new Funcionario(8000, "21837512735", 3, false, "3912783", (Date) formatter.parse("11/11/1990"), true, "Mateus", "plv");
        funcionarios.add(f);
        funcionarios.add(f2);
        Iterator it2 = funcionarios.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next().toString());
        }
        ClientePessoaFisica c = new ClientePessoaFisica("03428409324", 1, true, "340239482", (Date) formatter.parse("12/03/2000"), true, "Marcos", "mvc");
        ArrayList<Pessoa> clientes = new ArrayList();
        clientes.add(c);
        Iterator it3 = clientes.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next().toString());
        }
        FormaDePagamento fp = new FormaDePagamento(1, "cartão", 20);
        FormaDePagamento fp2 = new FormaDePagamento(1, "a vista", 80);
        ArrayList<FormaDePagamento> fsp = new ArrayList();
        fsp.add(fp);
        fsp.add(fp2);
        Veiculo v = new Veiculo(1, true, true, 50, true, 16000, "029483092", "chevrolet", "cobalt", "2011", "sedan", "preto");
        ArrayList<Veiculo> veiculos = new ArrayList();
        veiculos.add(v);
        Iterator it4 = veiculos.iterator();
        while (it4.hasNext()) {
            System.out.println(it4.next().toString());
        }
        Locacao l = new Locacao(1, (Date) formatter.parse("23/11/2019"), 50, 2, (Date) formatter.parse("25/11/2019"), (Date) formatter.parse("23/11/2019"), 16000, 20000, fsp, c, f2, v);
        ArrayList<Locacao> locacoes = new ArrayList();
        locacoes.add(l);
        Iterator it5 = veiculos.iterator();
        while (it5.hasNext()) {
            System.out.println(it5.next().toString());
        }
        locacoes.get(0).mostrarLocacao();
        veiculos.get(0).adicionarQuilometragem(4000);
        veiculos.get(0).mostrarVeiculo();
        funcionarios.get(1).aumentarSalario(500);
        funcionarios.get(1).mostrarFuncionario();
    }
}
