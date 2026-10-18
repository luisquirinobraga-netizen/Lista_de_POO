# Lista de Exercícios 04 - POO

Repositório destinado à resolução da lista de exercícios da disciplina de Programação Orientada a Objetos do curso de **Análise e Desenvolvimento de Sistemas (ADS)** do **Instituto Federal da Paraíba (IFPB) - Campus Cajazeiras**.

## Questão - 01

### Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.

#### a) Os construtores de superclasse não são herdados por subclasses.

Verdadeiro. Construtores não são membros herdados (como métodos e atributos comuns). As subclasses precisam declarar seus próprios construtores, embora possam invocar o construtor da superclasse usando a palavra-chave "super()".

#### b) Um relacionamento tem um é implementado via herança.

Falso. O relacionamento "tem um" (ex: um carro tem um motor) é implementado via composição ou agregação (onde uma classe possui um atributo que é uma instância de outra classe). O que é implementado via herança é o relacionamento "é um" (ex: um carro é um veículo).

#### c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.

Falso. Quando um método é redefinido com a mesma assinatura na subclasse, chama-se sobrescrita (override). A sobrecarga (overload) ocorre quando você cria vários métodos com o mesmo nome, mas com assinaturas diferentes (parâmetros diferentes) dentro da mesma classe.

## Questão - 02

### Alguns programadores preferem não utilizar acesso protected, porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.

#### Acesso private (Maior Encapsulamento):

- Mérito: Protege totalmente o estado interno da superclasse. Os atributos ficam restritos à própria classe, forçando as subclasses a acessá-los ou modificá-los apenas por meio de métodos públicos (getters e setters). Isso garante que se você mudar a implementação interna da superclasse, as subclasses não quebrarão, mantendo o encapsulamento intacto.

#### Acesso protected (Acessibilidade Estendida):

- Vantagem: Permite que as subclasses acessem diretamente os membros da superclasse sem precisar de métodos intermediários, o que pode simplificar o código em hierarquias complexas;
- Desvantagem (Por que alguns evitam): Quebra parcialmente o encapsulamento. Qualquer subclasse (e até classes no mesmo pacote) pode manipular diretamente os campos da superclasse, criando um forte acoplamento. Se a superclasse mudar um atributo protected, todas as subclasses que o utilizam diretamente podem apresentar falhas.

## Questão - 03

### Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?

Quando você cria um objeto de uma subclasse, o Java precisa garantir, estruturalmente, que toda a cadeia de herança seja construída de cima para baixo. Desse modo, o construtor da superclasse é executado sempre antes do construtor da subclasse. Como a superclasse é responsável por inicializar seu próprio estado — incluindo atributos e regras de negócio essenciais —, a ausência dessa chamada resultaria em uma subclasse com um objeto base corrompido, parcialmente inicializado ou em estado inválido, o que geraria comportamentos imprevisíveis.
