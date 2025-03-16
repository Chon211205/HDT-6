import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Test1 {
    
    //Test para evaluar si el pokemon se encuentra dentro de la coleccion del usua
    @Test
    public void testAgregarPokemon() {
        Pokedex pokedex = new Pokedex();
        Pokemon Charmander = new Pokemon("Charmander", "Fire", "", "Blaze");
        pokedex.agregar_coleccionUser(Charmander);
        assertEquals(pokedex.Mostrar_coleccion("Charmander"));
    }

    //Test para ver que no se pueda agregar un pokemon que no existe.
    @Test
    public void testAgregarPokemonNoExiste() {
        Pokedex pokedex = new Pokedex();
        pokedex.agregar_coleccionUser("Si");
        assertEquals(pokedex.Mostrar_coleccion("si"));
        
    }


}
