
/**
 * Write a description of class Pollo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pollo extends Ave implements Vacuna
{

    /**
     * Constructor for objects of class Pollo
     */
    public Pollo()
    {
        puntosVida = 100;
        peso = 1;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Pio, pio");
    }
    
    public void vacunar()
    {
        puntosVida += 10;
    }
    
}