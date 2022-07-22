import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Fazer uma conexão HTTP e buscar os tops 250 filmes
		String url = "https://api.themoviedb.org/3/trending/movie/week?api_key=be3cbf5bc6df7888a10486d07924c7b9";

		URI endereco = URI.create(url);

		// Biblioteca do java para fazer as requisões e obter as respostas.
		HttpClient client = HttpClient.newHttpClient();

		// GET é uma maneira de buscar dados de qualquer uri e url de um servidor http
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	    String body = response.body();
	    
	    

		// extrair só os dados que interessam para gente no momento (titulo, poster,
		// classificação)
	    var parser = new JsonParser();
	    List<Map<String, String>> listaDeFilmes = parser.parse(body);
        

		// exibir e manipular os dados da forma que a gente quiser
        for (Map<String,String> filme : listaDeFilmes) {

			String urlImagem = "https://image.tmdb.org/t/p/w500"+filme.get("backdrop_path");
			String titulo = filme.get("title");
			InputStream inputStream = new URL(urlImagem).openStream();

			String nomeArquivo = titulo + ".png" + ".jpg";

			var geradora = new GeradorDeFigurinhas();
			geradora.cria(inputStream, nomeArquivo);
			
			System.out.println(filme.get("title")); 
			System.out.println();
            //System.out.println();    
            //System.out.println(); 
            //System.out.println(filme.get("vote_average")); 
            //System.out.println();     
        }
    }
}
