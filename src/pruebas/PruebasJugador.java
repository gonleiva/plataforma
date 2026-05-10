package pruebas;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import src.Jugador;
import static org.junit.Assert.assertEquals;

public class PruebasJugador {

    @Test
    public void crearUnJugadorMeDevuelveUnObjetoDistintoDeNull(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(true,jugador!=null);
    }
    @Test
    public void elMetodoObtenerNombreMeDevuelveElNombreDelJugador(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals("gonzalo",jugador.obtenerNombre());
    }
    @Test
    public void elMetodoObtenerPosicionMeDevuelveLaPosicionX(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(0,jugador.obtenerPosicionX());
    }
    @Test
    public void elMetodoObtenerPosicionMeDevuelveLaPosicionY(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(0,jugador.obtenerPosicionY());
    }
    @Test
    public void elMetodoMoverALaDerechaAumentaLaPosicionEnUno(){
        Jugador jugador=new Jugador("gonzalo");
        jugador.moverALaDerecha();
        assertEquals(1,jugador.obtenerPosicionX());
    }
    @Test
    public void elMetodoMoverALaIzquierdaDisminuyeLaPosicionEnUno(){
        Jugador jugador=new Jugador("gonzalo");
        jugador.moverALaIzquierda();
        assertEquals(-1,jugador.obtenerPosicionX());
    }
    @Test
    public void elMetodoMoverAbajoAumentaLaPosicionEnUno(){
        Jugador jugador=new Jugador("gonzalo");
        jugador.moverAbajo();
        assertEquals(1,jugador.obtenerPosicionY());
    }
    @Test
    public void elMetodoMoverArribaDisminuyeLaPosicionEnUno(){
        Jugador jugador=new Jugador("gonzalo");
        jugador.moverArriba();
        assertEquals(-1,jugador.obtenerPosicionY());
    }
    @Test
    public void elMetodoObtenerPuntajeMeDevuelveElPuntaje(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(0,jugador.obtenerPuntaje());
    }
    @Test
    public void elMetodoObtenerVidaMeDevuelveLaVida(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(100,jugador.obtenerVida());
    }
    @Test
    public void elMetodoObtenerDañoMeDevuelveElDaño(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(10,jugador.obtenerDaño());
    }
    @Test
    public void elMetodoObtenerVelocidadMeDevuelveLaVelocidad(){
        Jugador jugador=new Jugador("gonzalo");
        assertEquals(10,jugador.obtenerVelocidad());
    }

}
