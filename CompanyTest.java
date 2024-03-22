import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
/**
 * Escreva uma descrição da classe CompanyTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{

   private Company company;

    @Before
    public void setUp() {
        company = new Company();
    }

    @Test
    public void testConstructor() {
        
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    }
    
