
/**
 * Write a description of class Vaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaca extends Mamifero
{
    
    /**
     * Constructor for objects of class Vaca
     */
    public Vaca()
    {
        puntosVida = 100;
        peso = 15;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Muuuu, muuuu");
    }
    
    public void vacunar()
    {
        puntosVida += 30;
    }
    
}
