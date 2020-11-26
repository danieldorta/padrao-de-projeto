# Factory Method

## Classification
Criacional 

## Intent
Fornece um interface para criar objetos em uma superclasse e ainda sim permite que as subclasses alterem o tipo dos objetos que serão criados.

## Motivation

Imagine que você possua um código, no entanto, nesse algoritmo você esteja utilizando muito uma classe em específico e a grande parte de seu código esteja lá dentro. Após diversos acessos, tentar adicionar outra classe poderia se tornar um problema pra você, já que você teria que alterar toda a base do seu código, sem contar que futuramente, caso queira adicionar mais uma classe o mesmo processo se repetiria denovo e denovo.

Por isso, utilizar o Factory Method se torna uma opção viável, tendo em vista que a partir da sua aplicação é possível sobrescrever o método fábrica em uma subclasse e também mudar a classes de produtos que estão sendo criados pela chamada do método.

## Applicability

Usado quando é preciso fornecer para os seus usuários uma forma de estender seus componentes internos

Também, o Factory Method é muito usado quando não se sabe previamente os tipos e dependências dos objetos cujos os quais o código deve trabalhar.

Por exemplo, para adicionar um novo tipo de produto à aplicação, é preciso apenas criar uma nova subclasse criadora e substituir o método fábrica nela.

Por fim, ele também é utilizado para economizar recursos, reutilizando objetos existentes ao invés de recriar os mesmos objetos várias e várias vezes.

## Structure and Participants

![structure](https://user-images.githubusercontent.com/71103252/100393742-7c244700-3019-11eb-93f4-cfe182911ca1.png)

**Produto:** declara a interface comum a todos os objetos

**Produto Concretos:** implementações que se diferem da interface produto

**Criador:** declara o método fábrica que por sua vez retorna novos objetos produto

**Criadores Concretos:** sobrescrevem o método fábrica para retornar um tipo diferente de produto

## Sample code 

[Link para o exemplo do padrão de projeto em questão](https://github.com/danieldorta/padrao-de-projeto/tree/master/Factory%20Method/exemplo), retirado do blog [Thiengo](https://www.thiengo.com.br/padrao-de-projeto-factory-method)

Nesse exemplo podemos ver como ficaria a implementação do padrão Factory Method numa pizzaria onde os métodos comuns que estavam dentro da extinta classe Pizzaria poderão ser acessados pelas instâncias de PizzaFactorySaoPaulo e PizzaFactoryRioDeJaneiro, pois esses métodos comuns estão agora em PizzaFactory.
