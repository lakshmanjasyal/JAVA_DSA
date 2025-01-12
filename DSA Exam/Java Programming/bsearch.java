import java.util.*;

class TreeNode{
int val;
TreeNode left;
TreeNode right;
TreeNode(int key)
{ val=key; 
  left=right=null;
  }}

class Binarytree{
TreeNode root;
public Binarytree()
{ root=null; }

public void insert(int key)
 { root=insertRec(root,key);
    }
private TreeNode insertRec(TreeNode root, int key)
 { if(root==null)
  { root = new TreeNode(key);
  return root;
  }
 if(key<root.val) {
   root.left=insertRec(root.left,key); }
 else {
  root.right=insertRec(root.right,key);}
  return root;}
  
 public void inOrder() {
  inOrderRec(root);
  System.out.println();
    }
    
 private void inOrderRec(TreeNode node)
  { if(node!=null) 
     { inOrderRec(node.left);
      System.out.print(node.val+" ");
      inOrderRec(node.right); }}
      
 public void preOrder() {
  preOrderRec(root);
  System.out.println();
    }
    
 private void preOrderRec(TreeNode node)
  { if(node!=null) 
     { System.out.print(node.val+" ");
       preOrderRec(node.left);
      preOrderRec(node.right); }}
      
      
 public void postOrder() {
  postOrderRec(root);
  System.out.println();
    }
    
 private void postOrderRec(TreeNode node)
  { if(node!=null) 
     { postOrderRec(node.left);
       postOrderRec(node.right); 
      System.out.print(node.val+" ");}}}
      
 public class bsearch{
   public static void main(String [] args)
    { Scanner sc = new Scanner(System.in);  
     Binarytree btree = new Binarytree ();
     boolean exit=false;
     while(!exit)
     { System.out.println("\n1.Add elements \n2.Inorder \n3.Preorder \n4.Postorder \n5.Exit \nEnter your choice");
     int ch=sc.nextInt();
     switch(ch)
      { case 1: System.out.print("Enter the element :");
                int element= sc.nextInt();
                btree.insert(element);
                break;
        case 2: btree.inOrder();
                break;
        case 3: btree.preOrder();
                break;
        case 4: btree.postOrder();
                break;
        case 5:System.out.println("Exited");
               exit=true;
                break;
        default: System.out.println("Invalid choice!");
        }}}}
        
        
     
   


