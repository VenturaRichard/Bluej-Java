
/**

 */
import java.util.Random;
import java.util.Scanner;
public class AdivinaNumero
{
   int numeroSecreto;
   int intentos;
   boolean adivinado;
   int maxIntentos;
   String jugadorConMasIntentos;
   public AdivinaNumero(){
    Random random=new Random();
    this.numeroSecreto=random.nextInt(100)+1;
    this.intentos=0;
    this.adivinado=false;
    this.maxIntentos=0;
    this.jugadorConMasIntentos="";
    }
    
    public void jugar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        
      while(adivinado==false){
        intentos++;
        int intento = scanner.nextInt();
        if(intentos<=20){
         System.out.println("Intentos:"+intentos);
        if(intento==numeroSecreto){
        System.out.println("Acerto al numero");
        adivinado=true;
        
        }else{
            if(intento>numeroSecreto){
            System.out.println("Numero ingresado mayor al numero secreto");
            adivinado=false;
            }else{
            System.out.println("Numero ingresado menor al numero secreto");
            adivinado=false;
            }
        }
        }else{
        System.out.println("Se acabo los intentos");
        }
        
      }
          scanner.close();
        }
    public void intentoMax(AdivinaNumero adivinaNumero){
        if(intentos>=adivinaNumero.intentos){
        System.out.println("jugador con intentos"+intentos);
        }else{
        System.out.println("Empate"+intentos);
        }
        
    }
        public static void main(String[] args) {
        AdivinaNumero juego = new AdivinaNumero();
        AdivinaNumero juego1 = new AdivinaNumero();
        juego.jugar();
        System.out.println(juego.jugadorConMasIntentos + " realizó la mayor cantidad de intentos: " + juego.maxIntentos);
        juego1.jugar();
        System.out.println(juego.jugadorConMasIntentos + " realizó la mayor cantidad de intentos: " + juego.maxIntentos);
    }
    }

