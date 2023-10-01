
import java.util.Random;
import java.util.Scanner;
public class JuegoPiedraPapelTijeras
{
    private int puntajeJugador;
    private int puntajeComputadora;
    
    public JuegoPiedraPapelTijeras(){
    this.puntajeJugador=0;
    this.puntajeComputadora=0;
    }
    
    public void Jugar(){
    Scanner scanner= new Scanner(System.in);
    Random randon =new Random();
    System.out.println("Bienvenido ");
    System.out.println("Puedes elegir: Piedra, Papel o Tijeras. Para salir, escribe 'Salir'." );
    
    while(true){
    System.out.println("Elige tu jugada ");
    String eleccionJugador=scanner.nextLine().toLowerCase();
    if(eleccionJugador.equals("salir")){
     break;
    }
    if (!eleccionJugador.equals("piedra") && !eleccionJugador.equals("papel") && !eleccionJugador.equals("tijeras")) {
     System.out.println("Elección no válida. Por favor, elige Piedra, Papel o Tijeras.");
     continue;
            }
    
      int numeroAleatorio=randon.nextInt(3);
      String eleccionComputadora=obtenerEleccionComputadora(numeroAleatorio);
      System.out.println("La computadora elijio : "+ eleccionComputadora);
      String resultado = determinarGanador(eleccionJugador, eleccionComputadora);
      System.out.println(resultado);
       
      if(resultado.equals("Ganaste")){
        puntajeJugador++;
        }else if(resultado.equals("La computadora gano")){
        puntajeComputadora++;
        }
      System.out.println("Puntaje actual - Jugador: " + puntajeJugador + " | Computadora: " + puntajeComputadora);
           }

        System.out.println("Gracias por jugar.");
        scanner.close();
    }
 
  public String obtenerEleccionComputadora(int numeroAleatorio){
    switch(numeroAleatorio){
    case 0:
        return "Piedra";
    case 1:
        return "Papel";
    case 3:
        return "Tijera";
        default:
            return "";
    }
    }
    public String determinarGanador(String eleccionJugador, String eleccionComputadora){
    if(eleccionJugador.equals(eleccionComputadora)){
    return "Empate";
    }else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("Tijeras"))
                || (eleccionJugador.equals("papel") && eleccionComputadora.equals("Piedra"))
                || (eleccionJugador.equals("tijeras") && eleccionComputadora.equals("Papel"))) {
            return "Ganaste";
    }else{
    return "La computadora gano";
    }
    }
}
