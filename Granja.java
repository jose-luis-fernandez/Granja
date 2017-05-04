
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Granja
     */
    public Granja()
    {
        // initialise instance variables
        x = 0;
    }
    
    public void comer(Animal animal)
    {
        animal.comer();
    }
    
    public void emitirSonidoCaracteristico(Animal animal)
    {
        animal.emitirSonidoCaracteristico();
    }
    
    public void vacunar(Vacuna vacuna)
    {
        vacuna.vacunar();
    }
    
    
}