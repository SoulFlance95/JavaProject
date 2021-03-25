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

public class Personne {
    public String prenom;
    public String nom;
    public String adresse;
    public int age;
    public String telephone;
    public String email;
    
    public Personne(String p,String n,String ad,int a,String t, String em){
        this.prenom=p;
        this.nom=n;
        this.adresse=ad;
        this.age=a;
        this.telephone=t;
        this.email=em;
        
    }

    Personne(String soul, String diack, String rudf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void afficher(){
        System.out.println("Prenom:"+prenom+" Nom:"+nom+" Adresse:"+adresse+" Age:"+age+" Telephone:"+telephone+" Email:"+email);
     }
}

