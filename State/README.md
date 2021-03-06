# State

## Classification
Comportamental

## Intent
Permitir que objetos sejam capazes de mudar seu "procedimento" quando ocorrer uma mudança no estado interno do objeto (dai o nome State). 

## Motivation
Imagine que em um programa temos uma classe X e essa classe possui alguns estados, vamos supor três. Em seguida imaginemos também a existência de uma método Y, agora, o problema principal é o seguinte, esse método Y funciona de forma diferente pra cada estado da classe X. Nesse exemplo que eu citei, pode não parecer tão complexo editar o seu programa para cada um dos estados apresentados, afinal, a classe X possui apenas três estados, mas agora imagine adicionar mais e mais estados, consequentemente, só teremos ainda mais métodos funcionado de forma diferente nos demais estados, tornando o algoritmo cada vez maior.

Dessa forma, o padrão State surge com o objetivo de criar novas classes para os diferentes estados de um objeto e em seguida extrair os comportamentos para dentro dessas classes, fazendo com que o objeto pareça estar mudando de classe.

## Applicability

Como foi dito, o State é muito utilizado quando possuimos classes com diversos estados/condicionais. Ele age criando novas classes para os diferentes estados, limpando a classe principal, entre outras vantegens. 

Vale lembrar que o State não usado apenas quando uma classe possui muitos estados, ele também pode funcionar quando o estado de determinado algoritmo mudar com frenquência. Assim, ele vai agir da mesma maneira e irá permitir uma redução no custo de manuntenção do código.

## Structure and Participants

![StateColorido](https://user-images.githubusercontent.com/71103252/99283191-6b065980-2813-11eb-9156-b78c986d9d8d.jpg)

**Contexto:** armazena uma referência de algum objeto concreto e especifíca a ele os trabalhos do estado.

**Estado:** tem a função de declarar as funções especifícas.

**Estado concreto:** faz com que os métodos especifícos recebam as implementações do próprio estado concreto.

## Sample code 

[Link para o código exemplo do padrão de projeto State](https://github.com/danieldorta/padrao-de-projeto/tree/master/State/exemplo)

Mais um ótimo exemplo retirado do blog do [Marcos Brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/state/), bem didático que explica muito bem o funcionamento do padrão State utilizando o personagem de jogos eletrônicos, Mario. No exemplo Marcos explica que dependendo do estado atual do Mario (grande ou pequeno por exemplo), existem diferentes mudanças no personagem dependendo do que ele adquirir, por exemplo, caso Mario esteja no seu estado pequeno e ele obetenha o cogumelo vermelho, ele torna-se o Mario grande, porém, se o estado atual do Mario já for grande, ele recebe 1000 moedas. Isso mostra como o o padrão State age e vai funcionar dependendo do estado atual do personagem e também vária conforme ele adquire os diferentes "power ups" no decorrer do jogo.


