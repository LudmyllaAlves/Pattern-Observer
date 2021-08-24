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
public interface Obs <L> {
    public void inscricao(L user);
    public void rmvInscricao(L user);
    public void notificacao();
    public void conteudo(String conteudo);
}
