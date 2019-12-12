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
public class Cliente extends Pessoa{

    public Cliente(int id, boolean cnhProvisoria, String cnh, Date dtNascimento, boolean ativo, String nome, String eMail) {
        super(id, cnhProvisoria, cnh, dtNascimento, ativo, nome, eMail);
    }
   
    public Cliente (){
        
    }
    
}
