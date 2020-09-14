public class Usuario{

public void static main(String[] args){
Cache l1 = new Cache(4);
Cache l2 = new Cache(2);
Cpu miminx = new Cpu(5);

miminx.adiciona(l1);
miminx.adiciona(l1);
miminx.executa();

}

}
