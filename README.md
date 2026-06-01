# Oriented Programming Store

Projeto desenvolvido para praticar **Orientação a Objetos em Java**, simulando uma loja simples de peças de computador com menu interativo no terminal.

---

## Funcionalidades

- Adicionar peça (nome, marca e preço)
- Listar todas as peças cadastradas
- Ver o valor total das peças
- Buscar peça por parte do nome
- Remover peça pelo nome

---

## Estrutura do projeto

```
OrientedProgrammingStore/
├── Peca.java         — modelo de dados da peça (encapsulamento)
├── Computador.java   — lógica de gerenciamento das peças
└── Main.java         — menu e interação com o usuário
```

Cada classe tem uma responsabilidade única:

- **`Peca`** — guarda os dados de uma peça (nome, marca, preço) com atributos `private` e getters
- **`Computador`** — contém a lista de peças e os métodos para manipulá-la
- **`Main`** — responsável apenas pelo menu e por chamar os métodos do `Computador`

---

## Conceitos praticados

- Classes e objetos
- Encapsulamento (`private` + getters)
- Construtores
- `ArrayList` com tipo genérico
- Separação de responsabilidades entre classes
- Tratamento básico de exceção (`NumberFormatException`)

---

## Como executar

**Pré-requisito:** Java JDK 8 ou superior instalado.

```bash
# 1. Compilar os três arquivos
javac Peca.java Computador.java Main.java

# 2. Executar
java Main
```

---

## Exemplo de uso

```
=============================
   ORIENTED PROGRAMMING STORE
=============================
1 - Adicionar peca
2 - Listar pecas
3 - Ver valor total
4 - Buscar peca por nome
5 - Remover peca
0 - Sair
-----------------------------
Opcao: 1
Nome da peca: RTX 4060
Marca da peca: NVIDIA
Preco da peca: 2200
Peca adicionada com sucesso!
```
