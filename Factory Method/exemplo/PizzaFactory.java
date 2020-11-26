public abstract class PizzaFactory {

    protected Pizza pizza;
    
    public abstract void criarPizza( String tipo );

    public Pizza delivery(){

        return pizza;
    }
}
