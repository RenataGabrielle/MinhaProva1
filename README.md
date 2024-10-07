

# Projeto: Sistema de Votação para Eliminação

## Descrição

Este projeto é um sistema de votação que permite que os participantes votem em quem deve ser eliminado de um grupo de jogadores. O sistema contabiliza os votos e declara o jogador com mais votos como eliminado.

## Estrutura do Código

### Classes

1. **Jogador**
   - **Atributos:**
     - `nome`: Nome do jogador.
     - `votos`: Total de votos recebidos.
   - **Métodos:**
     - `getNome()`: Retorna o nome do jogador.
     - `getVotos()`: Retorna a quantidade de votos recebidos.
     - `incrementaUmVoto()`: Incrementa o contador de votos em 1.

2. **Participantes (classe principal)**
   - **Métodos:**
     - `main(String[] args)`: Ponto de entrada do programa. Coordena o fluxo de execução.
     - `cadastrarJogadores()`: Cria e retorna uma lista de jogadores.
     - `contabilizarVotos(ArrayList<Jogador> jogadores)`: Recebe os votos dos usuários.
     - `encontrarJogador(ArrayList<Jogador> jogadores, String nome)`: Busca um jogador pelo nome.
     - `encontrarEliminado(ArrayList<Jogador> jogadores)`: Determina qual jogador foi eliminado com base nos votos.
     - `exibirEliminacao(Jogador eliminado)`: Exibe uma mensagem de eliminação com detalhes do jogador.

## Funcionamento

1. **Cadastro de Jogadores:** O programa inicia cadastrando um grupo fixo de jogadores, utilizando a classe `Jogador`.
  
2. **Votação:** Os usuários podem votar em um jogador digitando o nome do jogador. Para encerrar a votação, basta digitar "sair".
  
3. **Contabilização dos Votos:** O programa verifica se o nome digitado corresponde a um jogador registrado. Se sim, incrementa o contador de votos para aquele jogador.
  
4. **Eliminação:** Após a votação, o programa determina qual jogador recebeu mais votos e exibe uma mensagem de eliminação criativa.

## Exemplo de Uso

```java
public static void main(String[] args) {
    // O usuário irá interagir com o programa através do console.
}


### Interação com o Usuário

1. O programa pede que o usuário digite o nome de um jogador em quem deseja votar.
2. Se o nome não for encontrado, uma mensagem de erro será exibida.
3. A votação continua até que o usuário digite "sair".
4. O jogador com mais votos será declarado eliminado com uma mensagem especial.

## Dependências

- Nenhuma dependência externa necessária, apenas o JDK para compilar e executar o código.

## Considerações Finais

Este projeto é um exemplo prático de como implementar um sistema de votação simples em Java. Ele pode ser expandido para incluir mais funcionalidades, como a possibilidade de reiniciar a votação, adicionar mais jogadores dinamicamente, ou até mesmo salvar resultados em um banco de dados.
