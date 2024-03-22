import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Escreva uma descrição da classe PropertyTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

public class PropertyTest {
    @Test
     public void testConstructor() {
        // Dados de teste
        String description = "T3 Monte Belo";
        double price = 150000.0;

        // Criação do objeto Property
        Property property1 = new Property(description, price);

        // Verifica se os valores foram atribuídos corretamente
        assertEquals(description, property1.getDescription());
        assertEquals(price, property1.getPrice(), 0.001); 
    }
    
     @Test
    public void testToString() {
        // Dados de teste
        String description = "T3 Monte Belo";
        double price = 150000.0;

        // Criação do objeto Property
        Property property1 = new Property(description, price);

        // Verificação do método toString()
        String expectedString = "Descricao     : T3 Monte Belo\nPreco      : 150000.0 Euros";
        assertEquals(expectedString, property1.toString());
    }
    
}


