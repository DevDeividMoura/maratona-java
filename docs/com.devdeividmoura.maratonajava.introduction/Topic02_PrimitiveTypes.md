## 📌 Tipos Primitivos
**Data:** _25/02/2025_  
**Objetivo**: Compreender o conceito de variáveis e os tipos primitivos em Java, incluindo as suas características, tamanhos em memória e conversões entre tipos.

### 📚 Conceitos Aprendidos

- <details>
      <summary><b> ✅ O que é uma variável? </b></summary>

    - Uma variável é um espaço reservado na memória para armazenar um valor que pode ser utilizado e manipulado ao longo do programa.
  </details>

- <details>
      <summary><b> ✅ Convenção de nomenclatura para variáveis </b></summary>

    - O nome deve ser descritivo e seguir a convenção `camelCase`.
    - Exemplo: `idade`, `precoProduto`, `quantidadeEstoque`.
    - Não pode começar com números e não pode conter espaços.
  </details>

- <details>
      <summary><b> ✅ Os 8 tipos primitivos em Java </b></summary>

    - Todos devem ser escritos em letras minúsculas.
    - Tipos numéricos inteiros: `byte`, `short`, `int`, `long`.
    - Tipos numéricos com casas decimais: `float`, `double`.
    - Tipo lógico: `boolean` (`true` ou `false`).
    - Tipo caractere: `char`, que pode ser representado por uma letra entre aspas simples (`'A'`), um número ASCII ou um código Unicode.

  </details>

- <details>
  <summary><b> ✅ Tamanho em memória dos tipos primitivos </b></summary>

  | Tipo      | Tamanho  | Faixa de valores armazenáveis                          | Valor Padrão |
  |-----------|---------|---------------------------------------------------------|--------------|
  | `byte`    | 1 byte  | -128 a 127                                              | 0            |
  | `short`   | 2 bytes | -32.768 a 32.767                                        | 0            |
  | `int`     | 4 bytes | -2.147.483.648 a 2.147.483.647                          | 0            |
  | `long`    | 8 bytes | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807  | 0L           |
  | `float`   | 4 bytes | 3.4e−038 a 3.4e+038                                     | 0.0F         |
  | `double`  | 8 bytes | 1.7e−308 a 1.7e+308                                     | 0.0D         |
  | `boolean` | 1 bit   | `true` ou `false`                                       | `false`      |
  | `char`    | 2 bytes | Representa um único caractere                           | `\u0000`     |

  </details>

- <details>
      <summary><b> ✅ Conversão de tipos (Casting) </b></summary>

  - **Conversão implícita:** Quando um tipo menor é convertido automaticamente para um tipo maior.
     ```java
     int number = 10;
     double decimalNumber = number; // Conversão implícita de int para double
     ```  
  - **Conversão explícita:** Necessária quando um tipo maior precisa ser convertido para um menor.
    ```java
    double value = 9.99;
    int integerValue = (int) value; // Perde a parte decimal (9)
    ```  
  </details>

- <details>
      <summary><b> ✅ Strings </b></summary>

    - Strings devem estar entre **aspas duplas** (`"texto"`).
    - Aspas simples (`'c'`) são usadas apenas para **caracteres literais** (`char`).
    - **String não é um tipo primitivo**, mas sim um objeto; por isso, começa com `S` maiúsculo.
    - Exemplo:
      ```java
      String name = "DevDeividMoura";
      char nameInitial  = 'D';
      ```  
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo neste arquivo:
  - 🔢 [Topic02_PrimitiveTypes.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/introduction/Topic02_PrimitiveTypes.java)

### 🔍 Observações
- As variáveis numéricas podem ter valores negativos ou positivos, exceto `char` e `boolean`.
- O uso correto dos tipos pode economizar memória e melhorar o desempenho do programa.  
