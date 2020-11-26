public class Pizzaria {

    private Pizza pizza;

    public void criarPizza(
        String cidade,
        String tipo ){

        if( cidade.equals("sao-paulo") ){

            if( tipo.equals( "queijo" ) ){

                pizza = new SPPizzaQuatroQueijos();
            }
            else if( tipo.equals( "portuguesa" ) ){

                pizza = new SPPizzaPortuguesa();
            }
            else if( tipo.equals( "calabresa" ) ){

                pizza = new SPPizzaCalabresa();
            }
        }
        else if( cidade.equals( "rio-de-janeiro" ) ){

            if( tipo.equals( "queijo" ) ){

                pizza = new RJPizzaQuatroQueijos();
            }
            else if( tipo.equals( "portuguesa" ) ){

                pizza = new RJPizzaPortuguesa();
            }
            else if( tipo.equals( "calabresa" ) ){

                pizza = new RJPizzaCalabresa();
            }
        }
    }

    public Pizza delivery(){

        return pizza;
    }
    ...
}
