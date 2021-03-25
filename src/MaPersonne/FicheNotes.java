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
public class FicheNotes extends Module {
 private String nom;
 private String prenom;
    public FicheNotes(String mat, int nbmat,String n,String p) {
        super(mat, nbmat);
        this.nom=n;
        this.prenom=p;
    }
    
}
