package testecomposite;


import java.util.ArrayList;


public class RoupaComposite extends CamisetaComponent {


 ArrayList<CamisetaComponent> camisetas = new ArrayList<CamisetaComponent>();


 public RoupaComposite(String marcaDaCamiseta) {
  this.marcaDaCamiseta = marcaDaCamiseta;
 }


 
 public void printNomeDoArquivo() {
  System.out.println(this.marcaDaCamiseta);
  for (CamisetaComponent arquivoTmp : camisetas) {
   arquivoTmp.printNomeDaCamiseta();
  }
 }


 @Override
 public void adicionar(CamisetaComponent novaCamiseta) {
  this.camisetas.add(novaCamiseta);
 }


 @Override
 public void remover(String nomeDaCamiseta) throws Exception {
  for (CamisetaComponent arquivoTmp : camisetas) {
   if (arquivoTmp.getNomeDaCamiseta()== nomeDaCamiseta) {
    this.camisetas.remove(arquivoTmp);
    return;
   }
  }
  throw new Exception("Não existe este camiseta");
 }

 
 public CamisetaComponent getCamiseta(String nomeDaCamiseta) throws Exception {
  for (CamisetaComponent arquivoTmp : camisetas) {
   if (arquivoTmp.getNomeDaCamiseta() == nomeDaCamiseta) {
    return arquivoTmp;
   }
  }
  throw new Exception("Não existe este camiseta");
 }


}
