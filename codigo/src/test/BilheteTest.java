package test;

import static org.junit.Assert.*;
import org.junit.Test;

import domain.Bilhete;

public class BilheteTest {

    @Test
    public  void testBilheteConstructor() {
        Bilhete bilhete = new Bilhete("João", "Silva", "123456789", 1000.0, "domestico");

        assertEquals("João", bilhete.getNome());
        assertEquals("Silva", bilhete.getUltimoSobrenome());
        assertEquals("123456789", bilhete.getDocumento());
        assertEquals("domestico", bilhete.getTipoVoo());
    }

    @Test
    public void testValidarDocumentoDomesticoValido() {
        Bilhete bilhete = new Bilhete("João", "Silva", "123456789", 1000.0, "domestico");
        assertTrue(bilhete.getDocumento().matches("\\d{9}"));  
    }

    @Test
    public  void testValidarDocumentoInternacionalValido() {
        Bilhete bilhete = new Bilhete("Maria", "Souza", "AB123456", 2000.0, "internacional");
        assertTrue(bilhete.getDocumento().matches("[A-Z]{2}\\d{6}"));  
    }

    @Test
    public void testValidarDocumentoInvalido() {
        Bilhete bilhete = new Bilhete("João", "Silva", "invalid", 1000.0, "domestico");
        assertFalse(bilhete.getDocumento().matches("\\d{9}"));  
    }

    @Test
    public void testEmissaoBilheteSucesso() {
        Bilhete bilhete = new Bilhete("João", "Silva", "123456789", 1000.0, "domestico");
        bilhete.emissaoBilhete();  
    }

    @Test
    public void testEmissaoBilheteErroDocumento() {
        Bilhete bilhete = new Bilhete("João", "Silva", "invalid", 1000.0, "domestico");
        bilhete.emissaoBilhete();  
   }
}