import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void cria( InputStream inputStream, String nomeArquivo ) throws Exception {

        // Leitura da imagem
        //InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));

        // Pegando a imagem da internet e transformando em figurinha
        //InputStream inputStream = new URL("https://img.ibxk.com.br/2020/11/05/05164134734379.jpg").openStream();
        BufferedImage imagemOriginal = ImageIO.read(inputStream);

        // Criar imagem com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;

        // quando a gente quer criar uma nova imagem vazia, com o fundo translucido.
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // Copiar a imagem original para a nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0, null);

        // Editando o tamanho da fonte do texto
        var fonte = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.yellow);
        graphics.setFont(fonte);

        // Escrever uma frase na nova imagem
        graphics.drawString("Sabia não", 100, novaAltura - 100);

        // Escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File("./saida/" + nomeArquivo));

    }


}
