/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import java.util.ArrayList;

/**
 *
 * @author valentin
 */
public class ListePersonnes {
    ArrayList<Personne> listep;
    
    public ListePersonnes(){
        listep = new ArrayList();
    }
    
    public void ajouter(Personne p){
        
    }
    
    public boolean appartient(Personne p){
        return false;
    }
    
    public boolean appartient(String nom, String prenom){
        return false;
    }
    
    public boolean appartient(int num){
        return false;
    }
    
    public int nombrePersonnes(){
        return 0;
    }
}
