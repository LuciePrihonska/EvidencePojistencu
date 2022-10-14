/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.spravapojistenych;

import java.util.ArrayList;


/**
 *
 * @author Lucie
 */
public class SeznamyPojistenych {
    private ArrayList <Pojisteny> Pojistenci;

    public SeznamyPojistenych () {
        Pojistenci = new ArrayList <>();    
    }
    
    public void Pridat(String Jmeno, String Prijmeni, String Vek, String telefonniCislo) {
        Pojistenci.add(new Pojisteny(Jmeno, Prijmeni, Vek, telefonniCislo));
    }
    public void Vypis () {
        for (int i = 0; i < Pojistenci.size(); i++) {
            System.out.println(Pojistenci.get(i).toString());  
        }
    }
    
    public Pojisteny Vyhledat (String Jmeno, String Prijmeni) {
        Pojisteny vysledek = null;
        for (int i = 0; i < Pojistenci.size(); i++) {
            if (Pojistenci.get(i).getJmeno().equals(Jmeno) && Pojistenci.get(i).getPrijmeni().equals(Prijmeni)) {
                vysledek = Pojistenci.get(i);   
            }
        } 
        return vysledek;
    } 
          
}
