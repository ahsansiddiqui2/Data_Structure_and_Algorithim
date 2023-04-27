package Finals_Practice_Uzair;


public class AVLTree {
    private int key, height;
    AVLTree left, right;
    public static final AVLTree NIL = new AVLTree();

    private AVLTree() {
        left = right = this;
        height = -1;
    }

    private AVLTree(int key, AVLTree left, AVLTree right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = (1 + Math.max(left.height, right.height));
    }

    public AVLTree(int key) {
        this.key = key;
        left = right = NIL;
    }

    public boolean add(int key) {
        int oldsize = size();
        grow(key);

        return size() > oldsize;
    }

    public int size() {
        if (this == NIL) {
            return 0;
        } else {
            return 1 + (left.size() + right.size());
        }
    }

    public AVLTree grow(int key) {
        if (this == NIL) {
            return new AVLTree(key);
        }
        if (key == this.key) {
            return this;
        }
        if (key < this.key) {
            left = left.grow(key);
        } else {
            right = right.grow(key);
        }
        rebalance();
        height = 1 + Math.max(left.height, right.height);

        return this;
    }

    public String toString() {
        if (this == NIL) {
            return "";
        }
        return (left + " " + key + " " + right);
    }

    public String Preorder() {
        if (this == NIL) {
            return "";
        }
        return (key + " " + left + " " + right);
    }

    public String Postorder() {
        if (this == NIL) {
            return "";
        }
        return (left + " " + right + " " + key);
    }

    public void rotateLeft() {
        left = new AVLTree(key, left, right.left);
        key = right.key;
        right = right.right;
    }

    public void rotateRight() {
        right = new AVLTree(key, left, right.right);
        key = left.key;
        left = left.left;
    }

    private void rebalance() {

        if (right.height > left.height + 1) { // checking balance factor left-right
            if (right.left.height > right.right.height) {
                right.rotateRight();
            } else {
                rotateLeft();
            }
        }
        if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) {
                left.rotateLeft();
            }else{
                rotateRight();
            }
        }
    }

    public static void main(String[] args) {
        AVLTree a = new AVLTree(2);
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        for (int i = 0; i < values.length; i++) {
            a.add(values[i]);
        }
        System.out.println("Height: " + a.height);
        System.out.println("In Order : " + a.toString());
        System.out.println("Pre Order : " + a.Preorder());
        System.out.println("Post Order : " + a.Postorder());
    }
}
