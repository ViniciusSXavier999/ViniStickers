import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExtratorDeConteudoThemoviedb implements ExtratorDeConteudo {
    
    public List<Conteudo> extraiConteudos(String json) {
        // extrair só os dados que interessam para gente no momento (titulo, poster,
        // classificação)
        var parser = new JsonParser();
        List<Map<String, String>> listaDeAtributos = parser.parse(json);

        List<Conteudo> conteudos = new ArrayList<>();

        // popular a lista de conteudos
        for (Map<String, String> atributos : listaDeAtributos) {
            String titulo = atributos.get("title");
            String urlImagem = "https://image.tmdb.org/t/p/w500"+atributos.get("backdrop_path");
            var conteudo = new Conteudo(titulo, urlImagem);

            conteudos.add(conteudo);

        }

        return conteudos;
    }

}
