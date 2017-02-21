package AVL;


public class TreeNode {
    private TreeNode dir, esq, pai;
    private int info, fb;

    
    public TreeNode(int valor){
        info = valor;
        esq = dir = pai = null;
        fb = 0;
    }
    
    public void inserir(TreeNode raiz, int valor){
        TreeNode n = new TreeNode(valor);
        inserirAVL(raiz, n);
    }
    
    public void inserirAVL(TreeNode raiz, TreeNode aInserir){
        if(aInserir.info < raiz.info){
            if(raiz.esq == null){
                raiz.esq = aInserir;
                aInserir.pai = raiz;
                //verificarFB(this);
            }
            else{
                inserirAVL(raiz.esq, aInserir);
                //verificarFB(this);
            }
        }
        else if(aInserir.info > raiz.info){
            if(raiz.dir == null){
                raiz.dir = aInserir;
                aInserir.pai = raiz;
                //verificarFB(this);
            }
            else{
                inserirAVL(raiz.dir, aInserir);
                //verificarFB(this);
            }
        }
    }
    
    public void verificarFB(TreeNode atual){
        //Atualmente este método não está sendo utilizado.
        //Ele será responsável por chamar os métodos de rotação.
        setFB(atual);
        int fb = atual.fb;
        //Continuar daqui.
       
    }
    
    public void setFB(TreeNode no){
        //Método responsável pela verificação do Fator de Balanceamento do Nó.
        no.fb=(altura(no.dir)-altura(no.esq));
    }
    
    public int altura (TreeNode atual){
        //Retorna a altura do nó indicado.
        if(atual == null){
            return -1;
        }
        if(atual.dir == null && atual.esq == null)
            return 0;
        else if(atual.esq == null)
            return 1 + altura(atual.dir);
        else if(atual.dir ==null)
            return 1+altura(atual.esq);
        else
            return 1 + Math.max(altura(atual.esq), altura(atual.dir));
        
    }

    public void preOrdemNode(TreeNode raiz){
        //Antes de entrar da primeira recusividade, sempre chamar o método de verificar o Fator de Balanceamento.
        if(raiz != null){
            verificarFB(raiz);
            preOrdemNode(raiz.esq);
            System.out.println(raiz.info + " - " + raiz.fb);
            preOrdemNode(raiz.dir);
        }
    }
}
