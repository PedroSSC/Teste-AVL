package AVL;

public class Exec {
    public static void main(String[] args) {
        Tree t = new Tree();
        
        t.inserirValor(30);
        t.inserirValor(20);
        t.inserirValor(10);
//        t.inserirValor(7);
//        t.inserirValor(8);
//        t.inserirValor(9);
        t.PreOrdem();
//        t.altura();
    }
    
}