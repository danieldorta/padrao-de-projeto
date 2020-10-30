# Memento

## Classification
Comportamental

## Intent
Permitir que o usuário seja capaz de salvar e restaurar pontos específicos de determinado objeto sem revelar detalhes de implementação.

## Motivation
O padrão de projeto Memento é utilizado em larga escala principalmente quando estamos falando de editores, de texto por exemplo, pois dessa forma, com a implementação desse padrão de projeto é possível recuperar o estado padrão do objeto (o texto, neste caso).

Mas é claro que esse é apenas um exemplo, editores de imagem também são ótimos lugares para se aplicar o Memento e assim ele consegue recuperar o estado anterior da imagem que está sendo editada e copiar os dados para um objeto que vai ser futuramente restaurado.

## Applicability
O memento faz com que o objeto faça uma cópia de si mesmo (do seu estado), dessa forma nenhum outro objeto é capaz de interfirir, tornando assim o estado original do objeto seguro. 

No entanto, o memento é utilizado em maior escala quando precisamos produzir várias cópias do estado de determinado objeto para assim conseguirmos restaurar um estado anterior do objeto.

## Structure and Participants
Originadora: classe que produz retratos do seu próprio estado e também restaura o seu estado anterior quando necessário.

Memento: age como uma cópia do estado da originadora.

Cuidadora: Responsável por saber quando restaurar o estado. Tabém sabe quando e por quê capturar o estado da originadora.

## Sample code 

[Link para o exemplo apresentado em aula, sobre as tomadas](https://github.com/danieldorta/padrao-de-projeto/tree/master/Adapter/exemplo)

Esse talvez seja o exemplo mais comum que exista quando falamos do padrão de projeto Adapter. Nele é possível notar que o adaptador herda da classe que possuí seu "target".

Dentro do adaptador, o cliente precisa do TomadaDeTresPinos que será chamado em seguida no método ligarNaTomadaDeDoisPinos que na verdade está chamando o método ligarNaTomadaDeTresPinos do novo fornecedor.

É possível perceber que o cliente faz uma chamada usando a tomada de dois pinos, mas na realidade esta chamada está sendo adaptada para uma tomada de três pinos. Assim temos duas interfaces que não eram compatíveis que agora conseguem "conversar" entre si, normalmente.

