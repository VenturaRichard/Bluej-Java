/**
Crea una clase
Venta
 con sus atributos (Nombre de producto, cantidad, precio) y con los métodos informar yvender.
 El método vender tendrá que mostrar un mensaje indicando si se realizará un descuento o no
 (Se realizaráun descuento al producto que tenga el precio > S/. 1000)
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
