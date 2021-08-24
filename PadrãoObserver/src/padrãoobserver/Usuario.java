/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoobserver;
import padrãoobserver.Transmissor;
import padrãoobserver.Observador;

/**
 *
 * @author tatia
 */
public class Usuario implements Observador<Transmissor>{
    private boolean not = true;
    private Transmissor serviço;
    private String name;
    private String email;

    public Usuario(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public void atulizar(String up) {
        System.out.println("Hey " + this.name + " temos novidades quentinha para você!\n" + up);
    }
    
    @Override
    public void assinatura(Transmissor service){
        this.serviço = service;
    }
    
    @Override
    public void removerAssinatura() {
        this.serviço = null;
    }
    
    @Override
    public boolean getnotificacao(){
        return this.not;
    }
    
    
    

    public Transmissor getService() {
        return serviço;
    }
    
    public void setNotify() {
        this.not = !this.not;
    }
    
    
    
}
