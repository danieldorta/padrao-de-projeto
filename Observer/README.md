# Observer 

## Classification
Comportamental 

## Intent
Permitir ao usuário que ele defina um método de assinatura para assim notificar diversos objetos que estão sendo trabalhados sobre quaisquer eventos que ocorram com os objetos definidos a serem observados, dai surge o nome do padrão de projeto, observer.

## Motivation
O padrão Observer é utilizado para poder permitir que o usuário possa fazer uma "assinatura" com um classe específica, da mesma forma que ele também pode "desassinar". Dessa forma toda vez que algum evento importante ocorrer com a(s) classe(s) que o usuário decidiu se inscrever, esse evento é passado para o assinante e chama um método de notificação nos objetos em questão.

Vale lembrar que todos os assinantes devem utilizar a mesma interface e nela devem ocorrer todas as comunicações. Isso ocorre porque em um exemplo real, se tivermos diversos assinantes, a classe "publicadora", ou seja, a classe que notifica o objeto de um evento, teria ser acoplada diversas vezes, por isso é melhor trabalhar numa mesma interface.

## Applicability

O Observer é usado, como já foi dito, quando você quer ser notificado de um evento que ocorra com determinada classe, no entanto, ele é mais comumente utilizado quando o usuário tem objetos que precisam observar outros objetos por tempo limitado.

O utilizam também quando a mudança de um objeto pode influenciar na mudança de outro e o usuário desconheci o número total de objetos ou seu valor muda constantemente.

## Structure and Participants

![structure](https://user-images.githubusercontent.com/71103252/96522704-610c2d80-124a-11eb-84a4-8631039546ec.png)

**Publischer:** envia os eventos assinados (de interesse) para os outros objetos.

**Subscriber interface:** declara a interface de notificação, na maioria das vezes só possui o método "update".

**Convrete Subscribers:** são eles que realizam ações quando eles recebem uma atualização da publicadora (Publisher). Implementam a mesma interface que a publicadora.

**Client:** Quem cria a publicadora e os objetos assinantes, em seguida ele atualiza tudo para que as assinaturas sejam registradas pela publicadora e ela consiga executar suas funções.

## Sample code 



