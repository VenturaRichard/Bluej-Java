/**
Crea una clase
Venta
 con sus atributos (Nombre de producto, cantidad, precio) y con los m�todos informar yvender.
 El m�todo vender tendr� que mostrar un mensaje indicando si se realizar� un descuento o no
 (Se realizar�un descuento al producto que tenga el precio > S/. 1000)
 */
public class Venta
{
   String nombre;
   int cantidad;
   double precio;


public Venta(String nombre,int cantidad,double precio){
this.nombre=nombre;
this.cantidad=cantidad;
this.precio=precio;
}

public void vender(){
if(precio>1000){
System.out.println("Descuento");
}else{
System.out.println("No hay Descuento");
}
}

public String informar(){
return "venta{"+ "Nombre : "+ nombre +" Cantidad :"+ cantidad +" Precio :"+precio+"}";
}
}
