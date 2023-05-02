# API RESTful workshop-spring-boot-mongoDB
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/wesleyfsousa01/workshop-spring-boot-mongoDB/edit/master/LICENSE) 

# Sobre o projeto

Esta é uma aplicação construída durante o curso  **Java COMPLETO 2023 Programação Orientada a Objetos +Projetos** , promovido pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

**Objetivo geral:**
* Compreender as principais diferenças entre paradigma orientado a documentos e relacional
* Implementar operações de CRUD
* Refletir sobre decisões de design para um banco de dados orientado a documentos
* Implementar associações entre objetos
  * Objetos aninhados
  * Referências
* Realizar consultas com Spring Data e MongoRepository

**Descrição:**

A aplicação consiste em um sistema, onde é possivel realizar um CRUD de operações, inserção, recuperação, atualização e deleção, através do protocolo de comunicação HTTP e seus metodos, em um banco de dados não relacional (MongoDB), consumindo endpoints de uma API REST, criada usando o framework SpringBoot. Neste sistema os Usuarios ralizam postagens, e estes posts contém interações de outros usuarios, os comentários. 
Os diretorios se relacionam através de referências e aninhamento de dados.

## Endpoints
![GET/users](https://github.com/wesleyfsousa01/workshop-spring-boot-mongoDB/blob/master/assets/imagens/get-users.png)


![GET/posts?resquests](https://github.com/wesleyfsousa01/workshop-spring-boot-mongoDB/blob/master/assets/imagens/get-posts-requestparam.png)

## Modelo conceitual
![Modelo Conceitual](https://github.com/wesleyfsousa01/workshop-spring-boot-mongoDB/blob/master/assets/imagens/modelo-banco.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Implantação
- Banco de dados: MongoDB

# Como executar o projeto

Pré-requisitos: 
 * Java 18
 * MongoDB
 * MongoDBCompass
 * Maven

```bash
# clonar repositório
git clone https://github.com/wesleyfsousa01/workshop-spring-boot-mongoDB.git

# entrar na pasta do projeto
cd worshop-spring-boot-mongoDB

# executar o projeto
mvn spring-boot:run
```




# Autor

Wesley Ferreira

https://www.linkedin.com/in/wesley-fsa/
