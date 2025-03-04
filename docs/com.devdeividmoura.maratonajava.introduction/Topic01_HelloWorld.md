## 📌 Introdução à Java
**Data:** _24/02/2024_  
**Objetivo**: Aprender os conceitos básicos da programação em Java e executar meu primeiro código em Java.

### 📚 Conceitos Aprendidos

  - ✅ **JVM (Java Virtual Machine)**: Permite que o Java seja multiplataforma, lendo e executando o bytecode gerado pelo compilador.
  - ✅ **JDK (Java Development Kit)**: Um conjunto de bibliotecas e ferramentas que possibilita o desenvolvimento de programas Java.
  - ✅ **JRE (Java Runtime Environment)**: Fornece as bibliotecas e componentes necessários para executar aplicações Java.
  - <details>
      <summary>✅ <strong>Estrutura básica de um código Java</strong></summary>
      <ul>
        <li>Toda aplicação Java começa com <code>main()</code>.</li>
        <li>A classe deve ter o mesmo nome do arquivo. (<code>Main.java</code> → <code>class Main</code>)</li>
        <li><code>System.out.println()</code> imprime no console.</li>
        <li>Palavras-chave importantes:
          <ul>
            <li><code>public</code> → Visibilidade</li>
            <li><code>static</code> → Execução sem criar um objeto</li>
            <li><code>void</code> → Sem retorno</li>
          </ul>
        </li>
        <li>Java diferencia maiúsculas de minúsculas (<code>Main</code> ≠ <code>main</code>).</li>
      </ul>
    </details>
  - <details>
      <summary>✅ <strong>Organizando o código em pacotes</strong></summary>
      <ul>
        <li>Pacotes ajudam a organizar melhor o código e evitar conflitos de nomes.</li>
        <li>Segue-se a convenção de nome baseada no domínio do projeto:
          <ul>
            <li><strong>Exemplo:</strong> Se o domínio for <code>devdeividmoura.com</code>, o pacote ficaria:
              <pre>
    com.devdeividmoura.projeto
              </pre>
            </li>
          </ul>
        </li>
        <li>Para usar pacotes, declaramos <code>package</code> no início do arquivo Java:
          <pre>
    package com.devdeividmoura.maratonajava.introduction;
          </pre>
        </li>
        <li>O nome do pacote deve ser escrito em <strong>letras minúsculas</strong>.</li>
      </ul>
    </details>

  - <details>
    <summary>✅ <strong>Comentários e documentação de código: </strong></summary>
    <ul>
      <li>Comentários de linha única: <code>// Comentário</code></li>
      <li>Comentários de múltiplas linhas:
        <pre>
     /*
      * Comentário em múltiplas linhas
      */
         </pre>
       </li>
       <li><strong>JavaDoc:</strong> Usado para documentar classes e métodos, gerando documentação HTML.
         <pre>
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
         </pre>
       </li>
    </ul>
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo neste arquivo:
  - 🌎 [Topic01_HelloWord.java](https://github.com/DevDeividMoura/maratona-java/tree/main/docs/com.devdeividmoura.maratonajava.introduction/Topic01_HelloWorld.md)
