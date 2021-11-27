package binary_search_tree;

public class DeleteNodeInBst {
	public class Node{
		int key;
		Node left,right;
		Node(int val)
		{
			key=val;
			left=right=null;
		}
		
	}
	public static  Node root;
	public static void main(String[] args) {
		DeleteNodeInBst ob1=new DeleteNodeInBst();
		ob1.insert(15);
		ob1.insert(12);
		ob1.insert(16);
		ob1.insert(25);
		ob1.insert(95);
		ob1.insert(5);
		
		ob1.insert(59);
		ob1.insert(151);
		ob1.insert(115);
		ob1.insert(7);
		ob1.insert(19);
		
		root=delete(59,root);
		
	}
	private static Node delete(int i,Node root) {
		
		if(root==null)
		{
			return null;
		}
		if(i>root.key)
		{
			root.right=delete(i,root.right);
		}
		else if(i<root.key) {
			root.left=delete(i,root.left);
		}
		else {
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			else {
				Node succ=getSucc(root);
				root.key=succ.key;
				root.right=delete(i,root.right);
			}
		}
		return root;
		
	}
	private static Node getSucc(Node root2) {
		Node curr=root2.right;
		while(curr!=null&& curr.left!=null)
		{
			curr=curr.left;
		}
		return curr;
	}
	private void insert(int i) {
		Node n=new Node(i);
		if(root==null)
		{
			root=n;
			return;
		}else {
			Node curr=root;
			Node parent=null;
			while(true)
			{
				parent=curr;
				if(i>curr.key)
				{
					curr=curr.right;
					if(curr==null)
					{
						parent.right=n;
						return;
					}
				}
				else {
					curr=curr.left;
					if(curr==null)
					{
						parent.left=n;
						return;
					}
				}
			}
		}
		
	}

}
