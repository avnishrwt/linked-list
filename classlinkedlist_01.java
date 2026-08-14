class node 
{
    int data;
    node next;

    node(int data1 , node next1)
    {
        this.data = data1;
        this.next = next1;
    }


    node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
    
} 

public class classlinkedlist_01 
{
    public static void main(String[] args) 
    {
        int[] arr = {2 , 34 , 5 , 78 , 45};

        node y = new node(arr[0]);


        System.out.println(y.data);
    }
}
