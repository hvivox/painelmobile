# PAINEL-MOBILE
Este repositório contém o projeto "painelmobile", que é uma API para integração de informações 
entre um portal institucional e uma aplicação mobile. 
O sistema também possui um sistema web integrado para cadastro de informações como eventos, parceiros e outros. 
Foi desenvolvido em Java, JSF, PrimeFaces, CDI, Jersey e Jackson.

| :placard: Vitrine.Dev |                                                                                                         |
|-----------------------|---------------------------------------------------------------------------------------------------------|
| :sparkles: Nome       | **painel mobile**                                                                                        |
| :label: Tecnologias   | Java, JSF, PrimeFaces, CDI, Jersey e Jackson                                                            |
| :rocket: URL          | https://localhost:8080/painelmobile                                                                     |
| :fire: Desafio        | Atender a necessidade de uma empresa na integração entre portal institucional x api x aplicativo mobile |

<!-- Inserir imagem com a #vitrinedev ao final do link -->
![](https://github.com/hvivox/painelmobile/blob/main/painelmobile.png?raw=true#vitrinedev)

<!--  
<p align="center">
<a href="https://laravel.com" target="_blank">
<img width="200" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
</a>
</p>
-->

## Requisitos do Sistema
- Java
- Tomcat 9

## Configuração do Ambiente de Desenvolvimento
1. Clone este repositório: `git clone https://github.com/hvivox/painelmobile.git`
2. Navegue até o diretório do projeto: `cd painelmobile`
3. Importe o projeto em sua IDE de desenvolvimento preferida.
4. Configure as dependências necessárias para o projeto.
5. Certifique-se de ter o Tomcat 9 instalado e configurado em seu ambiente de desenvolvimento.

## Configuração do Upload de Arquivos
1. Crie um arquivo chamado `painelmobile#webservice#imagem#cardapio.xml`.
2. Dentro do arquivo, adicione o seguinte conteúdo:
```xml
<Context docBase="C:\Program Files\PainelMobileImagem\cardapio" />
```
3. Altere o caminho `C:\Program Files\PainelMobileImagem\cardapio` para o diretório onde deseja fazer o upload dos arquivos.

## Implantação
1. Certifique-se de ter configurado corretamente o ambiente de desenvolvimento.
2. Faça o build do projeto.
3. Copie o arquivo WAR gerado para o diretório `webapps` do Tomcat.
4. Inicie o Tomcat.

## Uso
1. Acesse o sistema através do navegador web no endereço `http://localhost:8080/painelmobile`.
2. Utilize a API para integrar informações entre o portal institucional e a aplicação mobile.
3. Utilize o sistema web integrado para cadastrar eventos, parceiros e outras informações.



