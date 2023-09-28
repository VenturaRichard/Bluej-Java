
/**
  
Dado el siguiente conjunto de valores (2, 5, -3, 0, 2, 4, -6, -10, -1, 7) crear 2 métodos el 
cual el primero métodotiene que mostrar la suma de los valores positivos y el segundo tendrá 
que mostrar la suma de los valores negativos
 */
public class Valores
{
     int [] valor={2, 5, -3, 0, 2, 4, -6, -10, -1, 7};
    
    public Valores(){
    }
    
    public int sumaPositivos(){
    int suma=0;
    for(int i=0;i<valor.length;i++){
    if(valor[i]>0){
    suma=suma+valor[i];
    }
    }
    return suma;
    }
    
    public int sumaNegativos(){
    int suma=0;
    for(int i=0;i<valor.length;i++){
    if(valor[i]<0){
    suma=suma+valor[i];
    }
    }
    return suma;
    }

}
