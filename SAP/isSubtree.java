package SAP;

public class isSubtree {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if (T == null) {
            return false;
        }
        if (T.data == S.data) {
            if (isIdentical(T, S)) {
                return true;
            }
        }
        // if(T.data == S.data){
        return isSubtree(T.left, S) || isSubtree(T.right, S);
        // }

        // return false;

    }

    public static boolean isIdentical(Node T, Node S) {
        if (T == null && S == null) {
            return true;
        }
        if (T == null || S == null || T.data != S.data) {
            return false;
        }
        if (!isIdentical(T.left, S.left)) {
            return false;
        }

        if (!isIdentical(T.right, S.right)) {
            return false;
        }
        return true;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}