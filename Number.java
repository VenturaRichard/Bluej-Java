
/**
 Crear una clase
(Number)
el cual contendr� 2 m�todos; Uno tendr�
 
que imprimir los n�meros impares que hayentre (0 - 20) y el otro tendr� que imprimir los n�meros pares (0-20)
 */
public class Number
{
    
    int inicio;
    int finala;
    public Number(int inicio,int finala){
    this.inicio=inicio;
    this.finala=finala;
    }
    
    public void imprimirPares(){
    for( int i=inicio;i<=finala;i++){
    if(i%2==0){
     System.out.println("Numeros pares : " +i );
    }
    }
    }
    
    public void imprimirimpares(){
    for(int i=inicio;i<=finala;i++){
    if(i%2==1){
     System.out.println("Numeros impares : " +i );
    }
    }
    }
}
