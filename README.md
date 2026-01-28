# 🔫 Roleta Russa: Jogo de Console em Java

## 🌟 Status do Projeto

[![Linguagem Principal](https://img.shields.io/badge/Java-17%2B-red.svg?style=for-the-badge&logo=java)](https://www.java.com/pt-br/)
[![Build Tool](https://img.shields.io/badge/Maven-3.x-orange.svg?style=for-the-badge&logo=apache-maven)](https://maven.apache.org/)
[![Tipo de Projeto](https://img.shields.io/badge/Tipo-CLI%20Game-blue.svg?style=for-the-badge)](https://en.wikipedia.org/wiki/Command-line_interface)
[![Licença](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)

## 🎯 Visão Geral do Projeto

O **Roleta Russa** é uma implementação simples do clássico jogo de azar, desenvolvida em **Java** como uma aplicação de console (CLI). O projeto tem um propósito didático, demonstrando o uso de estruturas de controle, manipulação de listas (`ArrayList`) e geração de números aleatórios (`Math.random`) para simular a mecânica do jogo.

O jogo simula um revólver com 8 câmaras, onde apenas uma bala real está presente. O jogador deve "girar o tambor" e escolher uma câmara para atirar.

## 🏛 Arquitetura e Design de Software

A aplicação é um projeto monolítico e procedural, contido em uma única classe principal (`Main.java`), o que é comum para exercícios de lógica de programação e projetos de console simples.

### Componentes Chave

| Componente | Tecnologia | Responsabilidade |
| :--- | :--- | :--- |
| **Lógica Principal** | `Main.java` | Contém toda a lógica do jogo, desde a inicialização até o *loop* de execução. |
| **Geração Aleatória** | `Math.random()` | Define aleatoriamente a posição da bala real no tambor. |
| **Simulação do Tambor** | `java.util.ArrayList<Integer>` | Representa as 8 câmaras do revólver, onde o valor da bala real é armazenado. |
| **Interação** | `java.util.Scanner` | Captura a escolha do jogador via linha de comando. |

### Fluxo de Execução

1.  **Inicialização:** O jogo cria uma lista (`ArrayList`) de 8 "balas" (câmaras), numeradas de 1 a 8.
2.  **Sorteio:** Um número aleatório entre 1 e 8 é gerado para definir a posição da **bala real** (`roleta`).
3.  **Loop do Jogo:** O jogo continua enquanto a bala real não for escolhida e houver mais de uma bala no tambor.
4.  **Escolha do Jogador:** O jogador escolhe um número de câmara.
5.  **Verificação:**
    *   Se a escolha for a bala real (`roleta`), o jogador "morre" e o jogo termina.
    *   Se a escolha for uma bala vazia, a câmara é removida da lista (`balas.remove(i)`), e o jogo continua.
6.  **Vitória:** Se restar apenas a bala real na lista, o jogador vence por ter evitado todos os tiros vazios.

## ✨ Funcionalidades Principais

*   **Simulação de Sorteio:** Implementação de lógica de sorteio e eliminação de opções.
*   **Interação CLI:** Jogo totalmente operado via linha de comando.
*   **Controle de Fluxo:** Uso de `while` e `for` loops para gerenciar o estado do jogo.

## 🛠 Dependências

O projeto utiliza o **Maven** apenas para estruturação e compilação, não havendo dependências externas complexas. O código é puramente Java Standard Edition (SE).

## ⚙ Pré-requisitos

*   **Java Development Kit (JDK)**: Versão 17 ou superior.
*   **Apache Maven**: Versão 3.x ou superior.

## 🚀 Instalação e Execução

### 1. Clonagem e Compilação

A partir do diretório raiz do projeto (`RoletaRussa/`):

```bash
# 1. Clone o repositório
git clone https://github.com/GilvanPedro/RoletaRussa.git
cd RoletaRussa/RoletaRussa

# 2. Compile e empacote o projeto
mvn clean install
```

### 2. Execução da Aplicação

O arquivo JAR executável será gerado no diretório `target`. Execute-o com o comando `java -jar`:

```bash
java -jar target/RoletaRussa-1.0-SNAPSHOT.jar
```

## 🕹 Exemplo de Interação (CLI)

A interação simula o jogador escolhendo uma câmara:

```
[1, 2, 3, 4, 5, 6, 7, 8]
Escolha uma bala: 5
Só resta a bala de verdade agora!! Você venceu!
```
ou
```
[1, 2, 3, 4, 5, 6, 7, 8]
Escolha uma bala: 3
Você morreu com um tiro!!
```

## 📄 Licença

Este projeto está sob a **Licença MIT**.

## 🧑‍💻 Autor

Este projeto foi desenvolvido por [Gilvan Pedro](https://github.com/GilvanPedro).
