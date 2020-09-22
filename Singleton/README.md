# Singleton

## Classification
Padrão Criacional

## Intent
Garantir que uma classe tenha apenas uma instância, ao mesmo tempo que ele deve prover um ponto de acesso global para esssa instância. 

## Motivation
O Singleton resolve dois problemas, o primeiro deles, evita que o algoritmo tenha várias e várias instâncias. O segundo problema é que a partir do uso de váriaveis globais o seu algoritmo pode estar muitas vezes inseguro já que qualquer código pode sobrescrever o seu conteúdo e assim causar uma falha no programa. Com o singleton isso não ocorre, devido, como já foi dito, a criação de um acesso global para a instância em questão.

## Applicability
Umas das aplicações do Singleton é quando você precisa ter um controle maior/mais escrito sobre as demais váriaveis globais, tendo em vista que o Singleton garante que exista apenas uma instância e somente o próprio singleton pode modifica-lo.
Além disso, o singleton impede a criação de objetos, somente pelo método especial de criação. Assim, cria um novo objeto ou retorna caso o mesmo já tenha sido criado.

## Structure and Participants
![structure-pt-br-indexed](https://user-images.githubusercontent.com/71103252/93896552-6e73dd80-fcc7-11ea-8eff-b7131ba33bdc.png)

O singleton possui apenas um participante, a própria classe singleton que declara 'getInstance' e assim retorna a instância da própria classe. O construtor do singleton é privado e deve estar escondido no código cliente e apenas com 'getInstance' o objeto será chamado.

## Sample code 

[Link para o exemplo apresentedado em aula](https://github.com/danieldorta/padrao-de-projeto/tree/master/Singleton/exemplo1)

O próximo exemplo foi retirado de um slide do professor Márcio Bueno da Faculdade Católica de Pernambuco, [link](https://marciobueno.com/arquivos/ensino/poo/POO_16_Singleton.pdf), e nesse exemplo temos a implementação do singleton em um sistema de cadastro de alunos, assim como mostra a imagem abaixo:

![Captura de tela 2020-09-22 115141](https://user-images.githubusercontent.com/71103252/93898996-3b7f1900-fcca-11ea-84ea-c012eb7e0c98.png)

[Link para o exemplo de Márcio Bueno]




