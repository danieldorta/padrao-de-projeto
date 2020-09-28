# Adapter

## Classification
Estrutural

## Intent
Tornar objetos com interfaces incopatíveis em interfaces que possam "conversar" entre si.

## Motivation
Imagine que em determinada área especifica de uma empresa todos os arquivos de lá estão no formato "XML", no entanto você precisa utilizar um arquivo que não está nesse mesmo formato, ele esta em "JSON", por exemplo. 

Nesse caso, você teria duas opções, a priemira, não tão viavel, seria a mudança de todos os arquivos de "XML" para "JSON", o que soa jà um tanto quanto trabalhoso, por motivos óbvios, além do alto risco existe a grande chance de surgirem novos erros nesse processo.

A segunda opção seria a implementação do padrão de projeto em questão, dessa forma o Adapter vai usar uma interface compatível com os dois tipo de arquivos citados, em seguida, o objeto ira chamar o adaptador e por fim o adaptador passa o pedido para o outro objeto em questão mas em outro formato.

## Applicability
O Adapter vai sempre ser utíl quando estamos reutilizando muitas subclasses, subclasses que não possuim uma funcionalidade em comum que possa ser chamada pela superclasse.

Mas ele é usado principalmente, como já foi dito, quando temos um classe "X", por exemplo, mas a sua interface é incopatível com o resto do código, assim o adaptador entra e funciona como uma espécie de tradutor.

## Structure and Participants
**Adaptador de objeto**

![structure-object-adapter](https://user-images.githubusercontent.com/71103252/94495075-2d982f00-01c7-11eb-8270-cbd9dafcab3d.png)

Cliente: classe que contém a lógica. 

Interface do cliente: é o molde que as outras classe devem seguir.

Serviço: classe na qual o cliente não pode "chamar" porque possui uma interface incopatível.

Adaptador: trabalha tanto com o cliente tanto com o serviço, implementa a interface do cliente enquanto está encobrindo o objeto do serviço, ele é o tradutor.

**Adptador de classe**

![structure-class-adapter](https://user-images.githubusercontent.com/71103252/94495017-ff1a5400-01c6-11eb-97bb-f4eb808ef7a2.png)

Classse adptador: não encobre os objetos como no exemplo anterior, já que ele herda tudo dos clientes e do serviço e sua adptação acontece dentro dos métodos.

## Sample code 



