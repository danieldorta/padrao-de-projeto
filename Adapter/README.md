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

## Sample code 



