/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sncfCompany;

/**
 *
 * @author thoma
*/
package sncfCompany;

/**
 *
 * @author thoma
 */
public class MainClass{
        
    public static void testEntreprise(){
        
        Entreprise sncf = new Entreprise("sncf");
        sncf.addBillet(new Billet_Reduit( 
                new Billet_Weekend(
                        new Billet_Jeune(
                                new Billet_Base("Paris","Marseille",100)))));
        
        sncf.addBillet(new Billet_Reduit( 
                new Billet_Weekend(
                        new Billet_Jeune(
                                new Billet_Bleu(
                                    new Billet_Base("Lyon","Bordeaux",200))))));
        sncf.afficherBillets();
    }
}
