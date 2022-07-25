import java.io.InputStream;
import java.net.URL;
import java.util.List;

//String url = "https://api.nasa.gov/planetary/apod?api_key=FlpNpgHnWNpHjnBddwgAWos7BOQjzEcuXII8ZbXs&start_date=2022-06-12&end_date=2022-06-14";
public class App {
    public static void main(String[] args) throws Exception {
        
        // Fazer uma conexão HTTP e buscar os tops 250 filmes
		 String url = "https://api.themoviedb.org/3/trending/movie/week?api_key=be3cbf5bc6df7888a10486d07924c7b9";
		 ExtratorDeConteudo extrator = new ExtratorDeConteudoThemoviedb();


		//String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json";
		//ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

		var http = new ClienteHttp();
		String json = http.buscaDados(url);

		/*
		 * O trecho de código acima a gente consumiu a API do themoviedb.
		 * esse trecho de código e para ir la no themoviedb e buscar o corpo da resposta, no caso o body.
		 * 
		 * 
		 * Logo em seguida a gente passa para o JsonParser logo abaixo, que ele vai dar uma lista de filmes, logo depois.. 
		 * 
		 */
		//---------------------------------------------------------------------------------
	    
	    

		
        
		// a gente cria uma geradora de figurinhas 
		// exibir e manipular os dados da forma que a gente quiser
		
		List<Conteudo> conteudos = extrator.extraiConteudos(json);
		var geradora = new GeradorDeFigurinhas();

          for (int i = 0; i < 10; i++) {

            Conteudo conteudo = conteudos.get(i);

		
			InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
			String nomeArquivo = conteudo.getTitulo() + ".png";

			geradora.cria(inputStream, nomeArquivo);
			
			System.out.println(conteudo.getTitulo()); 
			System.out.println();
            //System.out.println();    
            //System.out.println(); 
            //System.out.println(filme.get("vote_average")); 
            //System.out.println();     
        }
    }
}
