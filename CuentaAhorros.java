

public class CuentaAhorros extends Cuenta
{
    boolean activa;
    
    public CuentaAhorros(float saldo,float tasa){
    super(saldo,tasa);
    if(saldo<10000){
    activa=false;
    }else{
    activa=true;
    }
    }
    public void retirar(Float cantidad){
    if(activa){
        super.retirar(cantidad);
    }
    }
    public void consignar(float cantidad){
    if(activa){
    super.consignar(cantidad);
    }
    }
    public void extractoMensual(){
    if(numerosRetiros>4){
    comisionMensual=comisionMensual+(numerosRetiros-4)*1000;
    }
    super.extractoMensual();
    if ( saldo < 10000 )
       activa = false;
    }
    public void imprimir() {
    System.out.println("Saldo = $ " + saldo);
    System.out.println("Comisión mensual = $ " + comisionMensual);
    System.out.println("Número de transacciones = " + (numeroConsignaciones + numerosRetiros));
    System.out.println();
    }
}
