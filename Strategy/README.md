# Strategy

## Classification
Comportamental

## Intent
Definir um conjunto de algoritmos intercambiáveis e torna-los independentes dos clientes que os utilizam. 

## Motivation
O padrão Strategy tem como objetivo gerenciar as lógicas condicionais do algoritmo, vale lembrar, que as lógicas condicionais são de longe uma das estruturas mais complexas usadas no desenvolvimento de software. O padrão Strategy pode parece muito com o padrão State, no entanto o state é usado para guardar um estado (por exemplo, numa sequencia de tratamento de determinado dado, é comum ter vários estados. Assim, o estado é alterado várias vezes). Já o strategy é feito para selecionar algoritmos diferentes de tratamento de dados. Ou seja, não é esperado que sua implementação mude muito numa mesma sequência de tratamento.

## Applicability
Usado com o objetivo de diminuir ou remover a lógica condicional, simplificar classes, entre outras vantagens, porém, valé lembrar que esse só é aplicado em alguns casos, são eles:

-Quando uma classe possui muitos "if's" (condicionais, que são movidas para o Strategy).

-Caso seja necessário criar váriantes para um algoritmo

-E por fim, quando ocultar ao usuário dados mais complexos é necessário para deixar seu código mais "clean".

## Structure and Participants

![09j782i4d422a779bkf7907oi3950ab95fe613edf46f2c3cebb61d52d3](https://user-images.githubusercontent.com/71103252/99288245-131f2100-281a-11eb-8288-b06131d37921.jpg)

**Strategy:** Interface comum a todas as subclasses para chamar uma das classes StrategyConcreto.

**StrategyConcreto:** Herda a classe de Strategy

**Contexto:** interface que acessa um dos algoritmos das subclasses de Strategy.

## Sample code 

[Link para o código exemplo do padrão Strategy](https://github.com/danieldorta/padrao-de-projeto/tree/master/Strategy/exemplo)

Nesse exemplo retirado da página do [Wikipedia](https://pt.wikipedia.org/wiki/Strategy) que trata sobre o assunto do padrão em questão, temos a implementação de um algoritmo que calcula o valor da comissão de cada funcionário, no entanto, esse valor difere dependendo do cargo do funcionário.


