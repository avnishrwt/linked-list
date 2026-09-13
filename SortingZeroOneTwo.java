public class SortingZeroOneTwo {

    static node sortlist(node head) {

        // Dummy nodes
        node dummyzero = new node(0);
        node dummyone = new node(0);
        node dummytwo = new node(0);

        // Pointers for three lists
        node zero = dummyzero;
        node one = dummyone;
        node two = dummytwo;

        node temp = head;

        // Separate 0, 1 and 2
        while (temp != null) {

            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            }
            else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            }
            else {
                two.next = temp;
                two = two.next;
            }

            temp = temp.next;
        }

        // Connect 0 list -> 1 list -> 2 list
        zero.next = dummyone.next;
        one.next = dummytwo.next;

        // Very important: terminate the list
        two.next = null;

        return dummyzero.next;
    }

    public static void main(String[] args) {

        node head = null;

        int[] arr = {1, 2, 0, 1, 2, 0, 0, 1, 2};

        head = SLLarray.conversion(arr, head);

        head = sortlist(head);

        // print linked list
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}