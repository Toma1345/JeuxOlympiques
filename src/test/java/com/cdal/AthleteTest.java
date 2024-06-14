package test.java.com.cdal;

import org.junit.jupiter.api.Test;

import main.java.com.cdal.Athlete;
import main.java.com.cdal.Pays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class AthleteTest {

    private Athlete athlete;

    @BeforeEach
    public void init() {
        this.athlete = new Athlete("MisterTest", "Prénom", 'M', 5, 15, 14, new Pays("France"));
    }

    @Test
    public void testObtenirNom() {
        assertEquals("MisterTest Prénom", this.athlete.obtenirNom());
    }

    @Test
    public void testgetSexeAthlete() {
        assertEquals('M', this.athlete.getSexeAthlete());
    }

    @Test
    public void testgetForce() {
        assertEquals(5, this.athlete.getForce());
    }

    @Test
    public void testgetAgilite() {
        assertEquals(15, this.athlete.getAgilite());
    }

    @Test
    public void testgetEndurance() {
        assertEquals(14, this.athlete.getEndurance());
    }

    @Test
    public void testsetForce() {
        this.athlete.setForce(18);
        assertEquals(18, this.athlete.getForce());
    }

    @Test
    public void testsetAgilite() {
        this.athlete.setAgilite(13);
        assertEquals(13, this.athlete.getAgilite());
    }

    @Test
    public void testsetEndurance() {
        this.athlete.setEndurance(15);
        assertEquals(15, this.athlete.getEndurance());
    }

    @Test
    public void testgetPaysAthlete() {
        Pays tmp = new Pays("France");
        assertEquals("France", this.athlete.getPaysAthlete());
    }

    @Test
    public void testsetPaysAthlete() {
        Pays tmp = new Pays("Australie");
        this.athlete.setPaysAthlete(tmp);
        assertEquals(tmp, this.athlete.getPaysAthlete());
    }
}
