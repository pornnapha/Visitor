package rmuti.ds;

public class TreeTraversal {

	public void preOrder(Node r,Visitor v) {
		if(r==null) {
			return;
		}
		v.visit(r.getValue());
		preOrder(r.left,v);
		preOrder(r.right,v);
	}
	public void inOrder(Node r,Visitor v) {
		if(r==null) {
			return;
	}
		inOrder(r.left,v);
		v.visit(r.getValue());
		preOrder(r.right,v);
	}
	public void postOrder(Node r,Visitor v){
		if(r==null) {
			return;
	}
		preOrder(r.left,v);
		preOrder(r.right,v);
		v.visit(r.getValue());
	}

}
