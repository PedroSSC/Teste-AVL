package AVL;
public class Tree {
    private TreeNode raiz;
    
    public Tree(){
        raiz = null;
    }
    public boolean estahVazia(){
        return raiz == null;
    }
    
    public void inserirValor(int valor){
        if(estahVazia()){
            raiz = new TreeNode(valor);
        }
        else
            raiz.inserir(raiz, valor);

    }
    
    public void altura(){
        if(!this.estahVazia())
            System.out.println(raiz.altura(raiz));
        else
            System.out.println("Arvore vazia.");
    }
    
    public void PreOrdem(){
        raiz.preOrdemNode(raiz);
    }
    
}
