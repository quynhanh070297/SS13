package thuchanh4;

public class TreeNode<E>
{
    //Thuc hanh xay dung lop tim kiem nhi phan

    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    public TreeNode (E e)
    {
        element = e;
    }
}
