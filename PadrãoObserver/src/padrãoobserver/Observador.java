/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoobserver;

/**
 *
 * @author tatia
 */
public interface Observador <L>{
    public void atulizar(String up);
    public void assinatura(L serviço);
    public boolean getnotificacao();
    
    public void removerAssinatura();
    
}
