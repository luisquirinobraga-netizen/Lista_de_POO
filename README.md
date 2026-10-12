# Lista de Exercícios 03 - POO

Repositório destinado à resolução da lista de exercícios da disciplina de Programação Orientada a Objetos do curso de **Análise e Desenvolvimento de Sistemas (ADS)** do **Instituto Federal da Paraíba (IFPB) - Campus Cajazeiras**.

## Questão - 04

### Explique a diferença entre um array de tipos primitivos (int[], double[]) e um array de objetos (Aluno[], Produto[]) em Java.

#### a) Como a memória é alocada em cada caso?

- Tipos Primitivos: Quando você instancia o array (ex.: int[] v = new int[5];), o Java reserva um bloco contínuo de memória onde os valores reais são gravados. Por padrão, todas as posições já nascem inicializadas com 0.
- Objetos: Quando você instancia o array de objetos (ex.: Aluno[]), o Java reserva espaço apenas para guardar os ponteiros/endereços. Por padrão, todas as posições começam com o valor null. Os objetos reais precisam ser instanciados separadamente (com o operador new) e atribuídos a cada posição.

#### b) Quais cuidados devem ser tomados ao acessar elementos de um array de objetos?

- Risco de NullPointerException: Como as posições do array nascem com null, tentar chamar um método ou acessar um atributo de uma posição vazia (ex: turma[0].getNome()) causará um erro fatal no programa.
- Validação obrigatória: É necessário verificar se o endereço é diferente de null antes de utilizá-la (ex: if (turma[i] != null)).
- Instanciação individual: O array não cria os objetos automaticamente; cada item do array precisa do seu próprio new antes de ser manipulado.
