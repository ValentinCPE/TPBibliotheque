/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author valentin
 */
public class ListePersonnesTest {
    
    public ListePersonnesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouter method, of class ListePersonnes.
     */
    @Test
    public void testAjouter() {
        ListePersonnes liste = new ListePersonnes();
        Personne fanny = new Personne("Velien", "Fanny", 1997);
        liste.ajouter(fanny);
        assertEquals(1, liste.nombrePersonnes());
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_Personne() {
        ListePersonnes liste = new ListePersonnes();
        Personne fanny = new Personne("Velien", "Fanny", 1997);
        liste.ajouter(fanny);
        assertTrue(liste.appartient(fanny));
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_String_String() {
        ListePersonnes liste = new ListePersonnes();
        Personne fanny = new Personne("Velien", "Fanny", 1997);
        liste.ajouter(fanny);
        assertTrue(liste.appartient(fanny));
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_int() {
        ListePersonnes liste = new ListePersonnes();
        Personne fanny = new Personne("Velien", "Fanny", 1997);
        liste.ajouter(fanny);
        assertTrue(liste.appartient(fanny));
    }
    
}
