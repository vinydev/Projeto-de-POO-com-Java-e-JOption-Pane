/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

import java.util.Date;

/**
 *
 * @author Vinicius
 */
public class ClientePessoaJuridica extends Cliente {
    
    private String cnpj;

    public ClientePessoaJuridica(String cnpj, int id, boolean cnhProvisoria, String cnh, Date dtNascimento, boolean ativo, String nome, String eMail) {
        super(id, cnhProvisoria, cnh, dtNascimento, ativo, nome, eMail);
        this.cnpj = cnpj;
    }
    
    public ClientePessoaJuridica(){
        
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
