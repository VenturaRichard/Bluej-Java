

public class Cuenta
{
    float saldo;
    int numeroConsignaciones=0;
    int numerosRetiros=0;
    float tasaAnual;
    float comisionMensual=0;
    
    public Cuenta(float saldo,float tasaAnual){
    this.saldo=saldo;
    this.tasaAnual=tasaAnual;
    }
    
    public void consignar(float cantidad){
    saldo=saldo+cantidad;
    numeroConsignaciones=numeroConsignaciones+1;
    }
    public void retirar(float cantidad){
    float nuevoSaldo=saldo-cantidad;
    if(nuevoSaldo>=0){
    saldo=saldo-cantidad;
    numerosRetiros=numerosRetiros+1;
    }else{
    System.out.println("La cantida a retirar excede el saldo actual.");
    }
    }
    public void calcularInteres(){
    float tasaMensual=tasaAnual/12;
    float interesMensual=saldo*tasaMensual;
    saldo=saldo+interesMensual;
    }
    public void extractoMensual(){
    saldo=saldo-comisionMensual;
    calcularInteres();
    }
}
