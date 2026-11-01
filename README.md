# Lista de Exercícios 05 - POO

Repositório destinado à resolução da lista de exercícios da disciplina de Programação Orientada a Objetos do curso de **Análise e Desenvolvimento de Sistemas (ADS)** do **Instituto Federal da Paraíba (IFPB) - Campus Cajazeiras**.

## Questão - 01

### A partir de qual versão do Java foi possível implementar métodos com corpo (default ou static) nas interfaces? Qual é a utilidade de métodos default e static dentro de interfaces?

A partir do Java 8 (lançado em 2014) passou a ser permitido criar métodos com corpo dentro das interfaces, utilizando as palavras-chave default ou static. Permitem adicionar novos métodos a uma interface existente sem quebrar as classes que já a implementam (elas herdam o comportamento padrão automaticamente), e, também, evitam duplicação de código, quando várias classes implementam a mesma lógica básica, permitindo sobrescrevê-la apenas quando necessário.

## Questão - 02

### Explique como as interfaces ajudam na construção de sistemas desacoplados e de fácil manutenção. Dê um exemplo prático de um cenário no desenvolvimento de software onde o uso de interfaces é preferível ao uso direto de classes concretas.

As interfaces definem um contrato de o que deve ser feito, sem ditar como será feito. Isso promove o baixo acoplamento, pois as classes principais dependem de abstrações (interfaces) e não de implementações concretas. Se a implementação mudar no futuro, o restante do sistema permanece intacto, facilitando a manutenção e os testes (como a criação de mocks). Imagine que você está criando um sistema que precisa enviar um aviso para o usuário. Se o seu código for escrito conversando diretamente com o sistema de uma empresa específica de cartão de crédito, caso essa empresa mude as regras ou aumente muito as taxas, você terá que reescrever grande parte do código da loja para aceitar outro serviço. Contudo, por meio de uma interface, é possível criar uma interface de "Meio de Pagamento" que define apenas a regra geral: "todo meio de pagamento precisa saber cobrar um valor". O sistema principal da loja passa a conversar apenas com essa interface, sem se importar se por trás está rodando Pix, Boleto ou Cartão de Crédito.
