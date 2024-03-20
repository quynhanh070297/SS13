package demo;

public class tree
{
    Node root ;
    // them moi de quy bang cach tao ra mot phuong thuc tra ve mot node sau khi da them moi roi
    private Node addRecursive(Node current, int value)
    {
        if (current== null)
        {
            return new Node(value); // Note goc tra va goc can them moi
        }
        if (value< current.value)
        {
            current.left = addRecursive(current.left,value);
        }
        else if (value> current.value)
        {
            current.right = addRecursive(current.right,value);
        }
        return current;
    }
    public void add(int value)
    {
        this.root = addRecursive(root,value);

    }
}
