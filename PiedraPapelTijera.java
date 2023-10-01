import java.util.Scanner;

public class PiedraPapelTijera
{
  Jugador jugador;
  Computadora computadora;
  
  public PiedraPapelTijera(){
    jugador=new Jugador("Jugador");
    computadora=new Computadora("Computadora");
    }
    
   public void jugar(){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Bienvenido a piedra, papel o tijeras ");
    while(true){
    jugador.realizarJugada();
    computadora.realizarJugada();
    System.out.println("La computadora eligió " + computadora.getJugada());
     Jugada jugadaJugador = jugador.getJugada();
     Jugada jugadaComputadora = computadora.getJugada();
     String resultado=determinarGanador(jugadaJugador,jugadaComputadora);
    System.out.println(resultado);
    System.out.print("¿Quieres jugar de nuevo? (s/n): ");
    String respuesta = scanner.nextLine().toLowerCase();
     if (!respuesta.equals("s")) {
     break;
     }
    }
    } 
   
    public String determinarGanador(Jugada jugadaJugador,Jugada jugadaComputadora){
    if(jugadaJugador.equals(jugadaComputadora)){
    return "Empate";
    }else if ((jugadaJugador.getNombre().equals("piedra") && jugadaComputadora.getNombre().equals("tijeras"))
                || (jugadaJugador.getNombre().equals("papel") && jugadaComputadora.getNombre().equals("piedra"))
                || (jugadaJugador.getNombre().equals("tijeras") && jugadaComputadora.getNombre().equals("papel"))) {
            return "¡Ganaste!";
        } else {
            return "¡La computadora ganó!";
        }
    }
}
