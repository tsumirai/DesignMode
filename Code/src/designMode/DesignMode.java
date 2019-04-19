package designMode;

public class DesignMode {
	TreeNode root = null;

	public DesignMode(String name) {
		root = new TreeNode(name);
	}

	public static void main(String []args) {
		DesignMode tree = new DesignMode("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished");
	}
}
