# Composite

 O composite é usado para representar hierarquias de componentes da interface do usuário ou o código que funciona com grafos.

 O Composite é reconhecido pelos seus métodos componamentais, ele transforma uma instância do mesmo tipo (abstrato/interface) em outra estrutura, em árvore
e assim, permite que você trabalhe nessa estrutura como objetos individuais.

 Dessa forma, é possível concluir que o padrão composite tem como função compor objetos em estruturas de árvore e dessa forma ser capaz de representar a hierarquia como um todo.
Um bom exemplo para tentar entender como o composite funciona é o exército. No exército existe uma hierarquia, onde o maior escalão passa a ordem para os participantes
de escalão menor, e assim sucessivamente até o participante de menor escalão, que só recebe as ordens.

 A estrutura do composite é constituida em 4 elementos: a folha, o cliente, composite e o componente.
A folha é o elemento base de uma árvore e executa as funções.
O cliente trabalha com todos os elementos da árvroe atráves do componente.
O componente por sua vez descreve a função dos elementos da árvore.
E por fim, o composite possuí sub-elementos e são esses sub-elementos (folhas ou até mesmo outros composite) que executam as funções destinadas a ele e em seguida
retornam os resultados para o cliente.

 Sua aplicação é eficaz quando estamos falando de uma estrutura de árvore, caso contrário, o composite não é a melhor opção. Além disso, vale lembrar 
que o composite é muito útil por tratar todos os elementos de forma individual e uniforme.

 ## Código exemplo:
 
 [Link para ir para o código](https://github.com/danieldorta/padrao-de-projeto/tree/master/composite/exemplo)
 
O código exemplo apresentado na pasta exemplo foi retirado do site [Padrões de Projeto de Software](http://padroesdeprojetodesoftware.blogspot.com/2012/06/nome-e-classificacao-do-padrao.html)

Nesse exemplo temos algumas funções, entre elas, a função de adicionar estilos de camisas, marcas, remover camisas, etc. Segue uma imagem da estrutura desse exemplo (imagem
retirada do mesmo site apresentado acima).

![Sem+título](https://user-images.githubusercontent.com/71103252/93113738-f9355680-f68f-11ea-8429-920be2fac936.png)

