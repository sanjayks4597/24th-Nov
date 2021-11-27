package binary_search_tree;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
         this.right = right;
     }
}

public class TwoSum {
   static int sum=0;
   public static void main(String args[]) {
	   TreeNode root=new TreeNode(5);
	   root.left=new TreeNode(3);
	   root.left.left=new TreeNode(2);
	   root.left.right=new TreeNode(4);
	   root.right=new TreeNode(6);
	   root.right.right=new TreeNode(7);
	   
	   boolean b=findTarget(root,9);
	   System.out.println(b);
   }
   public static boolean findTarget(TreeNode root, int k) {
       
       int h=heightOfTree(root);
       for(int i=1;i<=h;i++)
       {
           int levelsum=accessKthLevelElement(root,i);
           if(levelsum==k)
           {
               return true;
           }
           sum=0;
       }
       return false;
       
   }
   public static int accessKthLevelElement(TreeNode root,int k){
       if(root==null)
       {
           return 0;
       }
        if(k==1)
       {
           sum+=root.val;
       }
       accessKthLevelElement(root.left,k-1);
       accessKthLevelElement(root.right,k-1);
      
       return sum;
   }
   public static int heightOfTree(TreeNode root)
   {
       if(root==null)
           return 0;
       return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
   }
}
