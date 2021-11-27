package binary_search_tree;



public class SearchElement {
	public static class Node34{
		int key;
		Node34 left,right;
		Node34(int val)
		{
			key=val;
			left=right=null;
		}
	}
	public static Node34 root;
	public static void main(String[] args) {
		
	
		
		
		insert(15);
		insert(5);
		insert(20);
		insert(3);
		insert(18);
		insert(16);
		insert(80);
		
		boolean flag=search(5);
		System.out.println(flag);
		

	}

	private static boolean search(int i) {
		
		if(root==null)
		{
			return false;
		}
		else {
			Node34 curr=root;
			
			while(true)
			{
				if(curr.key==i)
				{
					return true;
				}
				else if(i>curr.key)
				{
					curr=curr.right;
					if(curr==null)
					{
						return false;
					}
				}
				else {
					curr=curr.left;
					if(curr==null)
					{
						return false;
					}
				}
			}
		}
		
	}

	private static void insert(int i) {
		
		Node34 n=new Node34(i);
		if(null==root)
		{
			root=n;
			return;
		}
		else {
			Node34 curr=root;
			Node34 parentNode=null;
			
			while(true)
			{
				parentNode=curr;
				if(i>curr.key) {
					curr=curr.right;
					if(null==curr)
					{
						parentNode.right=n;
						return;
					}
				}
				else {
					curr=curr.left;
					if(null==curr)
					{
						parentNode.left=n;
						return;
					}
				}
			}
		}
		
	}

}
