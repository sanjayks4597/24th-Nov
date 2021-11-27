package binary_search_tree;

public class ConvertSortedArrayIntoBST {
	public static  class TreeNode{
		int key;
		TreeNode left,right;
		TreeNode(int val)
		{
			key=val;
			left=right=null;
		}
	}
	static TreeNode root;
	public static void main(String[] args) {
		
		int nums[]= {-10,-3,0,5,9};
		
		sortedArrayToBST(nums);
	}

	 public static TreeNode sortedArrayToBST(int[] nums) {
	        
	        int low=0,high=nums.length-1;
	        return createBST(nums,low,high);
	    }
	    public static TreeNode createBST(int []nums ,int low,int high)
	    {
	        if(low > high) return null;
	        
	        int mid = low + (high - low)/2;
	        
	        TreeNode head = new TreeNode(nums[mid]);
	        
	        head.left = createBST(nums, low, mid-1);
	        head.right = createBST(nums, mid+1, high);
	        
	        return head;

	    }
}
