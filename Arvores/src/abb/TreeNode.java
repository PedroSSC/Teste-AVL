package abb;
public class TreeNode {
    private TreeNode dir, esq;
    private int info;
    
    public TreeNode(int valor){
        info = valor;
        esq = dir = null;
    }
    
    
    public void insereNo(int valor){
        if(valor < info){
            if(esq == null)
                esq = new TreeNode(valor);
            else
                esq.insereNo(valor);
        }
        else{
            if(dir == null)
                dir = new TreeNode(valor);
            else
                dir.insereNo(valor);
        }
    }
    
    public int altura(TreeNode raiz){
        if(raiz != null){
            int aEsq = altura(raiz.esq);
            int aDir = altura(raiz.dir);
            if(aEsq > aDir)
                return aEsq+1;
            else
                return aDir+1;
        }
        else
            return 0;
    }
    
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
            preOrdemNode(raiz.dir);
        }
    }
}
