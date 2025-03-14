## 📌 Introdução a Classes em Java
**Data:** _04/03/2025_  
**Objetivo**: Compreender o conceito de classes em Java, incluindo sua definição, instanciamento, atributos, métodos e valores padrão.

### 📚 Conceitos Aprendidos

- <details>
      <summary><b> ✅ O que é uma classe? </b></summary>

    - Uma **classe** é um molde ou modelo que define a estrutura e o comportamento de objetos. Ela representa entidades do mundo real e define atributos (características) e métodos (comportamentos).
    - Por padrão, as classes em Java não contêm o método `public static void main(String[] args)` (psvm), a menos que sejam destinadas a executar código diretamente.
    - Exemplo básico:
      ```java
      public class Student {
          public String name;
          public int age;
          public char sex;
      }
      ```
  </details>

- <details>
      <summary><b> ✅ Instanciação de Objetos </b></summary>

    - Para utilizar uma classe, é necessário **instanciar** um objeto utilizando o operador `new`.
    - Exemplo:
      ```java
      Student student = new Student();
      ```
    - O objeto criado é uma **referência** a um espaço na memória.
  </details>

- <details>
      <summary><b> ✅ Atributos e Valores Padrão </b></summary>

    - Os atributos de uma classe são as características que os objetos possuirão.
    - Se não forem inicializados explicitamente, recebem valores padrão em Java:

      | Tipo      | Valor Padrão |
            |-----------|--------------|
      | `byte`    | 0            |
      | `short`   | 0            |
      | `int`     | 0            |
      | `long`    | 0L           |
      | `float`   | 0.0F         |
      | `double`  | 0.0D         |
      | `char`    | '\u0000'     |
      | `boolean` | `false`      |
      | `String`  | `null`       |
    - Exemplo de uso:
      ```java
      System.out.println(student.name); // null
      System.out.println(student.age);  // 0
      System.out.println(student.sex);  // '\u0000'
      ```
  </details>

- <details>
      <summary><b> ✅ Cuidado com Variáveis de Referência </b></summary>

    - Em Java, objetos são manipulados através de referências de memória.
    - Duas variáveis podem apontar para o mesmo objeto, o que significa que mudanças feitas por uma variável impactam a outra.
    - Exemplo:
      ```java
      Student student1 = new Student();
      Student student2 = student1;
      student2.name = "Zoro";
      System.out.println(student1.name); // Zoro
      ```
  </details>

- <details>
      <summary><b> ✅ Coesão nas Classes </b></summary>

    - Cada classe deve ter uma responsabilidade única e bem definida.
    - O método `psvm` (public static void main) é utilizado apenas em classes de teste ou para iniciar o programa, mantendo as classes de domínio focadas em suas responsabilidades.
    - Exemplo:
      ```java
      public class Teacher {
          public String name;
          public String subject;
      }
      ```
      E o teste correspondente:
      ```java
      public class TeacherTest01 {
          public static void main(String[] args) {
              Teacher teacher = new Teacher();
              teacher.name = "Master Kami";
              teacher.subject = "Matemática";
              System.out.println(teacher.name);
              System.out.println(teacher.subject);
          }
      }
      ```
  </details>

### 💻 Implementação Prática
- Você pode conferir o código completo nestes arquivos:
    - 🧑 [Student.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesIntroduction/domain/Student.java)
    - ✅ [StudentTest01.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesIntroduction/tests/StudentTest01.java)
    - ✅ [StudentTest02.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesIntroduction/tests/StudentTest02.java)
    - 👨‍🏫 [Teacher.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesIntroduction/domain/Teacher.java)
    - ✅ [TeacherTest01.java](https://github.com/DevDeividMoura/maratona-java/blob/main/src/com/devdeividmoura/maratonajava/oop/Topic01_ClassesIntroduction/tests/TeacherTest01.java)

### 🔍 Observações
- Lembre-se de inicializar os atributos quando necessário para evitar comportamentos inesperados.
- Compreender o conceito de referência é essencial para evitar bugs relacionados a manipulação de objetos em memória.
- O uso adequado de atributos e métodos auxilia na construção de códigos mais limpos e coesos.
- Separe as responsabilidades das classes para garantir maior coesão e manutenibilidade.

