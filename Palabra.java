
/**
Crea una clase Palabra
el cual tendr� un atributo �valor� de tipo String, crear 1 m�todo
buscar el cual recibir� por par�metro un car�cter y tendr� que verificar si ese car�cter 
existe o no en el atributo
�
valor 
�
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
    System.out.println("S� existe el car�cter");
    }else{
    System.out.println("No existe el car�cter");
    }
    }
}
