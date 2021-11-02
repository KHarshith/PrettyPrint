public class PrettyPrint {
   
    private class Node {
       Node left;
       Node right;
       double data;
       int level;
    }
 
    public void inorder(Node node) {
        if(node == null) {
          return;
        }
       
        inorder(node.left);
        System.out.print(node.data + ",");
        inorder(node.right);
    }
   
    public void print(Node node) {
        if(node == null) {
          return;
        }
       
        print(node.right);
        System.out.println(addspace(4 * node.level, Double.toString(node.data)));
        print(node.left);
     }
     
     String addspace(int nSpaces, String inputStr)
    {      
        StringBuilder str = new StringBuilder();
        for(int j=0;j<nSpaces;j++)
        {
                str.append(" ");
        }
        str.append(inputStr);          
        return str.toString();        
    }
 
    public Node insertValue(double val, Node node, int level) {
        if(node == null) {
            return createNewNode(val, level);
        }
   
        if(val < node.data) {
            node.left = insertValue(val, node.left, level+1);
        } else if((val > node.data)) {
            node.right = insertValue(val, node.right, level + 1);
        }
        return node;
    }
 
    public Node createNewNode(double val, int level) {
        Node node = new Node();
        node.data = val;
        node.left = null;
        node.right = null;
        node.level = level;
        return node;
    }


  public static void main(String[] args) {
    PrettyPrint bst = new PrettyPrint();
    Node root = null;
   System.out.println("yes");
  
    root = bst.insertValue(7,root,0);
    root = bst.insertValue(12,root,0);
    root = bst.insertValue(16,root,0);
    root = bst.insertValue(1,root,0);
    root = bst.insertValue(3,root,0);
    root = bst.insertValue(9,root,0);
    root = bst.insertValue(5,root,0);
    root = bst.insertValue(2,root,0);
    root = bst.insertValue(15,root,0);
    root = bst.insertValue(89,root,0);
    root = bst.insertValue(90,root,0);
    root = bst.insertValue(19,root,0);
    root = bst.insertValue(11,root,0);
    
   
    bst.print(root);
    System.out.println();
    bst.inorder(root);
   
  }

}









