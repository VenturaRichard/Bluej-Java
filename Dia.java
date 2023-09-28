/**
 Crea una clase Dia con un atributo “contenido” el cual debe de ser un arreglo donde 
 almacene todos los días dela semana y crea un 
 método mostrar el cual tendrá que imprimir todos los valores del atributo
“contenido” realizaresta función mediante un: While, for, do while
 */
public class Dia
{
    String[] contenido={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    
    public Dia(){
    
    }    
    
    public void mostrar(){
    for(int i=0;i<contenido.length;i++){
    System.out.println("Dia : " +contenido[i] );
    }
    }
    
     public static void main(String[] args) {
        Dia dia1 = new Dia();
        dia1.mostrar();
    }
}