public abstract class CamisetaComponent {


 String marcaDaCamiseta;


 public void printNomeDaCamiseta() {
  System.out.println(this.marcaDaCamiseta);
 }


 public String getNomeDaCamiseta() {
  return this.marcaDaCamiseta;
 }


 public void adicionar(CamisetaComponent novaCamiseta) throws Exception {
  throw new Exception("erro");
 }


 public void remover(String marcaDaCamiseta) throws Exception {
  throw new Exception("Erro");
 }

 public CamisetaComponent getCamiseta(String marcaDacamiseta) throws Exception {
  throw new Exception("Erro");
 }
}
