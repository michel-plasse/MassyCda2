/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sncfCompany;

/**
 *
 * @author thoma
 */
public class Billet_Base implements Billet{
    private String depart;
    private String arrivee;
    private double prix;
    
    public Billet_Base(String depart, String arrivee, double prix){
        this.depart = depart;
        this.arrivee = arrivee;
        this.prix = prix;
    }
    
    @Override
    public double cout(){
        return prix;
    }
    
    @Override
    public String description(){
        return depart + ' ' + arrivee;
    } 
}
