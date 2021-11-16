/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sncfCompany;

/**
 *
 * @author thoma
 */
public class Billet_Jeune extends Billet_Reduit {
    
    public Billet_Jeune(Billet billet){
        super(billet);
    }
    
    @Override
    public double cout(){
        return billet.cout() - billet.cout() *0.1;
    }
}
