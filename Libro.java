
public class  Libro
{
    private int prestamos;
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    public Libro(String tituloi,String autori, int paginasi)
    {
        prestamos = 0;
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
        cadResultado = cadResultado + "num prestamos";
        cadResultado = cadResultado + ":";
        cadResultado = cadResultado + prestamos;
  
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
        int x = numRefUsr.length();
        if(x >= 3){
            numeroDeReferencia =  numRefUsr;
        }
    }
     public String dimeNumRef()
     {
         return numeroDeReferencia;
        
     }
    public void prestar()
    {
        prestamos += 1;
    }
    public int dimePrestamos()
     {
         return prestamos;
        
     }
    
    
}
