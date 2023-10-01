
import java.util.Random;
import java.util.Scanner;
public class Jugada
{
    String nombre;
    
   public Jugada(String nombre){
    this.nombre=nombre;
    } 
   public String getNombre(){
    return nombre;
    } 
   @Override
    public String toString() {
        return nombre;
    }
}
