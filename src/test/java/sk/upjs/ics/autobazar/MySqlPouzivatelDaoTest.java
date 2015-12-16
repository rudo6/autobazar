
package sk.upjs.ics.autobazar;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MySqlPouzivatelDaoTest {
    
    public MySqlPouzivatelDaoTest() {
    }
   
    /**
     * Test of pridajPouzivatela method, of class MySqlPouzivatelDao.
     */
    @Test
    public void testPridajPouzivatela() {        
        System.out.println("pridajPouzivatela");
        Pouzivatel pouzivatel = new Pouzivatel();
        pouzivatel.setUzivatelskeMeno("alena");
        pouzivatel.setMeno("alena");
        pouzivatel.setPriezvisko("nula");
        pouzivatel.setHeslo("abc");
        pouzivatel.setAdresa("Volgogradska 56");
        pouzivatel.setPsc("25896");
        pouzivatel.setKrajina("Slovenska republika");
        pouzivatel.setMesto("Presov");
        pouzivatel.setTelefonneCislo("0956895632");
        pouzivatel.setEmail("alena@gmail.com");
        pouzivatel.setId(5L);
        MySqlPouzivatelDao instance = new MySqlPouzivatelDao();
        instance.pridajPouzivatela(pouzivatel);
        assertTrue(instance.overPouzivatela(pouzivatel.getUzivatelskeMeno(), pouzivatel.getHeslo())>0);
        
    }

    /**
     * Test of overPouzivatela method, of class MySqlPouzivatelDao.
     */
    @Test
    public void testOverPouzivatela() {
        System.out.println("overPouzivatela");
        String uzivatelskeMeno = "admin";
        String heslo = "asd";
        MySqlPouzivatelDao instance = new MySqlPouzivatelDao();
        Long expResult = null;
        Long result = instance.overPouzivatela(uzivatelskeMeno, heslo);
        assertTrue(result>0);
        
    }
    
}
