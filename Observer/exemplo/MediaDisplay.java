public class MediaDisplay {

    private Subject subject;
    private float temperaturaMin, temperaturaMax, temperaturaMed;
    private float umidadeMin, umidadeMax, umidadeMed;
    private float pressaoMin, pressaoMax, pressaoMed;

    public void display(){

        System.out.println( "Temperatura média: " + temperaturaMed );
        System.out.println( "Umidade média: " + umidadeMed );
        System.out.println( "Pressão média: " + pressaoMed );
    }
}
