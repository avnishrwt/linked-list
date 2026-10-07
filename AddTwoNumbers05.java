class node
{
    node prev;
    int data;
    node next;

    node(int data1)
    {
        data = data1;
        prev = null;
        next = null;
    }
}

class AddTwoNumbers05 {
    public static void main(String[] args) {
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

        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            carry = sum / 10;
            node newNode = new node(sum % 10);
            
            // Doubly Linked List ke liye prev link fix karne ke liye:
            newNode.prev = temp; 
            temp.next = newNode;
            
            temp = temp.next;
        }

        node head3 = dummynode.next;
        if (head3 != null) {
            head3.prev = null; // Head node ka prev disconnect kar rahe hain
        }
        
        DLLarray.traversal(head3);
    }
}