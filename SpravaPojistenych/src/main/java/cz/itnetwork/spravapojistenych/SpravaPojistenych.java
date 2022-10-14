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
public class SpravaPojistenych {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        SeznamyPojistenych seznamy = new SeznamyPojistenych ();
        SpravaPojistencu sprava = new SpravaPojistencu (sc);
        String volba= "";
        
        while (!volba.equals ("4")) {     
            System.out.println("Správa Pojištěnců");
            System.out.println();
            System.out.println("Prosím, zvolte akci");
            System.out.println("1- Přidat nového pojistného");
            System.out.println("2- Vypsat pojištěné");
            System.out.println("3- Vyhledat pojištěného");
            System.out.println("4- Konec");
            volba = sc.nextLine();
            System.out.println();
            switch (volba) {
            case "1":
                sprava.Pridat(seznamy);
                System.out.println();
                break;
            case "2":
                sprava.Vypis(seznamy);
                System.out.println();
                break;
            case "3":
                sprava.Vyhledat(seznamy);
                System.out.println();
                break;
            case "4":
                System.out.println("Děkujeme za využívání aplikace");
                break;
            default:
                System.out.println("Neplatná volba, Vyberte možnost 1, 2, 3 nebo 4");
                break;
            }
        }
    }
    
}
