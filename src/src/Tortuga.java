package src;

public class Tortuga extends Personaje{
    public Tortuga(){
        daño=5;
        posicionX=0;
        posicionY=0;
        nombre="Tortuga";
        vida=100;
        velocidad=1;
    }

    @Override
    public void moverALaDerecha() {
        posicionX++;
    }
    @Override
    public void moverALaIzquierda() {
        posicionX--;
    }
    @Override
    public void moverAbajo() {
        posicionY++;
    }
    @Override
    public void moverArriba() {
        posicionY--;
    }
}
