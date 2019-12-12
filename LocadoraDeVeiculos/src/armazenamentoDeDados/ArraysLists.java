/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armazenamentoDeDados;

import classesbasicas.Cliente;
import classesbasicas.Funcionario;
import classesbasicas.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class ArraysLists {
    
    private static ArraysLists instancia;
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Veiculo> veiculos = new ArrayList();
    ArrayList<Funcionario> funcionarios = new ArrayList();
    int countv = 0;
    int iv = 0;
    int countc = 0;
    int ic = 0;
    int countf = 0;
    int ifu = 0;
    
    private ArraysLists(){
        
    }
    
    public static synchronized ArraysLists getInstance(){
        if (instancia == null){
            instancia = new ArraysLists();
        }
        return instancia;
    }
    
    public void setarCliente(Cliente c){
        clientes.add(c);
        if (ic == 0){
            ic++;
        }else{
            countc++;
        }
    }
    public void setarVeiculo(Veiculo v){
        veiculos.add(v);
        if (iv == 0){
            iv++;
        }else{
            countv++;
        }
    }
    public Veiculo retornarVeiculoAcabouDeRegistrar(){
        return veiculos.get(countv);
    }
    public void setarFuncionario(Funcionario f){
        funcionarios.add(f);
        if (ic == 0){
            ifu++;
        }else{
            countf++;
        }
    }

    public Cliente retornarClienteAcabouDeRegistrar() {
        return clientes.get(countc);
    }

    public Funcionario retornarFuncionarioAcabouDeRegistrar() {
        return funcionarios.get(countf);
    }
}
