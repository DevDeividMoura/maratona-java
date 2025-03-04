## 📌 Estruturas de Repetição
**Data:** _01/03/2025_  
**Objetivo**: Compreender as estruturas de repetição em Java, como `for`, `while` e `do-while`, além do uso de `break` e `continue`.

### 📚 Conceitos Aprendidos

- <details>
    <summary><b> ✅ Estrutura While </b></summary>

  - Utilizado quando o número de iterações não é conhecido de antemão.
  - O loop continua enquanto a condição for verdadeira.

  - Exemplo:
    ```java
    int contador = 0;
    while (contador < 5) {
        System.out.println("Contador: " + contador);
        contador++;
    }
    ```
  </details>

- <details>
    <summary><b> ✅ Estrutura Do-While </b></summary>

  - Semelhante ao `while`, mas garante que o bloco de código seja executado ao menos uma vez.
  - Sintaxe: `do { bloco de código } while (condição);`

  - Exemplo:
    ```java
    int numero = 1;
    do {
        System.out.println("Número: " + numero);
        numero++;
    } while (numero <= 5);
    ```
  </details>

- <details>
    <summary><b> ✅ Estrutura For </b></summary>

  - Utilizado quando o número de iterações é conhecido previamente.
  - Sintaxe básica: `for (inicialização; condição; incremento) { bloco de código }`

  - Exemplo:
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println("Iteração: " + i);
    }
    ```

  - Exemplo com loop reverso:
    ```java
    for (int i = 5; i >= 1; i--) {
        System.out.println("Contagem regressiva: " + i);
    }
    ```
  </details>

- <details>
    <summary><b> ✅ Estrutura Foreach </b></summary>

  - Usado para percorrer arrays e coleções de maneira simplificada.
  - Sintaxe: `for (TipoVariável nomeVariável : coleção) { bloco de código }`

  - Exemplo:
    ```java
    int[] nums = {1, 2, 3, 4, 5};
    for (int num : nums) {
        System.out.println("Número: " + num);
    }
    ```
  </details>

- <details>
    <summary><b> ✅ Uso de Break e Continue </b></summary>

  - `break`: Interrompe o loop imediatamente.
  - `continue`: Pula a iteração atual e avança para a próxima.

  - Exemplo com `break`:
    ```java
    for (int i = 1; i <= 10; i++) {
        if (i == 5) {
            break; // Sai do loop quando i for 5
        }
        System.out.println("i: " + i);
    }
    ```

  - Exemplo com `continue`:
    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue; // Pula a iteração quando i for 3
        }
        System.out.println("i: " + i);
    }
    ```
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo neste arquivo:
  - 🔄 [Topic05_Loops.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/introduction/Topic05_Loops.java)

### 🔍 Observações
- O `for` é ideal para loops com contadores fixos.
- O `foreach` (`for-each`) é útil para percorrer arrays e coleções sem a necessidade de controle de índice.
- O `while` é recomendado para loops que dependem de condições dinâmicas.
- O `do-while` garante pelo menos uma execução do bloco de código.
- `break` e `continue` devem ser usados com cautela para evitar fluxos de controle confusos.

