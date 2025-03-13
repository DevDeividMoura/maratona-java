## 📌 Estruturas Condicionais
**Data:** _28/02/2025_  
**Objetivo**: Compreender as estruturas condicionais em Java, como `if`, `else`, `else if`, `switch` e o operador ternário.

### 📚 Conceitos Aprendidos

- <details>
    <summary><b> ✅ Condicional If / Else </b></summary>
    
    - Utilizado para tomada de decisões com base em expressões booleanas.
    - `if` avalia uma condição e executa um bloco de código se for verdadeira.
    - `else` é executado caso a condição do `if` seja falsa.
    - `else if` permite adicionar múltiplas verificações.

    - Exemplo:
    ```java
    int age = 18;
    if (age >= 18) {
    System.out.println("Maior de idade");
    } else {
    System.out.println("Menor de idade");
    }
    ```

    - Exemplo com `else if`:
    ```java
    int grade = 85;
    if (grade >= 90) {
    System.out.println("Aprovado com excelência");
    } else if (grade >= 70) {
    System.out.println("Aprovado");
    } else {
    System.out.println("Reprovado");
    }
    ```
  </details>

- <details>
    <summary><b> ✅ Switch Case </b></summary>
    
    - Utilizado quando há várias condições possíveis para uma mesma variável.
    - Avalia a variável e executa o bloco correspondente ao `case` correspondente.
    - O `break` impede que os próximos `case` sejam executados.
    - O `default` funciona como o `else`, sendo executado se nenhuma das opções for atendida.

    - Exemplo:
    ```java
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        default:
            System.out.println("Dia inválido");
            break;
    }
    ```

    - No Java 14+, é possível utilizar `switch` com `->`:
    ```java
    int option = 2;
    String resultado = switch (option) {
        case 1 -> "Opção 1 escolhida";
        case 2 -> "Opção 2 escolhida";
        case 3 -> "Opção 3 escolhida";
        default -> "Opção inválida";
    };
    System.out.println(resultado);
    ```
  </details>

- <details>
    <summary><b> ✅ Operador Ternário </b></summary>
    
    - Forma reduzida de `if-else` para expressões simples.
    - Sintaxe: `condicao ? valor_se_verdadeiro : valor_se_falso;`
    
    - Exemplo:
    ```java
    int age = 20;
    String status = (age >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(status);
    ```
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo neste arquivo:
  - 🔀 [Topic04_ConditionalStructures.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/introduction/Topic04_ConditionalStructures.java)

### 🔍 Observações
- Sempre utilizar `break` no `switch` para evitar a execução de múltiplos casos.
- O operador ternário deve ser utilizado apenas para expressões simples para manter a legibilidade do código.
- `if-else` é mais flexível, enquanto `switch` é útil para múltiplas comparações de valores fixos.

