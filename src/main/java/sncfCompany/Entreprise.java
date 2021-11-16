/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sncfCompany;

import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class Entreprise {
    private ArrayList<Billet> allBillets;
    String nom;
    
    public Entreprise(String nom)
    {
        this.nom = nom;
        allBillets = new ArrayList<>();
    }
    
    public void addBillet(Billet billet){
        allBillets.add(billet);
    }
    public ArrayList<Billet> getAllBillets(){
        return allBillets;
    }
    
    public void afficherBillets(){
        for(Billet billet: allBillets)
            System.out.println(billet.description()+" prix : " + billet.cout());
    }
}
