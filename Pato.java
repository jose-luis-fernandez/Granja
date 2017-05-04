
/**
 * Write a description of class Pato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pato extends Ave
{
    
    /**
     * Constructor for objects of class Pato
     */
    public Pato()
    {
        puntosVida = 100;
        peso = 2;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Cua, cua");
    }
    
}