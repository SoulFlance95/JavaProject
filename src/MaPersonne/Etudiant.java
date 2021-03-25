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
public class Etudiant extends Personne {
    private String filsec;
    private int nbPr;

    public Etudiant(String p, String n, String ad, int a, String t, String em,String f) {
        super(p, n, ad, a, t, em);
        this.filsec=f;
        this.nbPr=0;
    }
    
    
    /**
     *
     */
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Prenom:"+prenom+" Nom:"+nom+" Adresse:"+adresse+" Age:"+age+" Telephone:"+telephone+" Email:"+email+" Filiere:"+filsec+" Nombre Presences:"+nbPr);
    }
    
    
    }


