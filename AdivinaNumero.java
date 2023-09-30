
/**

 */
import java.util.Random;
import java.util.Scanner;
public class AdivinaNumero
{
   int numeroSecreto;
   int intentos;
   boolean adivinado;
   
   public AdivinaNumero(){
    Random random=new Random();
    this.numeroSecreto=random.nextInt(100)+1;
    this.intentos=0;
    this.adivinado=false;
    }
    
    public void jugar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido a Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        
      while(adivinado==false){
        int intento = scanner.nextInt();
        intentos++;
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
        }
          scanner.close();
        }
    }

