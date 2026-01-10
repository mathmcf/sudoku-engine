# Solucionador de Sudoku
Implementação de um algoritmo sobre o jogo de Sudoku com utilização do Paradigma de Orientação a Objetos

Este projeto consiste em um algoritmo para resolver tabuleiros de Sudoku, utilizando a técnica de Backtracking. O sistema valida as regras fundamentais do jogo, considerando linhas, colunas e blocos 3x3, a fim de gerar uma solução eficiente para diferentes combinações de entradas aleatórias.

## 🚀 Estrutura do Projeto

O projeto segue as convenções de pacotes Java e está organizado da seguinte forma:

### Classes Principais:

* [SudokuMain](https://github.com/mathmcf/sudoku-engine/blob/main/src/main/java/br/com/sudoku/app/SudokuMain.java): Ponto de entrada da aplicação.
* [Sudoku](https://github.com/mathmcf/sudoku-engine/blob/main/src/main/java/br/com/sudoku/domain/model/Sudoku.java): Representação do tabuleiro como objeto modelo do código.
* [ValidateSudokuRules](https://github.com/mathmcf/sudoku-engine/blob/main/src/main/java/br/com/sudoku/domain/validation/ValidateSudokuRules.java): Contém a lógica de validação das regras do Sudoku.
* [SolveSudoku](https://github.com/mathmcf/sudoku-engine/blob/main/src/main/java/br/com/sudoku/solver/SolveSudoku.java): Motor de resolução do algoritmo.

### Classe de Teste Unitário:

* [SolveSudokuTest](https://github.com/mathmcf/sudoku-engine/blob/main/src/test/java/br/com/sudoku/SolveSudokuTest.java).

### Métodos implementados:

**Classe ValidateSudokuRules:**

* **private boolean isTheNumberInRow(int[][] board, int number, int row):** verifica se o número já existe na linha;
* **private boolean isTheNumberInColumn(int[][] board, int number, int column):** verifica se o número já existe na coluna;
* **private boolean isTheNumberInA3x3Block(int[][] board, int number, int row, int column):** verifica se o número já existe no quadrante 3x3;
* **public boolean isAValidPlaceForTheNumber(int[][] board, int row, int column, int number):** consolida as validações acima.

**Classe SolveSudoku:**

* **public boolean solveSudoku(Sudoku sudoku):** método principal de resolução;
* **shuffleNumbersInBoard(int[] array):** implementação para aleatoriedade no preenchimento;
* **printSolvedSudokuBoard(int[][] board):** exibição formatada do resultado no console.

**Classe SolveSudokuTest:**

* **void solve_OnceValidatedRowsAndColumnsAnd3X3Block_SolveSudoku():** garante que o "solver" respeita todas as regras do jogo a partir de um tabuleiro de entrada.

### Pacotes das Classes Principais (src/main/java):

* br.com.sudoku.app.SudokuMain;
* br.com.sudoku.domain.model.Sudoku;
* br.com.sudoku.domain.validation.ValidateSudokuRules;
* br.com.sudoku.solver.SolveSudoku.

### Pacotes de Testes Unitários (src/test/java):

* br.com.sudoku.SolveSudokuTest.

## 🛠️ Tecnologias Utilizadas:

* Java 17 (ou superior);
* Maven para gerenciamento de dependências;
* JUnit 5 (Jupiter) para testes unitários.

## ⚙️ Como Executar

Comandos a seguir podem ser executados via Bash (terminal):


| Descrição | Comando 
| :---:      | :---: | 
| Clona o repositório|*git clone* [https://github.com/mathmcf/sudoku-engine.git](https://github.com/mathmcf/sudoku-engine.git); |
| Compila o projeto | *mvn clean install* |
| Executa os testes | *mvn test* |
| Roda a aplicação | *mvn exec:java -Dexec.mainClass="br.com.sudoku.app.SudokuMain"* |

## 📄 Configuração do Maven (pom.xml)

Seguem os detalhes das configurações necessárias para a estrutura do projeto a serem adicionadas no arquivo: *pom.xml*, a fim de suportar o JUnit 5, possibilitando a execução de testes unitários.

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>br.com.sudoku</groupId>
    <artifactId>sudoku-engine</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>5.5.0</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <version>5.5.0</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version> </plugin>
        </plugins>
    </build>

</project>



