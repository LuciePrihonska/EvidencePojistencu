/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.spravapojistenych;

import java.util.Scanner;

/**
 *
 * @author Lucie
 */
public class SpravaPojistencu {
    
    private Scanner sc;
    
    public SpravaPojistencu (Scanner sc) {
      this.sc = sc;
    }
    
    public void Pridat(SeznamyPojistenych Pojistenci) {
        System.out.println("Prosím, zadejte jméno pojistného");
        String Jmeno = sc.nextLine();
        System.out.println("Prosím, zadejte příjmení pojistného");
        String Prijmeni = sc.nextLine();
        System.out.println("Prosím, zadejte věk pojistného");
        String Vek = sc.nextLine();
        System.out.println("Prosím, zadejte telefonní číslo pojistného");
        String telefonniCislo = sc.nextLine();
        Pojistenci.Pridat(Jmeno, Prijmeni, Vek, telefonniCislo);
    }
    public void Vypis (SeznamyPojistenych Pojistenci) {
        Pojistenci.Vypis();
    }
    
    public void Vyhledat (SeznamyPojistenych Pojistenci) {
        System.out.println("Prosím, zadejte jméno pojistného");
        String Jmeno = sc.nextLine();
        System.out.println("Prosím, zadejte příjmení pojistného");
        String Prijmeni = sc.nextLine();
        Pojisteny vysledek = Pojistenci.Vyhledat(Jmeno, Prijmeni);
        if ( vysledek != null) {
            System.out.println(vysledek.toString());
        } 
        else {
            System.out.println("Nenalezeno");
        };
    } 
}
