## 📌 Introdução à Java
**Data:** _24/02/2024_  
**Objetivo**: Aprender os conceitos básicos da programação em Java e executar meu primeiro código em Java.

### 📚 Conceitos Aprendidos
- ✅ **JVM (Java Virtual Machine)**: Permite que o Java seja multiplataforma, lendo e executando o bytecode gerado pelo compilador.
- ✅ **JDK (Java Development Kit)**: Um conjunto de bibliotecas e ferramentas que possibilita o desenvolvimento de programas Java.
- ✅ **JRE (Java Runtime Environment)**: Fornece as bibliotecas e componentes necessários para executar aplicações Java.
- ✅ **Estrutura básica de um código Java**:
  - Toda aplicação Java começa com `main()`.
  - A classe deve ter o mesmo nome do arquivo. (`Main.java` → `class Main`)
  - `System.out.println()` imprime no console.
  - Palavras-chave importantes:
    - `public` → Visibilidade
    - `static` → Execução sem criar um objeto
    - `void` → Sem retorno
  - Java diferencia maiúsculas de minúsculas (`Main` ≠ `main`).


- ✅ **Organizando o código em pacotes**:
  - Pacotes ajudam a organizar melhor o código e evitar conflitos de nomes.
  - Segue-se a convenção de nome baseada no domínio do projeto:
    - **Exemplo:** Se o domínio for `devdeividmoura.com`, o pacote ficaria:
      ```
      com.devdeividmoura.projeto
      ```
  - Para usar pacotes, declaramos `package` no início do arquivo Java:
    ```java
    package com.devdeividmoura.maratonajava.intro;
    ```
  - O nome do pacote deve ser escrito em **letras minúsculas**.


- ✅ **Comentários e documentação de código**:
  - **Comentários de linha única:** `// Comentário`
  - **Comentários de múltiplas linhas:**
    ```java
    /*
     * Comentário em múltiplas linhas
     */
    ```
  - **JavaDoc:** Usado para documentar classes e métodos, gerando documentação HTML.
    ```java
    /**
     * Esta classe representa um exemplo básico em Java.
     */
    public class HelloWorld {
        /**
         * Método principal que imprime "Hello, World!" no terminal.
         * @param args Argumentos da linha de comando (não utilizados).
         */
        public static void main(String[] args) {
            System.out.println("Hello, World!");
        }
    }
    ```

### 📝 Código do Exercício
```java
package com.devdeividmoura.maratonajava.intro;

/**
 * Classe HelloWorld - Exemplo básico de um programa Java.
 * <p>
 * Esta classe contém um método main que imprime "Hello, World!" no terminal.
 * </p>
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class HelloWorld {
  /**
   * Método principal que executa o programa.
   * <p>
   * Este método imprime "Hello, World!" no terminal.
   * </p>
   *
   * @param args Argumentos da linha de comando (não utilizados neste exemplo).
   */
  public static void main(String[] args) {
    System.out.println("Hello, World!"); // Imprime Hello, World! no terminal
  }
}

```

### 🔍 Observações
- ...