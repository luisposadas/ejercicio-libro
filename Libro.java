
public class  Libro
{
  
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    public Libro(String tituloi,String autori, int paginasi)
    {
        numeroDeReferencia = "";
        titulo = tituloi;
        autor = autori;
        paginas = paginasi;
    }
    public String dimeAutor()
    {
        return autor;
    }
    public String dimeTitulo()
    {
        return titulo;
    }
    public int dimePaginas()
    {
        return paginas;
    }
    public String dimeDetalles()
    {
      
        String cadResultado = "";
        cadResultado = cadResultado + "Autor";
        cadResultado = cadResultado + ":";
        cadResultado = cadResultado + autor;
        cadResultado = cadResultado + "Titulo";
        cadResultado = cadResultado + ":";
        cadResultado = cadResultado + titulo;
        cadResultado = cadResultado + "Paginas";
        cadResultado = cadResultado + ":";
        cadResultado = cadResultado + paginas;
        
  
        if(numeroDeReferencia != ""){
            cadResultado = cadResultado + "numeroDeReferencia";
            cadResultado = cadResultado + ":";
            cadResultado = cadResultado + numeroDeReferencia;
  
        }
        else
        {
            cadResultado = cadResultado + "numeroDeReferencia";
            cadResultado = cadResultado + ":";
            cadResultado = cadResultado + "zzz";
        }
        return cadResultado;
        
    }
    public void cambiaNumRef(String numRefUsr)
    {
        numeroDeReferencia =  numRefUsr;
    }
     public String dimeNumRef()
     {
         return numeroDeReferencia;
        
     }
     
    
    
}
