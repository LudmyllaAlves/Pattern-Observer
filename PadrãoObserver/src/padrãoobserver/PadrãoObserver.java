/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoobserver;

import padrãoobserver.Transmissor;
import padrãoobserver.Usuario;


/**
 *
 * @author tatia
 */
public class PadrãoObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Transmissor servico = new Transmissor();
        
        Usuario user1 = new Usuario("Janaina", "Janaina@gmail.com");
        Usuario user2 = new Usuario("Jurandi", "Jurandi@gmail.com");
        Usuario user3 = new Usuario("Josefina", "Josefina@gmail.com");
        
        servico.inscriçao(user1);
        servico.inscriçao(user2);
        servico.inscriçao(user3);
        
        servico.upContent("Filme: Meu Malvado Favorito");
    
        System.out.println("\n----------------------------\n");
        
        user3.setNotify();
        System.out.println("Serviço do usuário 3: " + user3.getService().getName());
        
        servico.upContent("Serie:  Legends of tomorrow");
        
        System.out.println("\n----------------------------\n");
        
        servico.rmvInscricao(user2);
        System.out.println("Serviço do usuário 2: " + user2.getService());
    
        servico.upContent("Filme: Tá chovendo hambusguer");
    }
    }
    

