# Imersão java 
# AULA 01 - CONSUMINDO UMA API DE FILMES COM JAVA

Boas-vindas! Chegou a hora de mergulhar em Java com a primeira Imersão Java da Alura!

Nesta primeira aula, vamos construir uma aplicação do zero para consumir a API do themoviedb e exibir os filmes mais populares, destacando seus pôsteres e visualizando sua classificação... Tudo isso sem usar nenhuma biblioteca externa!

## Resultado :tv:
![Aula 1](https://github.com/ViniciusSXavier999/Assets/blob/main/Imers%C3%A3o%20Java/Aula1.png)

## Material utilizado na aula :clipboard:

* Os [250 melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/).
* A [documentação da API do IMDB](https://imdb-api.com/api).
* Instalação do Visual Studio Code com o [Coding Pack para Java](https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java).
* Documentação da classe [HttpRequest do pacote java.net.http.](https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html).
* Classe pronta que utiliza Expressões Regulares para fazer [parse de um JSON](https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3).
* [Biblioteca Jackson, que faz parse de JSON](https://github.com/FasterXML/jackson).
* Site que ajuda a entender [Expressões Regulares](https://regex101.com/).
* Artigo: [Como deixar no seu GitHub com um README interessante](https://www.alura.com.br/artigos/escrever-bom-readme).
* O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY

## Material complementar Aula 1 

* Artigo na Alura [“O que é JSON?”](https://www.alura.com.br/artigos/o-que-e-json).
* Artigo na Alura sobre como [pintar o terminal, com tabelinha de cores e negrito](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis).
* Artigo na Alura sobre como usar [VS Code para codar em Java](https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code).

# AULA 02 - GERANDO FIGURINHAS PARA WHATSAPP

Boas-vindas! Esta é a segunda aula da Imersão Java.

Nesta segunda aula vamos criar um gerador de figurinhas explorando outras bibliotecas nativas do Java, para que possamos enviar por Whatsapp os nossos filmes preferidos!

## Resultado :crossed_swords:
![Aula 2](https://github.com/ViniciusSXavier999/Assets/blob/main/Imers%C3%A3o%20Java/Aula%202.png)

## Material utilizado na aula :clipboard:

* Documentação do [pacote javax.imageio, que trata de leitura e escrita de imagens](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html) 
* Documentação da [classe BufferedImage, que representa uma imagem no Java](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html)
* Documentação da classe [Graphics2D, a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original](https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html).
* Documentação da [abstração InputStream, que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html).

## Material complementar Aula 2 

* Primeira aula do curso [“Java Polimorfismo: entenda herança e interfaces” da Alura](https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo).
* Apêndice da apostila [“Java e Orientação a Objetos” da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream](https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io).

# AULA 3 - LIGANDO AS PONTAS, REFATORAÇÃO E ORIENTAÇÃO A OBJETOS

Boas-vindas à terceira aula da Imersão Java!

Chegou o momento de pegarmos os filmes do IMDb e gerar figurinhas com os pôsteres, aproveitando para melhorar nosso código com as refatorações necessárias para torná-lo mais flexível e fácil de entender.

## Resultado :crossed_swords:
![Aula 3](https://github.com/ViniciusSXavier999/Assets/blob/main/Imers%C3%A3o%20Java/Aula3.png)

## Material utilizado na aula :clipboard:

* Documentação das [APIs da NASA](https://api.nasa.gov/).
* API da [Foto Astronômica do dia da NASA](https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY).
* Artigo na Alura [“Como não aprender Java e Orientação a Objetos: getters e setters”](https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters).
* Livro [“Design Patterns”, de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código](https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612).
* Livro [“Refactoring”, de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672).

## Material complementar Aula 3

* Artigo na Alura [“Como não aprender Java e Orientação a Objetos: herança”](https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca).
* Podcast Hipsters.tech sobre [Práticas de Orientação a Objetos](https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453).
* Podcast Hipsters.tech sobre [Design Patterns](https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345).
* Podcast Hipsters.tech sobre [SOLID](https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649).

# AULA 04 - CRIANDO NOSSA PRÓPRIA API COM SPRING 

Boas-vindas à quarta aula da Imersão Java!

Agora vamos construir uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

## Material utilizado na aula :clipboard:

* [Documentação do Spring Framework](https://spring.io/).
* Link para [iniciar um projeto utilizando Spring](https://start.spring.io/).
* Link para [download do Maven](https://maven.apache.org/download.cgi).
* Link para [download do Postman](https://www.postman.com/).
* Página para fazer o [registro e começar a utilizar o MongoDb Atlas](https://www.mongodb.com/cloud/atlas/register).
* GitHub com os [logos das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos).
* Artigo sobre o [pack de stickers da Alura para Whatsapp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram).

## Material complementar Aula 4

* Primeira aula do curso [“Maven: gerenciamento de dependências e build de aplicações Java” da Alura](https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java).
* Alura+ [“O que é REST?”](https://www.youtube.com/watch?v=weQ8ssA6iBU).
* Artigo da Alura [“Conceito e fundamentos sobre REST”](https://www.alura.com.br/artigos/rest-conceito-e-fundamentos).
* Podcast [Hipsters.Tech sobre MongoDB](https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/).
* Hipters.Tube [“O que é SQL e NoSQL?”](https://www.youtube.com/watch?v=aure5d3B88g).
* Artigo da Alura [“Spring: Conheça esse framework Java”](https://www.alura.com.br/artigos/spring-conheca-esse-framework-java).
* Alura+ [Introdução ao Postman”](https://www.youtube.com/watch?v=op81bMbgZXs).

# AULA 05 - PUBLICANDO NOSSA API NO CLOUD

Boas-vindas à quinta e última aula da Imersão Java! Foi incrível ter você estudando com a gente durante esta semana... mas ainda temos mais um passo! Vamos lá?

Para fechar com chave de ouro, vamos tornar nossa aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem. Além disso, vamos gerar figurinhas a partir do conteúdo dessa nossa API.

## Material utilizado na aula :clipboard:

* [Dev em T: especialista x generalista](https://www.alura.com.br/dev-em-t).
* Site do [Heroku, que é um PaaS (plataforma como serviço)](https://id.heroku.com/login).
* Documentação sobre a [Oracle Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm).
* Artigo: [Como elaborar um bom arquivo Readme para os seus projetos](https://www.alura.com.br/artigos/escrever-bom-readme).

## Material complementar Aula 5

* Artigo da Alura [“Heroku, Vercel e outras opções de Cloud como plataforma”](https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma).
* Podcast Hipters.Tech [“Integração Contínua, Deploy Contínuo e Github Actions”](https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335).
* Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, [sobre o ecossistema Java em 2021](https://www.jetbrains.com/lp/devecosystem-2021/java/).













