# Projeto de Estudos em Spring Boot

Este é um projeto de estudos para aprender os conceitos e funcionalidades do framework Spring Boot.

## Tabela de Conteúdo
- [Sobre o Projeto](#sobre-o-projeto)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Pré-Requisitos](#pré-requisitos)
- [Instalação e Execução](#instalação-e-execução)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre o Projeto

Este projeto é um exemplo de aplicação web desenvolvida com o framework Spring Boot. O objetivo é demonstrar a utilização de alguns dos principais recursos e funcionalidades oferecidos pelo Spring Boot, como:

- Criação de APIs REST
- Integração com banco de dados (JPA, Hibernate)
- Segurança e autenticação (Spring Security)
- Testes unitários e de integração
- Configuração e gerenciamento de dependências
- Implantação em ambiente de produção

## Funcionalidades

- Cadastro, listagem, atualização e exclusão de usuários
- Autenticação de usuários
- Gerenciamento de tarefas (CRUD)
- Notificações por e-mail
- Relatórios e dashboard

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- H2
- Maven

## Pré-Requisitos

- Java 17 instalado
- PostgreSQL instalado e configurado

## Instalação e Execução

1. Faça o clone do repositório: `git clone https://github.com/muritadb/spring-api-studies`
2. Acesse o diretório do projeto: `cd spring-api-studies`
3. Crie o banco de dados PostgreSQL com o nome `spring-api-studies` ou qualquer nome da sua preferencia
4. Atualize as informações de conexão com o banco de dados no arquivo `application.properties`
5. Compile o projeto: `mvn clean install`
6. Inicie a aplicação: `mvn spring-boot:run`

A aplicação estará disponível em `http://localhost:8080`.


## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).