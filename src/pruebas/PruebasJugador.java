package pruebas;
import org.junit.Test;
import src.Jugador;
import static org.junit.Assert.assertEquals;

public class PruebasJugador {
    @Test
    public void crearUnJugadorMeDevuelveUnObjetoDistintoDeNull(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(true,jugador!=null);
    }
}
