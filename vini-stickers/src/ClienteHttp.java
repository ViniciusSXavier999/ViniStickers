import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp {

   public String buscaDados (String url) {

    try {

         URI endereco = URI.create(url);

		// Biblioteca do java para fazer as requisões e obter as respostas.
		HttpClient client = HttpClient.newHttpClient();

		// GET é uma maneira de buscar dados de qualquer uri e url de um servidor http
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
	    String body = response.body();
        return body;

        /*
		 * O trecho de código acima a gente consumiu a API do themoviedb.
		 * esse trecho de código é para ir la no themoviedb e buscar o corpo da resposta, no caso o body. 
		 * 
		 */
		//---------------------------------------------------------------------------------

    } catch (IOException | InterruptedException ex) {
        throw new RuntimeException(ex);
}
   }
}
