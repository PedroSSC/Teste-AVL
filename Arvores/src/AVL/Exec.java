package AVL;

public class Exec {
    public static void main(String[] args) {
        Tree t = new Tree();
        System.out.println("Valor - FB");
        t.inserirValor(10);
        t.inserirValor(20);
        t.inserirValor(30);
        t.inserirValor(40);
        t.PreOrdem();
    }
}
