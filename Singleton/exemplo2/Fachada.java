public class Fachada implements IFachada {
 private static Fachada instancia;
 private Fachada ( ) {
 this.controladorAluno = new ControladorAluno( );
 }
 public static Fachada getInstancia( ) {
 if (instancia == null) {
 instancia = new Fachada( );
 }
 return instancia;
 }
}
