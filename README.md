# API REST com Spring Boot e Java

## 📌 Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST construída com Java e Spring Boot, utilizando os recursos e facilidades oferecidos pelo framework. O principal objetivo foi a implementação de um CRUD (Create, Read, Update e Delete) para o gerenciamento de produtos de uma pizzaria.

O projeto foi desenvolvido como parte da disciplina de Programação Orientada a Objetos, do curso de Ciência da Computação da UNIP – Campus Marquês, com foco na aplicação prática dos conceitos de orientação a objetos e desenvolvimento backend.

🛠️ Tecnologias utilizadas
<ul>
  <li>Spring Boot</li>
  <li>Spring Web</li>
  <li>Spring Boot DevTools</li>
  <li>Spring Data JPA</li>
  <li>H2 Database</li>
  <li>Lombok</li>
</ul>

## 🔗 Endpoints da API

A API disponibiliza endpoints REST para o gerenciamento de produtos da pizzaria, permitindo operações de criação, consulta, atualização e exclusão (**CRUD**).

### 📦 Produtos

| Método  | Endpoint            | Descrição                         |
|--------|---------------------|-----------------------------------|
| POST   | `/products`         | Cadastra um novo produto e suas variações         |
| GET    | `/products`         | Lista todos os produtos           |
| GET    | `/products/{id}`    | Busca um produto pelo ID          |
| PUT    | `/products/{id}`    | Atualiza um produto existente     |
| DELETE | `/products/{id}`    | Remove um produto pelo ID         |

---

### 📝 Exemplo de JSON (Produto)

```json
[
    {
        "id": 1,
        "name": "Pizza Marguerita",
        "description": "Experimente a nossa deliciosa Pizza Marguerita, feita com ingredientes frescos e de alta qualidade. Esta pizza clássica apresenta uma crosta crocante, molho de tomate suculento, queijo mussarela derretido e folhas de manjericão frescas. O sabor simples e delicioso da Marguerita é perfeito para qualquer ocasião. Peça agora e desfrute de uma fatia da Itália no conforto da sua casa!",
        "category": "PIZZA",
        "productVariations": [
            {
                "id": 1,
                "sizeName": "P",
                "description": "6 fatias",
                "price": 30.00,
                "available": true
            },
            {
                "id": 2,
                "sizeName": "M",
                "description": "8 fatias",
                "price": 40.00,
                "available": true
            }
        ],
        "available": true
    }
]
```

📍 Observações

A API segue o padrão REST

As requisições e respostas utilizam JSON

O banco de dados H2 é utilizado para facilitar testes e desenvolvimento
