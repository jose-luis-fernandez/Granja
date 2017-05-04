/**
 * Abstract class Animal - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Animal
{
    protected int puntosVida;
    protected int peso;
    
    public abstract void comer();
    
    public abstract void emitirSonidoCaracteristico();
    
    public int getPeso()
    {
        return peso;
    }
    
    public int getPuntosDeVida()
    {
        return puntosVida;
    }
}