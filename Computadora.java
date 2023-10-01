import java.util.Random;
import java.util.Scanner;
public class Computadora
{
    String nombre;
    Jugada jugada;
    
    public Computadora(String nombre){
    this.nombre=nombre;
    }
    public void realizarJugada(){
    Random random =new Random();
    int numeroAleatorio=random.nextInt(3);
    switch(numeroAleatorio){
        case 0:
            jugada=new Jugada("piedra");
            break;
        case 1:
            jugada=new Jugada("papel");
            break;
        case 2:
            jugada=new Jugada("tijeras");
              break;
        case 3: 
            default:
              jugada=null;
              break;   
    }
    }
    
    public Jugada getJugada() {
        return jugada;
    }

    public String getNombre() {
        return nombre;
    }
}
