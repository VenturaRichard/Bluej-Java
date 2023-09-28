
/**
Crea una clase Palabra
el cual tendrá un atributo “valor” de tipo String, crear 1 método
buscar el cual recibirá por parámetro un carácter y tendrá que verificar si ese carácter 
existe o no en el atributo
“
valor 
”
.
 */
public class Palabra
{
    String valor="hola";
    
    public Palabra(String valor){
    this.valor=valor;
    }
    
    public void buscar(char caracter){
    boolean encontrado=false; 
    for(int i=0;i<valor.length();i++){
    if(valor.charAt(i)==caracter){
      encontrado=true;
    break;
    }
    }
    if(encontrado){
    System.out.println("Sí existe el carácter");
    }else{
    System.out.println("No existe el carácter");
    }
    }
}
