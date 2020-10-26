public class PressaoAtmosfericaDisplay {

    private float temperatura;
    private float pressao;

    public void display(){

        System.out.println( "Pressão atmosférica: " + calcPressaoAtmosferica() );
    }
}
