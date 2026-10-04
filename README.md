# Lista de Exercícios 02 - POO

Repositório destinado à resolução da lista de exercícios da disciplina de Programação Orientada a Objetos do curso de **Análise e Desenvolvimento de Sistemas (ADS)** do **Instituto Federal da Paraíba (IFPB) - Campus Cajazeiras**.

## Questão - 01

### Explique por que é considerado boa prática usar getters e setters em vez de tornar os atributos públicos em uma classe. Dê um exemplo onde usar um setter permite controlar melhor a integridade dos dados de um objeto.

Utilizar getters e setters em vez de atributos públicos é o princípio básico do encapsulamento. Isso garante que o estado interno de um objeto seja protegido contra modificações indevidas ou inconsistentes por outras partes do código. Além disso, permite que a implementação interna da classe mude no futuro sem quebrar o código que a utiliza, pois a interface pública (os métodos) permanece a mesma. Em uma classe "ContaBancaria" com um atributo "saldo". Se saldo for público, qualquer parte do sistema pode fazer "conta.saldo = -5000;", deixando a conta em um estado inválido. Usando um método "setSaldo(double valor)" ou métodos específicos como "depositar()", você pode inserir uma validação que impeça a atribuição de um valor negativo, mantendo a integridade do objeto.

## Questão - 02

### Considere que você está modelando um sistema de controle de biblioteca. Responda:

#### a) Quais informações você considera relevantes para representar um livro em um sistema?

- Título (String);
- Autor (String);
- ISBN (String - identificador único);
- Ano de Publicação (int);
- Status (boolean/enum - disponível ou emprestado).

#### b) Por que podemos dizer que uma classe Livro seria uma abstração no seu código?

Porque, conceitualmente, um livro é abstraído de modo que simplifique a realidade, focando apenas nos dados e comportamentos que importam para o contexto do sistema (gerenciar empréstimos). Detalhes físicos do mundo real que são irrelevantes para a biblioteca, como cor da capa, peso ou tipo de papel, são propositalmente ignorados.

#### c) Liste ao menos 3 métodos que fariam sentido existir nessa classe.

- emprestar(): Muda o status do livro para indisponível e registra o empréstimo;
- devolver(): Muda o status do livro de volta para disponível;
- verificarDisponibilidade(): Retorna se o livro está na prateleira ou não.
