class node {
    int data;
    node next;
    node prev;

    node(int data, node next, node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


public class convert_arr_DLL_02 
{
    public static node ConvertArr2DLL(int[] arr , node head)
    {
        head = new node(arr[0] , null , null);
        node prev = head;

        for(int i =1 ; i < arr.length ; i++)
        {
            node temp = new node(arr[i] , null , prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void traverse(int[] arr , node head)
    {
        node temp;
        temp = head;

        while(temp!=null)
        {
            // JUST TO CONVERT DATA INTO STRING FORM AND IF ITS THE FIRST NODE THEN NULL AS A STRING
            String prevData = (temp.prev != null) ? String.valueOf(temp.prev.data) : "null";
            System.out.println("data in temp " + temp.data + "data in prev " + prevData);
            temp = temp.next;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        node head = ConvertArr2DLL( arr, null);
        traverse(arr, head);
    }
}
