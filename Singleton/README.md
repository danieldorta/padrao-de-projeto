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
O singleton possui apenas um participante, a própria classe singleton que declara 'getInstance' e assim retorna a instância da própria classe. O construtor do singleton é privado e deve estar escondido no código cliente e apenas com 'getInstance' o objeto será chamado.

## Sample code 

