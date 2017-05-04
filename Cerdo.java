
/**
 * Write a description of class Cerdo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cerdo extends Mamifero
{
    
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo()
    {
        puntosVida = 100;
        peso = 15;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Ñoinq, Ñoinq");
    }
    
    public void vacunar()
    {
        puntosVida += 20;
    }
    
}
