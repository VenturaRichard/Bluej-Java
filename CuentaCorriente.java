
public class CuentaCorriente extends Cuenta
{
   float sobregiro;
   public CuentaCorriente(float saldo,float tasa){
    super(saldo,tasa);
    sobregiro=0;
    }
    
    public void retirar(float cantidad){
    float resultado=saldo-cantidad;
    if(resultado<0){
    sobregiro=sobregiro-resultado;
    saldo=0;
    }else{
    super.retirar(cantidad);    }
    }
    
    public void consignar(float cantidad){
    float residuo=sobregiro-cantidad;
    if(sobregiro>0){
      if(residuo>0){
        sobregiro=0;
        saldo=residuo;
        }else{
         sobregiro=sobregiro-residuo;
         saldo=0;
        }
    }else{
        super.consignar(cantidad);
        } 
    }
    public void extractoMensual() {
super.extractoMensual(); // Invoca al método de la clase padre
}
/**
* Método que muestra en pantalla los datos de una cuenta corriente
*/
public void imprimir() {
System.out.println("Saldo = $ " + saldo);
System.out.println("Cargo mensual = $ " + comisionMensual);
System.out.println("Número de transacciones = " + (numeroConsignaciones + numerosRetiros));
System.out.println("Valor de sogregiro = $" + (numeroConsignaciones + numerosRetiros));
System.out.println();
}
}
