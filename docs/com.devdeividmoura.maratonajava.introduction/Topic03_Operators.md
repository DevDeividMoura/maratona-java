## 📌 Operadores
**Data:** _26/02/2025_ e _27/02/2025_  
**Objetivo**: Compreender os operadores aritméticos, comparativos, lógicos, atribuição, incremento e decremento em Java.

### 📚 Conceitos Aprendidos

- <details>
      <summary><b> ✅ Operadores Aritméticos </b></summary>

  - `+` (soma): pode realizar adição numérica ou concatenação de strings, dependendo da ordem.  
    Exemplo: `10 + 10 + "ola" + 20` resulta em `20ola20`.
  - `-` (subtração): realiza operações matemáticas de subtração.
  - `/` (divisão): cuidado com o tipo de dado; se ambos os operandos forem inteiros, o resultado será um inteiro.  
    Exemplo: `10 / 20 = 0`.
  - `*` (multiplicação): realiza operações matemáticas de multiplicação.
  - `%` (resto da divisão): retorna o resto de uma divisão inteira.
  </details>

- <details> <summary><b> ✅ Operadores Comparativos </b></summary>

  - Retornam valores booleanos (`true` ou `false`).
  - Em tipos primitivos, compara os valores reais. O Java realiza promoção de tipo automaticamente quando necessário.
  - Em objetos, compara as referências na memória. No caso de `==` deve-se usar `.equals()` para comparar o conteúdo.
  - Operadores disponíveis:
    - `<` (menor que)
    - `>` (maior que)
    - `<=` (menor ou igual a)
    - `>=` (maior ou igual a)
    - `==` (igual a)
    - `!=` (diferente de)
  </details>

- <details>
      <summary><b> ✅ Operadores Lógicos </b></summary>

  - Sempre retornam valores booleanos.
  - São utilizados para combinar expressões condicionais.
  - Operadores disponíveis:
    - `&&` (AND): verdadeiro se ambas as expressões forem verdadeiras.
    - `||` (OR): verdadeiro se pelo menos uma das expressões for verdadeira.
    - `!` (NOT): inverte o valor booleano da expressão.
  - Exemplo:
    ```java
    boolean condicao1 = true;
    boolean condicao2 = false;
    System.out.println(condicao1 && condicao2); // false
    System.out.println(condicao1 || condicao2); // true
    System.out.println(!condicao1); // false
    ```
  </details>

- <details>
      <summary><b> ✅ Operadores de Atribuição</b></summary>

  - `=` (atribuição): atribui valores a variáveis.
  - Operadores compostos:
    - `+=` (adição e atribuição)
    - `-=` (subtração e atribuição)
    - `*=` (multiplicação e atribuição)
    - `/=` (divisão e atribuição)
    - `%=` (módulo e atribuição)
  - Exemplo:
    ```java
    int x = 10;
    x += 5; // x agora é 15
    x *= 2; // x agora é 30
    ```
  </details>

- <details>
      <summary><b> ✅ Operadores de Incremento e Decremento </b></summary>

  - `++` (incremento): adiciona 1 ao valor da variável.
  - `--` (decremento): subtrai 1 do valor da variável.
  - Diferença entre pré e pós-incremento/decremento:
    - `++x`: incrementa antes de utilizar o valor.
    - `x++`: incrementa depois de utilizar o valor.
  - Exemplo:
    ```java
    int y = 5;
    System.out.println(++y); // imprime 6
    System.out.println(y++); // imprime 6, mas y agora é 7
    ```
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo neste arquivo:
  - 🧮 [Topic03_Operators.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/introduction/Topic03_Operators.java)

### 🔍 Observações
- Sempre atente-se ao tipo de dado ao usar operadores matemáticos e relacionais.
- O uso correto dos operadores lógicos é fundamental para evitar erros em expressões condicionais.
- Operadores de incremento e decremento devem ser usados com cautela para evitar efeitos colaterais indesejados no código.

