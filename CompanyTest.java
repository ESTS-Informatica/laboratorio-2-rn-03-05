import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Escreva uma descrição da classe CompanyTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{

    private Company company;
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;

    @Before
    public void setUp() {
        // Criar a instância da empresa
        company = new Company();

        // Criar os clientes
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");

        // Criar os vendedores
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    }

        
    }
    
