/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package cz.itnetwork.spravapojistenych;

/**
 *
 * @author Lucie
 */
public class Pojisteny {  
    private String Jmeno;
    private String Prijmeni;
    private String Vek;
    private String telefonniCislo;
    
    public Pojisteny (String Jmeno, String Prijmeni, String Vek, String telefonniCislo) {
    this.Jmeno = Jmeno;
    this.Prijmeni = Prijmeni;
    this.Vek = Vek;
    this.telefonniCislo = telefonniCislo;
    }
    
    public String getJmeno () { return Jmeno; } 
    
    public void setJmeno (String Jmeno) { this.Jmeno = Jmeno; }
    
    public String getPrijmeni() { return Prijmeni; } 
    
    public void setPrijmeni (String Prijmeni) { this.Prijmeni = Prijmeni; }
    
    public String getVek () { return Vek; } 
    
    public void setVek (String Vek) { this.Vek = Vek; }
    
    public String getTelefonniCislo () { return telefonniCislo; } 
    
    public void setTelefonniCislo (String telefonniCislo) { this.telefonniCislo = telefonniCislo; }
    
    @Override 
    public String toString() { 
       return Jmeno + " " + Prijmeni  + " " + Vek  + " " + telefonniCislo;
    }
}
       
    

