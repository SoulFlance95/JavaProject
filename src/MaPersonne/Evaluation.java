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
public class Evaluation extends Module{
private int note;
private String module;

    public Evaluation(String mat, int nbmat,int no,String mo) {
        super(mat, nbmat);
        this.note=no;
        this.module=mo;
    }
    
}







