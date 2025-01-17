import java.util.Scanner;

class BinaryTree {
     public BinaryTree(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    // Insert Element

    public void populate(Scanner scanner){
    System.out.println("Enter the root node");
    root=new Node(scanner.nextInt());
    populate(scanner , root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of "+node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left node of "+node.value);
            node.left=new Node(scanner.nextInt());
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of "+node.value);    
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right node of "+node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    } 

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }
    public void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right, level+1);
        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.print("\t\t");
            }
            System.out.println("--------->"+node.value);
        }
        else{
            System.out.println(node.value);
        }   
    
        prettyDisplay(node.left, level+1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
    } 
}
