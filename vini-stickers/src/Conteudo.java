public class Conteudo {

    private final String titulo;
    private final String urlImagem;

    

    //metodo construtor
    public Conteudo(String titulo, String urlImagem) {
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }
    //Uma maneira de expor esses atributos la para fora.
    public String getTitulo() {
        return titulo;
    }
    public String getUrlImagem() {
        return urlImagem;
    }

    
   
    

    
    
}
