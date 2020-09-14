public class Cpu implements Componente{
List<Componente> lista = new ArrayList<Componente>();
int velocidade;

public Cpu(int vel){
velocidade = vel;
}
public   void adiciona(Componente cm){
  lista.add(cm);
}
public   void executa(){
Iterator it = lista.iterator();
while (it.hasNext()){
  it.next().executa();
}
System.out.println("cpu funcionando a "+velocidade +" Ghz");
}


}
