/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaPersonne;

/**
 *
 * @author Nomad Soul
 */
public class Seance extends Groupe {
  private String nomsalle;
  private int numerosalle;
  
    public Seance(String mat, int nbh, String prof,String ns,int nsa) {
        super(mat, nbh, prof);
        this.nomsalle=ns;
        this.numerosalle=nsa;
    }
    
}
