/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sncfCompany;

/**
 *
 * @author thoma
 */
public class Billet_Reduit implements Billet {
    
    protected Billet billet;
    public Billet_Reduit(Billet billet){
        this.billet = billet;
    }
    
    @Override
    public double cout(){
        return billet.cout();
    }
    
    @Override
    public String description(){
        return billet.description();
    } 
}
