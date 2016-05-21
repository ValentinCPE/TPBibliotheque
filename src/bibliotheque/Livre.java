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
public class Livre {
   private int NumLivre;

  private String titre;

  private int nombreDePages;

  private Personne auteur;

  private static int dernierNum = 0;

  public Livre(String titre, int nbpages, Personne auteur) {
        this.NumLivre = dernierNum ++;
        this.auteur = auteur;
        this.nombreDePages = nbpages;
        this.titre = titre;
  }

  public int getNumLivre() {
        return this.NumLivre;
  }

  public String getTitre() {
        return this.titre;
  }

  public int getNombreDePages() {
        return this.nombreDePages;
  }

  public Personne getAuteur() {
        return this.auteur;
  }

  public void setNumLivre(int numero) {
      this.NumLivre = numero;
  }

  public void setTitre(String titre) {
      this.titre = titre;
  }

  public void setAuteur(Personne p) {
      this.auteur = p;
  }

  public void setNombreDePages(int nbPages) {
      this.nombreDePages = nbPages;
  }

   @Override
  public String toString() {
        return (this.titre+", "+this.auteur.getPrenom()+" "+this.auteur.getNom()+", "+this.nombreDePages+"p.");
  }
}
