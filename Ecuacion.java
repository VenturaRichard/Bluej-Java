
/**
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuaci�n de 2� grado.
Tendremos los 3 coeficientes como atributos, llam�mosles a, b y c.Hay que insertar estos 3 valores para construir el objeto.
Las operaciones que se podr�n hacer son las siguientes:obtenerRaices(): imprime las 2 posibles soluciones
 obtenerRaiz(): imprime �nica ra�z, que ser� cuando solo tenga una soluci�n posible.
 getDiscriminante(): devuelve el valor del discriminante (double), el discriminante tiene la siguiente formula, b2-4ac
 tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
 tieneRaiz(): devuelve un booleano indicando si tiene una �nica soluci�n, para que esto ocurra, el discriminante debe ser igual que 0.
 calcular(): mostrara por consola las posibles soluciones que tiene nuestra ecuaci�n, en caso de no existir soluci�n, mostrarlo tambi�n.
Formula ecuaci�n 2� grado:  (-b�?(b^2-4ac))/2a
Solo varia el signo delante de -b
 */
public class Ecuacion
{
    private double a;
    private double b;
    private double c;
    
    public Ecuacion( double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;
    }
    
    private double getDistrimiante(){
    return Math.pow(b,2)-4*a*c;
    }
    
    private boolean tieneRaiz(){
    if(getDistrimiante()==0){
    return true;
    }else{
    return false;
    }
    }
    private void obtenerRaiz(){
     if(tieneRaiz()){
        System.out.println("x :"+ -b/(2*a));
        }
    }
    private boolean tieneRaices(){
    if(getDistrimiante()>0){
    return true;
    }else{
    return false;
    }
   }
   private void obtenerRaices(){
      double discriminante=Math.pow(b,2)-4*a*c;
     if(tieneRaices()){
         double raiz1=(-b + Math.sqrt (discriminante))/(2*a);
         double raiz2=(-b - Math.sqrt (discriminante))/(2*a);
        System.out.println("x1 :"+raiz1 );
        System.out.println("x2 :"+raiz2);
        }
    }
    public void calcular(){
    
        if(tieneRaices()){
          obtenerRaices();
        }else{
          if(tieneRaiz()){
            obtenerRaiz();
            }else{
            System.out.println("No tiene solucion" );
            }
        }
    }
}
