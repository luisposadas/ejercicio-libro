
public class  Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    public Libro(String tituloi,String autori, int paginasi)
    {
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
        cadResultado = cadResultado + paginas;
        return cadResultado;
    }
}