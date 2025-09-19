# 🏦 Banco de Talentos API

Projeto de uma API REST para gerenciamento de um banco de talentos, desenvolvido em Java com Spring Boot. O objetivo foi construir um sistema robusto, escalável e alinhado com as melhores práticas de mercado, utilizando uma descrição de vaga de emprego como guia de requisitos técnicos.

## 🎯 Sobre o Projeto

Este projeto nasceu como um desafio pessoal para aplicar e aprofundar conhecimentos nas tecnologias mais requisitadas para desenvolvedores back-end Java. A aplicação permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) para gerenciar candidatos e suas habilidades.

## ✨ Tecnologias Utilizadas

A stack do projeto foi escolhida para refletir um ambiente de desenvolvimento moderno e profissional:

* **Linguagem:** Java 21
* **Framework:** Spring Boot 3
* **Banco de Dados:** MySQL (executando em Docker)
* **Cache:** Redis (executando em Docker)
* **Containerização:** Docker & Docker Compose
* **Versionamento:** Git & GitFlow
* **CI/CD:** GitHub Actions

## 🚀 Como Executar o Projeto

Graças ao Docker, o ambiente de desenvolvimento pode ser configurado com um único comando.

**Pré-requisitos:**
* [Git](https://git-scm.com/)
* [Docker](https://www.docker.com/) e [Docker Compose](https://docs.docker.com/compose/)

**Passo a passo:**

1.  **Clone o repositório:**
    ```bash
    git clone 
    cd seu-repositorio
    ```

2.  **Construa e inicie os containers:**
    Este comando irá construir a imagem da sua API, baixar as imagens do MySQL e Redis, e iniciar os três containers em conjunto.
    ```bash
    docker-compose up --build
    ```

3.  **Pronto!** A API estará rodando e acessível em `http://localhost:8080`.

## 📝 Endpoints da API

Você pode utilizar uma ferramenta como o [Postman](https://www.postman.com/) para testar os endpoints:

| Verbo | Endpoint | Descrição | Exemplo de Body |
| :--- | :--- | :--- | :--- |
| `POST` | `/candidatos` | Cria um novo candidato. | `{ "name": "Maria", "age": 30, "skill": "React" }` |
| `GET` | `/candidatos` | Retorna a lista de todos os candidatos. | |
| `GET` | `/candidatos/{id}` | Busca um candidato específico pelo ID. | |
| `PUT` | `/candidatos/{id}` | Atualiza um candidato existente. | `{ "name": "Maria Silva", "age": 31, "skill": "React e NodeJS" }` |
| `DELETE`| `/candidatos/{id}` | Deleta um candidato pelo ID. | |
