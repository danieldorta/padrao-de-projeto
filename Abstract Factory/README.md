# Abstract Factory 

## Classification
Criacional 

## Intent
Criar famílias de objetos relacionados entre si sem a necessidade de especificar suas classes concretas.

## Motivation

Imagine que existam diferentes estilos de interação com diferentes apresentações e comportamento para os widgets de uma interface de usuário, como por exemplo, botões, barras de rolamento e janelas. Dessa forma não podemos programar um estilo padrão e caso instanciemos classes especícas para cada estilo diferente, teremos um código longo, complexo e toda vez que precisarmos realizar mudanças, será mais complicado. Por isso utilizamos os Abstract Factory, com ele é possível definir uma classe abstrata que ira declarar uma interface de criação para os botões, janelas, etc.

## Applicability

O abstract factory é muito utilizado quando possuímos um código que precisa trabalhar com várias famílias de produtos relacionados, um outro bom exemplo seria uma loja de móveis, que possui cadeiras, mesas e sofás, e cada um desses móveis possuem 3 variações, podemos chama-las de X,Y e Z. Todos os móveis possuem essas mesmas variações e tudo depende da escolha do cliente. Tendo isso em mente, utilizando o abstract factory, não é mais necessário ficar criando variantes a todo momento caso os produtos em questão não respeitem as condições implícitas.

## Structure and Participants

![structure](https://user-images.githubusercontent.com/71103252/100380050-d52db400-2ff4-11eb-9e6f-38f27562e975.png)

**Produtos Abstratos:** declaram as interfaces para objetos distintos mas que fazem parte da mesma familía

**Produtos Concretos:** implementações de produtos abstratos unidos pelas variantes

**Fábrica Abstrata:** declara os métodos para criar os produtos abstratos

**Fábricas concretas:** implementam métodos de criação de fábrica abstratos

**Cliente:** trabalha com qualquer variante de produto ou fábrica (concreto)

## Sample code 

[Link para o código exemplo](https://github.com/danieldorta/padrao-de-projeto/tree/master/Abstract%20Factory/exemplo), retirado do Blog de [Marcos Brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/)

Nesse exemplo temos uma fábrica de carros que faz carros de determinada marca (Fiat) e alguns modelos (Sedan e Populares). Os produtos são divididos em dois grupos e cada um deles possui um conjunto de atributos e métodos próprios.

Feito isso, através das referências para uma fábrica abstrata, somos capazes de chamar o que quisermos dependendo da nossa necessidade.
