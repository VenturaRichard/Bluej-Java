
/**
Notas con array
 */
public class NotaArray
{
    double [] notas;
    
    public NotaArray(double nota1,double nota2,double nota3,double nota4){
    notas =new double[]{nota1,nota2,nota3,nota4};
    }
    
    public double notaMenor(){
    double menor=notas[0];
    for(int i=1;i<notas.length;i++){
    if(notas[i]<menor){
    menor=notas[i];
    }
    }
    return menor;
    }
    
    public double notaMayor(){
    double mayor=notas[0];
    for(int i=0;i<notas.length;i++){
    if(notas[i]>mayor){
    mayor=notas[i];
    }
    }
    return mayor;
    }
}
