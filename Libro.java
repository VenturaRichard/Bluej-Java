
/**
 
 */
public class Libro
{
    int ISBN;
    String titulo;
    String autor;
    int numPaginas;
    
    public Libro(int ISBN,String titulo,String autor,int numPaginas){
    this.ISBN=ISBN;
    this.titulo=titulo;
    this.autor=autor;
    this.numPaginas=numPaginas;
    }
    
    public int getISBN(){
    return ISBN;
    }
    public void setISBN(int ISBN){
    this.ISBN=ISBN;
    }
    
    public String getTitulo(){
    return titulo;
    }
    public void setTitulo(String titulo){
    this.titulo=titulo;
    }
    
    public String getAutor(){
    return autor;
    }
    public void setAutor(String autor){
    this.autor=autor;
    }
    
     public int getNumPaginas(){
    return numPaginas;
    }
    public void setNumPagias(int numPaginas){
    this.numPaginas=numPaginas;
    }
    
    public void imprimir(){
    System.out.println(" El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numPaginas + " páginas ");
    }
    
    public void mayorPaginas(Libro libro){
    if(numPaginas>libro.getNumPaginas()){
    System.out.println("El libro " + titulo +" Tiene mayor numero de paginas:"+numPaginas);
    }else{
       System.out.println("El libro " + getTitulo() +" Tiene mayor numero de paginas:"+libro.getNumPaginas());
    }
    }
}
