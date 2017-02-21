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
                //verificarFB(raiz);
            }
            else{
                inserirAVL(raiz.esq, aInserir);
            }
        }
        else if(aInserir.info > raiz.info){
            if(raiz.dir == null){
                raiz.dir = aInserir;
                aInserir.pai = raiz;
                //verificarFB(raiz);
            }
            else{
                inserirAVL(raiz.dir, aInserir);
            }
        }
    }
    
    public void verificarFB(TreeNode atual){
        atual.fb = (altura(atual.dir)-altura(atual.esq));

    }
    

    
    public int altura (TreeNode atual){
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
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public int altura(TreeNode raiz){
//        if(raiz != null){
//            int aEsq = altura(raiz.esq);
//            int aDir = altura(raiz.dir);
//            if(aEsq > aDir)
//                return aEsq+1;
//            else
//                return aDir+1;
//        }
//        else
//            return 0;
//    }

    
    
    
    
//    public void insereNo(int valor){
//        if(valor < info){
//            if(esq == null)
//                esq = new TreeNode(valor);
//            else
//                esq.insereNo(valor);
//        }
//        else{
//            if(dir == null)
//                dir = new TreeNode(valor);
//            else
//                dir.insereNo(valor);
//        }
//    }
    
    
//    public int fb(TreeNode raiz){
//            int aEsq = 0;
//            int aDir = 0;
//        if(raiz != null){
//            aEsq += altura(raiz.esq);
//            aDir += altura(raiz.dir);
//        }
//        return aDir - aEsq;
//
//    }
    
    public void preOrdemNode(TreeNode raiz){
        if(raiz != null){
            preOrdemNode(raiz.esq);
            System.out.println(raiz.info + " - " + raiz.fb);
            preOrdemNode(raiz.dir);
        }
    }
}
