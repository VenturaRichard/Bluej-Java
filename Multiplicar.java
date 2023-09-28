
/**
 Crear una clase multiplicar, la clase debe tener un atributo “valor” y un método “ejecutar” en donde se debe mostrar
la tabla de multiplicar del a
tributo “valor”.
 
 */
public class Multiplicar
{
       int valor;
    
  public Multiplicar(int valor){
    this.valor=valor;
 }
 
 public void ejecutar(){
    for(int i=1;i<=12;i++){
     System.out.println(i + "*"+ valor + "="+ i*valor );
    }
    }
}
