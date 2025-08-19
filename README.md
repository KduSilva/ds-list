```markdown
#  DSList API

Projeto backend desenvolvido com **Spring Boot** para listar jogos com suas informações. A aplicação segue boas práticas de arquitetura em camadas, uso de DTOs, injeção de dependência via construtor e exposição de dados via API REST.

##  Funcionalidades

- Listagem de jogos via endpoint `/games`
- Retorno em formato JSON com os seguintes campos:
  - `id`
  - `title`
  - `year`
  - `genre`
  - `score`
  - `imgUrl`
  - `shortDescription`
- Conversão de entidades para DTOs com `stream().map()`
- Injeção de dependência via construtor no `GameService`
- Estrutura organizada em camadas: Controller, Service, Repository

##  Estrutura do projeto

```
com.eduardo.ds_list
├── controllers
│   └── GameController.java
├── dto
│   └── GameDTO.java
├── entities
│   └── Game.java
├── repositories
│   └── GameRepository.java
├── services
│   └── GameService.java
```

##  Endpoint

```
GET http://localhost:8080/games
```

##  Exemplo de retorno JSON

```json
[
  {
    "id": 1,
    "title": "Mass Effect Trilogy",
    "year": 2012,
    "genre": "Role-playing (RPG), Shooter",
    "score": 4.8,
    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/1.png",
    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit..."
  },
  {
    "id": 2,
    "title": "Red Dead Redemption 2",
    "year": 2018,
    "genre": "Role-playing (RPG), Adventure",
    "score": 4.7,
    "imgUrl": "https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/2.png",
    "shortDescription": "Lorem ipsum dolor sit amet consectetur adipisicing elit..."
  },
  ...
]
```

##  Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (para testes)
- Postman (para testes de API)

##  Próximos passos

- Implementar paginação e filtros por gênero ou nota
- Adicionar documentação com Swagger
- Criar testes unitários com JUnit e Mockito
- Desenvolver front-end com React para consumir a API

**Desenvolvido por Kdu**  
*Campo Grande - MS, Brasil*

```

---

