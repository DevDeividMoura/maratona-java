# 📌 Maratona Java
**Repositório de estudos da linguagem Java**

## 📖 Sobre
Este repositório contém códigos e anotações do meu aprendizado em Java, organizados por temas e conceitos estudados.
Cada código possui um arquivo `.md` correspondente na pasta `docs/`, contendo explicações detalhadas.

## 📂 Estrutura do Projeto
```
maratona-java/
│── docs/                                              # Documentação e anotações organizadas por módulos
│   ├── com.devdeividmoura.maratonajava.introduction/  # Conceitos iniciais
│   │   ├── Topic01_HelloWorld.md
│   │   ├── Topic02_PrimitiveTypes.md
│   │   ├── Topic03_Operators.md
│   │   ├── Topic04_ConditionalStructures.md
│   │   ├── Topic05_Loops.md
│   │   ├── Topic06_Arrays.md
│── src/                                               # Códigos-fonte organizados por módulos
│   ├── com.devdeividmoura.maratonajava/
│   │   ├── introduction/                              # Conceitos iniciais
│   │   │   ├── Topic01_HelloWorld.java
│   │   │   ├── Topic02_PrimitiveTypes.java
│   │   │   ├── Topic03_Operators.java
│   │   │   ├── Topic04_ConditionalStructures.java
│   │   │   ├── Topic05_Loops.java
│   │   │   ├── Topic06_Arrays.java
│   │   ├── projects/                                  # Projetos de Pratica
│   │   │   ├── tictactoe/
│   │   │   │   ├── TicTacToe.java
│── .gitignore                                         # Arquivos ignorados pelo Git
│── README.md                                          # Documentação principal do repositório
```

## 📚 Conteúdos
<details>

<summary><b> 📌 Introdução </b></summary>

   - <details>
       <summary><b>
     <a 
         href="https://github.com/DevDeividMoura/maratona-java/tree/main/docs/com.devdeividmoura.maratonajava.introduction/Topic01_HelloWorld.md"
     > 
         🌎 Topic01_HelloWord.md 
     </a></b></summary>
   
      - <details>
          <summary><b> ✅ Conceitos Iniciais </b></summary>
      
        - Estrutura básica de um código Java
        - Diferença entre JVM, JDK e JRE
        - Execução de um programa Java
        </details>
   
      - <details>
          <summary><b> ✅ Organização do Código </b></summary>
      
         - Uso de pacotes (`package`)
         - Convenção de nomenclatura baseada no domínio (`com.exemplo.projeto`)
        </details>
      
      - <details>
          <summary><b> ✅ Comentários e Documentação </b></summary>
      
         - Tipos de comentários em Java (`//`, `/* */`, `/** */`)
         - Uso do JavaDoc para documentação de classes e métodos
        </details>
   
     </details>
   - <details>
       <summary><b>
     <a 
         href="https://github.com/DevDeividMoura/maratona-java/blob/main/docs/com.devdeividmoura.maratonajava.introduction/Topic02_PrimitiveTypes.md"
     > 
         🔢 Topic02_PrimitiveTypes.md 
     </a></b></summary>
        
       - <details>
           <summary><b> ✅ Introdução aos Tipos Primitivos </b></summary>

           - O que são tipos primitivos?
           - Diferença entre tipos primitivos e referências
         </details>
         
       - <details>
           <summary><b> ✅ Tipos Numéricos </b></summary>

           - Tipos inteiros (`byte`, `short`, `int`, `long`)
           - Tipos de ponto flutuante (`float`, `double`)
         </details>
     
       - <details>
           <summary><b> ✅ Outros Tipos Primitivos </b></summary>

           - Tipo lógico (`boolean`)
           - Tipo caractere (`char`)
         </details>
    
     </details>
   - <details>
          <summary><b>
          <a href="https://github.com/DevDeividMoura/maratona-java/blob/main/docs/com.devdeividmoura.maratonajava.introduction/Topic03_Operators.md">
             🧮 Topic03_Operators.md 
          </a></b></summary>

      - <details>
           <summary><b> ✅ Operadores Aritméticos </b></summary>

           - `+`, `-`, `*`, `/` e `%` com exemplos práticos.
        </details>

      - <details>
          <summary><b> ✅ Operadores Comparativos </b></summary>
        
          - `==`, `!=`, `<`, `>`, `<=`, `>=` e a diferença entre primitivos e objetos.
        </details>

      - <details>
          <summary><b> ✅ Operadores Lógicos </b></summary>
        
          - `&&`, `||` e `!` aplicados em expressões condicionais.
        </details>

      - <details>
          <summary><b> ✅ Operadores de Atribuição </b></summary>
        
          - `=`, `+=`, `-=`, `*=`, `/=`, `%=` e exemplos práticos.
        </details>

      - <details>
          <summary><b> ✅ Operadores de Incremento e Decremento </b></summary>
        
          - `++` e `--`, incluindo pré e pós-incremento.
        </details>
     </details>
   - <details>
        <summary><b>
        <a href="https://github.com/DevDeividMoura/maratona-java/blob/main/docs/com.devdeividmoura.maratonajava.introduction/Topic04_ConditionalStructures.md">
           🔀 Topic04_ConditionalStructures.md
        </a></b></summary>
    
        - <details>
             <summary><b> ✅ Condicional If / Else </b></summary>
        
            - Estruturas básicas para tomada de decisão.
            - Uso de `if`, `else if` e `else` para controle de fluxo.
            - Exemplo de categorização por idade.
          </details>
        
        - <details>
            <summary><b> ✅ Operador Ternário </b></summary>
        
            - Substitui `if-else` simples em expressões curtas.
            - Exemplo de decisão baseada em salário.
          </details>
        
        - <details>
            <summary><b> ✅ Estrutura Switch </b></summary>
        
            - Utilizado para múltiplas comparações de valores fixos.
            - Sintaxe tradicional e versão simplificada disponível no Java 14+.
            - Exemplo de determinação do dia da semana.
          </details>
    
     </details>
   - <details>
      <summary><b>
      <a href="https://github.com/DevDeividMoura/maratona-java/blob/main/docs/com.devdeividmoura.maratonajava.introduction/Topic05_Loops.md">
         🔄 Topic05_Loops.md
      </a></b></summary>

      - <details>
           <summary><b> ✅ Estrutura While </b></summary>
      
          - Executa um bloco de código enquanto a condição for verdadeira.
          - Exemplo de contagem progressiva de 1 a 10.
        </details>
      
      - <details>
          <summary><b> ✅ Estrutura Do-While </b></summary>
      
          - Executa pelo menos uma vez antes de verificar a condição.
          - Exemplo de contagem progressiva de 1 a 10.
        </details>
      
      - <details>
          <summary><b> ✅ Estrutura For </b></summary>
      
          - Estrutura de repetição com inicialização, condição e incremento.
          - Exemplo de iteração de 0 a 9.
        </details>

     - <details>
         <summary><b> ✅ Estrutura Foreach </b></summary>

         - Estrutura de repetição que percorre diretamente os elementos de um array ou coleção.
         - Exemplo de uso com um array de números inteiros.
       </details>

      - <details>
          <summary><b> ✅ Uso de Break e Continue </b></summary>
      
          - Interrompe a execução do loop quando uma condição é atendida.
          - Exemplo imprimindo apenas os primeiros 25 números.
          - Pula a iteração atual e continua para a próxima.
          - Exemplo ignorando múltiplos de 3 em um loop.
        </details>

     </details>
   - <details>
        <summary><b>
      <a 
          href="https://github.com/DevDeividMoura/maratona-java/blob/main/docs/com.devdeividmoura.maratonajava.introduction/Topic06_Arrays.md"
      > 
          📦 Topic06_Arrays.md 
      </a></b></summary>
    
        - <details>
            <summary><b> ✅ Definição de Arrays </b></summary>
    
            - O que são arrays e como funcionam na memória
            - Diferença entre array e `ArrayList`
          </details>

        - <details>
             <summary><b> ✅ Alocação de Memória </b></summary>

            - Arrays são armazenados na heap e acessados por referências.
            - Arrays de tipos primitivos armazenam valores diretamente.
            - Arrays de objetos armazenam referências para os objetos.
          </details>

        - <details>
            <summary><b> ✅ Arrays Multidimensional </b></summary>
    
            - Arrays podem ter mais de uma dimensão (matrizes).
          </details>

        - <details>
            <summary><b> ✅ Inicialização de Arrays </b></summary>
    
            - Criando arrays vazios e preenchidos
            - Arrays multidimensionais
          </details>
     </details>


</details>

## 💡 Projetos de Prática
<details>

<summary><b> 🎮 Jogos </b></summary>

- <details>
    <summary><b>
    <a 
        href="https://github.com/DevDeividMoura/maratona-java/tree/main/src/com/devdeividmoura/maratonajava/projects/tictactoe/TicTacToe.java"
    > 
        ❌⭕ Tic-Tac-Toe 
    </a></b></summary>

    - Jogo clássico da velha implementado em Java.
    - Uso de matriz bidimensional para representar o tabuleiro.
    - Interação via terminal para entrada dos jogadores.
  </details>

</details>


## 🚀 Como Executar
1. Clone este repositório:
    ```sh
    git clone https://github.com/DevDeividMoura/maratona-java.git
    cd maratona-java/src
    ```
2. Compile e execute um dos arquivos Java:
    ```sh
    javac -d . com/devdeividmoura/maratonajava/intro/Topic01_HelloWorld.java
    java com.devdeividmoura.maratonajava.introduction.Topic01_HelloWorld
    ```

## ✨ Autor
[Deivid Moura](https://github.com/DevDeividMoura) - Desenvolvedor Back-end 🚀  
