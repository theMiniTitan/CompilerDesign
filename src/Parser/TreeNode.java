//
//	COMP3290/6290 CD Compiler
//
//	Syntax Tree Class - Builds a syntax tree node
//
//	M. Hannaford
//	17-Aug-2016
//
//

public class TreeNode {

    private static int count = 0;
    private static int index = 0;
    private Node nodeValue;
    private int idx;
    private TreeNode left,middle,right;
    private StRec name, type;

    public TreeNode () {
        nodeValue = Node.NUNDEF;
        index++;
        idx = index;
        left = null;
        middle = null;
        right = null;

        name = null;
        type = null;
    }

    public TreeNode (Node value) {
        this();
        nodeValue = value;
    }

    public TreeNode (Node value, StRec st) {
        this(value);
        name = st;
    }

    public TreeNode (Node value, TreeNode l, TreeNode r) {
        this(value);
        left = l;
        right = r;
    }

    public TreeNode (Node value, TreeNode l, TreeNode m, TreeNode r) {
        this(value,l,r);
        middle = m;
    }

    public Node getValue() { return nodeValue; }

    public TreeNode getLeft() { return left; }

    public TreeNode getMiddle() { return middle; }

    public TreeNode getRight() { return right; }

    public StRec getName() { return name; }

    public StRec getType() { return type; }

    public void setValue(Node value) { nodeValue = value; }

    public void setLeft(TreeNode l) { left = l; }

    public void setMiddle(TreeNode m) { middle = m; }

    public void setRight(TreeNode r) { right = r; }

    public void setName(StRec st) { name = st; }

    public void setType(StRec st) { type = st; }

    public static void resetIndex() {
        index = 0;
    }

    public String toString(){
        String output = getValue().toString();
        if(name!=null){
            output+=" "+name.getName();
        }
        if(type!=null){
            output+=" "+type.getName();
        }
        output+=" ";
        while(output.length()%7!=0){ //format so each token lines up
            output+=" ";
        }
        return output;
    }

}
