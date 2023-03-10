import java.io.*;
import java.util.*;
class Node  
{
int key;
Node left = null;
Node right = null;
public Node(int key)
{
this.key = key;
}
}

class BinaryTree
{

Node root;

public BinaryTree()
{
root = null;
}

public static List<Integer> function(Node node)
{
if(node==null)return null;
List<Integer> res = new ArrayList<>();
temp(node,res);
return res;
}

public static void temp(Node root,List<Integer> res)
{
if(root==null)return;

temp(root.left,res);
temp(root.right,res);
res.add(root.key);
}

public static void main(String[] gg)
{
BinaryTree tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.root.right.left = new Node(6);
tree.root.right.right = new Node(7); 
List<Integer> ans = new ArrayList<>();
ans=function(tree.root);
System.out.print(ans);
}

}