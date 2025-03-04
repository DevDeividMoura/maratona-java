## 📌 Conceitos de Arrays
**Data:** _02/03/2025_ e _03/03/2025_   
**Objetivo**: Compreender a estrutura e funcionamento dos arrays em Java, incluindo sua alocação de memória e inicialização.

### 📚 Conceitos Aprendidos

- <details>
    <summary><b>✅ Definição de Arrays </b></summary>

  - Um **array** é uma estrutura que armazena vários elementos do **mesmo tipo**.
  - Ele é um **objeto** que referencia um bloco contíguo de memória.
  - O tamanho do array é **fixo** após a sua criação.

  - Exemplo:
    ```java
    int[] numbers = {1, 2, 3, 4, 5};
    ```
  </details>

- <details>
    <summary><b>✅ Alocação de Memória </b></summary>

  - Quando um array é criado, o Java aloca um bloco contíguo de memória para armazenar seus elementos.
  - O nome do array é uma **referência** ao objeto que armazena os elementos.
  - Arrays de **tipos primitivos** armazenam diretamente os valores.
  - Arrays de **objetos** armazenam **referências** aos objetos.

  - Exemplo de array de objetos:
    ```java
    String[] names = new String[3]; // Array de Strings inicializado com null
    names[0] = "Goku"; // Agora a posição 0 referencia um objeto String
    ```
  </details>

- <details>
    <summary><b>✅ Inicialização de Arrays </b></summary>

  - Um array pode ser inicializado de diferentes formas:
    - Declaração com valores:
      ```java
      int[] ages = {21, 15, 11};
      ```
    - Declaração com tamanho fixo:
      ```java
      int[] numbers = new int[3]; // Inicializado com valores padrão (0 para inteiros)
      ```
    - Declaração e inicialização separadas:
      ```java
      String[] names;
      names = new String[]{"Goku", "Vegeta", "Gohan"};
      ```
  </details>

- <details>
    <summary><b>✅ Arrays Multidimensionais </b></summary>

  - Arrays podem ter mais de uma dimensão (matrizes).
  - Exemplo de um array bidimensional:
    ```java
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    ```
  - Para acessar elementos:
    ```java
    System.out.println(matrix[1][2]); // Saída: 6
    ```
  </details>

### 💻 Implementação Prática
- Código completo pode ser acessado no arquivo:
  - 📦 [Topic06_Arrays.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/introduction/Topic06_Arrays.java)

### 🔍 Observações
- Arrays são referências para objetos na memória.
- O tamanho de um array não pode ser alterado após a inicialização.
- Arrays de tipos primitivos armazenam os valores diretamente.
- Arrays de objetos armazenam referências para os objetos reais.
- Para percorrer arrays, é comum o uso do `for` ou `foreach` (`for-each`).