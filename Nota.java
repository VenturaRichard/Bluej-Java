
/**
 Crea una clase
Nota con 4 atributos (nota1, nota2, nota3, nota4) crear 2 métodos el primer
 método tendrá quemostrar la nota menor y el segundo la nota mayor
 */
public class Nota
{
   int nota1;
  int nota2;
  int nota3;
  int nota4;
  public Nota(int nota1,int nota2,int nota3,int nota4){
  this.nota1=nota1;
  this.nota2=nota2;
  this.nota3=nota3;
  this.nota4=nota4;
    }
    
    public int NotaMenorCiclos(){
      int  notaMenor=nota1;
      if(nota2<notaMenor){
        notaMenor=nota2;
        }
      if(nota3<notaMenor){
       notaMenor=nota3;
        }
      if(nota4<notaMenor){
       notaMenor=nota4;
      }
        return notaMenor;
    
    }
    public int Notamayor(){
    int notaMayor=nota1;
    if(nota2>notaMayor){
    notaMayor=nota2;
    }
    if(nota3>notaMayor){
    notaMayor=nota3;
    }
    if(nota4>notaMayor){
    notaMayor=nota4;
    }
    return notaMayor;
    }
}
