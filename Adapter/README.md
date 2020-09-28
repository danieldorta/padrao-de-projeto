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

**Adaptador de classe**

![structure-class-adapter](https://user-images.githubusercontent.com/71103252/94495017-ff1a5400-01c6-11eb-97bb-f4eb808ef7a2.png)

Classse adaptador: não encobre os objetos como no exemplo anterior, já que ele herda tudo dos clientes e do serviço e sua adaptação acontece dentro dos métodos.

## Sample code 

[Link para o exemplo apresentado em aula, sobre as tomadas](https://github.com/danieldorta/padrao-de-projeto/tree/master/Adapter/exemplo)

Esse talvez seja o exemplo mais comum que exista quando falamos do padrão de projeto Adapter. Nele é possível notar que o adaptador herda da classe que possuí seu "target".

Dentro do adaptador, o cliente precisa do TomadaDeTresPinos que será chamado em seguida no método ligarNaTomadaDeDoisPinos que na verdade está chamando o método ligarNaTomadaDeTresPinos do novo fornecedor.

É possível perceber que o cliente faz uma chamada usando a tomada de dois pinos, mas na realidade esta chamada está sendo adaptada para uma tomada de três pinos. Assim temos duas interfaces que não eram compatíveis que agora conseguem "conversar" entre si, normalmente.

