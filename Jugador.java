
import java.util.Scanner;
public class Jugador
{
   String nombre;
   Jugada jugada;
   
   public Jugador(String nombre){
    this.nombre=nombre;
    }
    
    public void realizarJugada(){
       Scanner scanner=new Scanner(System.in);
       System.out.print(nombre + ", elige tu jugada (piedra, papel o tijeras): ");
       while(true){
       String eleccion = scanner.nextLine().toLowerCase();
       if(eleccion.equals("piedra")||eleccion.equals("papel")||eleccion.equals("tijeras")){
       jugada=new Jugada(eleccion);
       break;
       }else {
        System.out.println("Jugada no válida. Elige piedra, papel o tijeras.");
        
        }
      }
    }
        public Jugada getJugada() {
        return jugada;
    }

    public String getNombre() {
        return nombre;
    }
    }
    

