<h1 align="center">Sistema de cadastro de usuários</h1>

<h2 align="center">Descrição do projeto</h2>
<p align="center"> Sistema básico de cadastro de usuários, baseado na arquitetura DTO (Data transfer Object).</p>
  
<h2 align="center">Funções disponíveis na aplicação</h2>
<p align="center">Cadastro, consulta, alteração e deleção através da interface Swagger e banco em memória H2</p>

<h2 align="center">Tecnologias utilizadas</h2>
<ul>
  <li>Java JDK versão 8 como linguagem de programação</li>
  <li>IntelliJ IDEA como IDE de desenvolvimento</li>
  <li>Spring Boot framework</li>  
  <li>Maven como gerenciador de dependências</li>
</ul> 

<h2 align="center">Como executar a aplicação</h2>
<ul>
  <li>É necessário ter o Git SCM instalado </li>
  <li>Com o Git instalado, use o git bash here no diretório que deseja instalar o projeto</li>
  <li>Com o terminal aberto, digitar: git clone LinkDoRepositorio.git</li>
  <li>Com o repositório já clonado, execute a IDE de sua preferência e abra a pasta onde o projeto está instalado</li>
</ul>

<h2 align="center">Observações</h2>
<ul>
  <li>As configurações do banco H2 estão no arquivo application.properties. Username= admin, Password= admin</li>
  <li>As inserções contidas no arquivo import.sql preenchem o database assim que o projeto é iniciado.</li>
  <li>Os métodos de requisições HTTP podem ser testados através do Swagger.</li>
  <li> Link para usar o Swagger: localhost:8080/swagger-ui.html#/</li>
  <li>Link para o banco H2: localhost:8080/h2-console</li>
</ul>
