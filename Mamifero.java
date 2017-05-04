/**
 * Abstract class Mamifero - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Mamifero extends Animal implements Vacuna
{
    public void comer()
    {
        peso += 2;
        puntosVida -= 10;
    }
}
