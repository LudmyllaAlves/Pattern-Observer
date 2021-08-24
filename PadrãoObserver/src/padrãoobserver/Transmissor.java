/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoobserver;

import padrãoobserver.Obs;
import padrãoobserver.Observador;
import java.util.ArrayList;



/**
 *
 * @author tatia
 */
public class Transmissor implements Obs<Observador>{
    private String name;
    private ArrayList<String> conteudo = new ArrayList();
    private ArrayList<Observador> usuarios = new ArrayList();

    public Transmissor() {
        this.name = "Globo Play";
    }
 
    public void inscriçao(Observador usuario) {
        usuarios.add(usuario);
        usuario.assinatura(this);
    }

    @Override
    public void rmvInscricao(Observador usuario) {
        usuarios.remove(usuario);
        usuario.removerAssinatura();
    }
    
  
    public void upContent(String conteudo) {
        this.conteudo.add(conteudo);
        this.notification();
    }

   
    public void notification() {
        int index = this.conteudo.size() - 1;
        usuarios.forEach( user -> {
            if(user.getnotificacao()) 
                user.atulizar(this.conteudo.get(index));
        });
    }
    
    //Getter
    public String getName() {
        return name;
    }

    @Override
    public void inscricao(Observador user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notificacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void conteudo(String conteudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
