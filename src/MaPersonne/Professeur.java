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
public class Professeur extends Personne {
      private String matiere;
      private int nbAbs;
    public Professeur(String p, String n, String ad, int a, String t, String em,String m) {
        super(p, n, ad, a, t, em);
        this.matiere=m;
        this.nbAbs=0;
    }
     public void afficher(){
        super.afficher();
        System.out.println("Prenom:"+prenom+" Nom:"+nom+" Adresse:"+adresse+" Age:"+age+" Telephone:"+telephone+" Email:"+email+" Absences:"+nbAbs+" Matiere:"+matiere);
    }
    
    
    
}

        
    
    

