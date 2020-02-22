package Logika;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bojan Petrovic
 */

public class RegisterLogikaTest {
    
    public RegisterLogikaTest() {
    }

    @Test
    public void testUnetiUbazu() throws Exception {
        String ime = "";
        String prezime = "";
        RegisterLogika.unetiUbazu(ime, prezime);

    }
    
    @Test
    public void testUnetiUbazu1() throws Exception {
        String ime = "ime";
        String prezime = "prezime";
        RegisterLogika.unetiUbazu(ime, prezime);

    }
    
    
}
