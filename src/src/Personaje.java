package src;

public abstract class Personaje {
    protected String nombre;
    protected int posicionX;
    protected int posicionY;
    protected int vida;
    protected int daño;
    protected int velocidad;

    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerPosicionX(){
        return posicionX;
    }
    public int obtenerPosicionY(){
        return posicionY;
    }
    public abstract void moverALaDerecha();
    public abstract void moverALaIzquierda();
    public abstract void moverAbajo();
    public abstract void moverArriba();
    public int obtenerVida(){
        return vida;
    }
    public int obtenerDaño(){
        return daño;
    }
    public int obtenerVelocidad(){
        return velocidad;
    }

}
