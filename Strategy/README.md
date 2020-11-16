# Strategy

## Classification
Comportamental

## Intent
Definir um conjunto de algoritmos intercambiáveis e torna-los independentes dos clientes que os utilizam. 

## Motivation
O padrão Strategy tem como objetivo gerenciar as lógicas condicionais do algoritmo, vale lembrar, que as lógicas condicionais são de longe uma das estruturas mais complexas usadas no desenvolvimento de software. O padrão Strategy pode parece muito com o padrão State, no entanto no caso do Strategy, existe a necessidade de uma estrutura de herança e cada subclasse dessa herança seria uma váriação do algoritmo.

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


