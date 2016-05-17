/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

/**
 *
 * @author valentin
 */
public class Personne {
    private int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;
    private static int dernierNumero = 1;
    
    /**
     * Constructeur
     * @param nom : nom de la personne
     * @param prenom : prénom de la personne
     * @param anneenaiss : année de naissance de la personne
     */
    public Personne(String nom,String prenom,int anneenaiss){
        this.numeroPers = dernierNumero ++;
        this.nomPers = nom;
        this.prenomPers = prenom;
        this.anNaissance = anneenaiss;
    }
    
    /**
     * Obtention numéro de la personne
     * @return NumeroPersonne
     */
    public int getNumero(){
        return this.numeroPers;
    }
    
    /**
     * Obtention nom de la personne
     * @return NomPersonne
     */
    public String getNom(){
        return this.nomPers;
    }
    
    /**
     * Obtention Prénom de la Personne
     * @return PrenomPersonne
     */
    public String getPrenom(){
        return this.prenomPers;
    }
    
    /**
     * Obtention Annéee de naissance de la personne
     * @return AnneeNaissance
     */
    public int getAnNaissance(){
        return this.anNaissance;
    }
    
    
    /**
     * Changement variable Numéro Personne
     * @param numero : numeroPersonne
     */
    public void setNumPers(int numero){
        this.numeroPers = numero;
    }
    
    /**
     * Changement variable Nom de la Personne
     * @param nom : nomPersonne
     */
    public void setNomPers(String nom){
        this.nomPers = nom;
    }
    
    /**
     * Changement variable Prénom de la Personne
     * @param prenom : prenomPersonne
     */
    public void setPrenomPers(String prenom){
        this.prenomPers = prenom;
    }
    
    /**
     * Changement variable Année de naissance de la Personne
     * @param annee : AnNaissance
     */
    public void setAnNaissance(int annee){
        this.anNaissance = annee;
    }
    
    /**
     * Redéfinition de toString()
     * @return chaîne
     */
    public String toString(){
        return (this.nomPers+", "+this.prenomPers+", "+this.anNaissance);
    }
    
}
