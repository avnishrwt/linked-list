class AddTwoNumbers05
{
    public static void main(String[] args) 
    {
        int[] arr1 = {3, 5};
        int[] arr2 = {4, 5, 9, 9};

        node head1 = null;
        node head2 = null;
        head1 = DLLarray.conversion(arr1, head1);
        head2 = DLLarray.conversion(arr2, head2);

        node dummynode = new node(-1);
        node temp = dummynode;

        node t1 = head1;
        node t2 = head2;

        int carry = 0;

        while(t1 != null || t2 != null || carry != 0)
        {
            int sum = carry;

            if(t1 != null)
            {
                sum += t1.data;
                t1 = t1.next;
            }

            if(t2 != null)
            {
                sum += t2.data;
                t2 = t2.next;
            }

            carry = sum / 10;
            temp.next = new node(sum % 10);
            temp = temp.next;
        }

        node head3 = dummynode.next;
        DLLarray.traversal(head3);
    }
}