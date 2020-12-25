/** Node for a binary tree **/
public class TreeNode implements Comparable<TreeNode>{
	
	public Object element;
	
	public TreeNode leftChild;
	public TreeNode rightChild;
	
	public TreeNode (Object o) {
		this (o, null, null);
	}
	
	@Override
	public int compareTo(TreeNode other) {
	    int comparison= this.compareTo(other);
	    return comparison;
	}
	


	public TreeNode (Object o, TreeNode l, TreeNode r) {
		element = o;
		leftChild = l;
		rightChild = r;
	}
	
	public String toString() {
		return element.toString();
	}
	
	
	public boolean equals (TreeNode vasil, TreeNode vasil2) {
		if(vasil==null&&vasil2==null) {
			return true;
		}
		else if(vasil==null|| vasil2==null) {
			return false;
		}
		else if (!vasil.element.equals(vasil2.element)){
			return false;}
		else {return equals(vasil.leftChild, vasil2.leftChild)&& 
				equals(vasil.rightChild, vasil2.rightChild);
		}
	}
	
	public boolean checktree (TreeNode vasil) {
	if(vasil.leftChild.compareTo(vasil)>0) {return false;}
	else {return true;}
	}
	
}


