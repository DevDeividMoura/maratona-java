## 📌 Métodos de Classes em Java
**Data:** _04/03/2025_  
**Objetivo:** Compreender o funcionamento dos métodos em classes Java, incluindo declaração, parâmetros, retorno e boas práticas de implementação.

### 📚 Conceitos Aprendidos

- <details>
      <summary><b> ✅ Declaração e Diferença entre Retorno e Saída (sout) </b></summary>

    - Um **método** é um conjunto de instruções que executa uma tarefa específica dentro de uma classe.
    - **Retorno**: Valor que o método devolve ao final de sua execução (utiliza a palavra-chave `return`).
    - **Saída (sout)**: Impressão de dados no console (ex.: `System.out.println`), que não necessariamente corresponde ao retorno do método.
    - Métodos declarados como `void` não retornam nenhum valor.
  </details>

- <details>
      <summary><b> ✅ Nomeação de Métodos e Parâmetros </b></summary>

    - A **nomeação** dos métodos segue as mesmas regras das variáveis (camelCase).
    - Parâmetros são variáveis locais passadas para o método, formando parte do contrato da função.
    - A sintaxe para declaração de parâmetros é: `<tipo> <nome>`, separados por vírgula.
  </details>

- <details>
      <summary><b> ✅ Uso de Parâmetros nos Métodos </b></summary>

    - **Parâmetros** são utilizados para receber valores na execução do método.
    - Eles definem quais dados são necessários para que o método execute sua lógica corretamente.
    - Exemplo:
      ```java
      public int somar(int a, int b) {
          return a + b;
      }
      ```
  </details>

- <details>
      <summary><b> ✅ Retorno de Valores </b></summary>

    - Ao declarar um método com um tipo de retorno (ex.: `int`, `String`), é necessário retornar um valor compatível com esse tipo.
    - O retorno pode ser atribuído a uma variável quando o método é invocado.
    - Exemplo:
      ```java
      public double calcularMedia(double nota1, double nota2) {
          return (nota1 + nota2) / 2;
      }
      double media = calcularMedia(8.0, 9.0);
      ```
  </details>

- <details>
      <summary><b> ✅ Tipagem de Parâmetros: Tipos Primitivos vs. Tipos por Referência </b></summary>

    - **Tipos Primitivos:** São passados por valor. Ou seja, o método recebe uma cópia do valor, e alterações dentro do método não afetam a variável original.
    - **Tipos por Referência:** São passados por referência. O método pode alterar o objeto original. Por boa prática, recomenda-se copiar o objeto e retornar um novo se alterações forem necessárias.
  </details>

- <details>
      <summary><b> ✅ Utilização do <code>this</code> </b></summary>

    - A palavra-chave `this` referencia o objeto atual da classe.
    - É útil para diferenciar atributos de parâmetros ou para invocar outros métodos da mesma classe.
    - Exemplo:
      ```java
      public class Calculator {
          private int result;
          
          public void add(int value) {
              this.result += value;
          }
      }
      ```
  </details>

- <details>
      <summary><b> ✅ Uso de Varargs </b></summary>

    - **Varargs** permite que um método receba um número variável de argumentos.
    - Sintaxe: utilizar reticências (`...`) após o tipo do parâmetro.
    - Exemplo:
      ```java
      public int somarValores(int... numeros) {
          int soma = 0;
          for (int num : numeros) {
              soma += num;
          }
          return soma;
      }
      ```
  </details>

### 💻 Implementação Prática
- Confira as implementações completas e os testes no repositório:
    - **Domínio**:
        - 🧮 [Calculator.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/domain/Calculator.java)
        - 🧑 [Student.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/domain/Student.java)
        - 🖨️ [StudentPrinter.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/domain/StudentPrinter.java)
    - **Testes**:
        - ✅ [CalculatorTest01.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/CalculatorTest01.java)
        - ✅ [CalculatorTest02.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/CalculatorTest02.java)
        - ✅ [CalculatorTest03.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/CalculatorTest03.java)
        - ✅ [CalculatorTest04.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/CalculatorTest04.java)
        - ✅ [CalculatorTest05.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/CalculatorTest05.java)
        - ✅ [StudentTest01.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/StudentTest01.java)
        - ✅ [StudentTest02.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/tests/StudentTest02.java)

### 📐 Exercício Prático: Classe Functionary
- **Descrição**: Crie uma classe `Functionary` com os seguintes atributos e métodos:
    - **Atributos**:
        - `String name`
        - `int age`
        - `double[] salaries // para armazenar 3 salários`
    - **Métodos**:
        - `print`: para imprimir todos os dados.
        - `printSalaryMean`: para calcular a média dos salários e imprimir o resultado.

- Em seguida, crie um teste para verificar e analisar o comportamento da classe.
- Código:
    - **Domínio**:
        - 👨‍💼 [Functionary.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic02_ClassesMethods/domain/Functionary.java)
    - **Teste**:
        - ✅ [FunctionaryTest01.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesMethods/tests/FunctionaryTest01.java)

### 🔍 Observações Adicionais

- **Boas Práticas**:
    - Mantenha os métodos com responsabilidades únicas e claras.
    - Nomeie os métodos de forma consistente, seguindo o padrão camelCase.
    - Documente os métodos utilizando comentários ou JavaDoc, facilitando a manutenção e o entendimento do código.
- **Depuração**:
    - Utilize testes unitários (como os arquivos de teste disponibilizados) para validar o comportamento dos métodos.
- **Coesão**:
    - Evite métodos com funções que não estão relacionadas. A coesão é essencial para a legibilidade e manutenção do código.
