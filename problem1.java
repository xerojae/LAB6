public class problem1{
    public static void main(String[] args){
        Solution solution = new Solution();

        // Test Case 1
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        int nums1[] = {1, 2, 3, 4, 5};
        ListNode head1 = solution.createLinkedList(nums1);
        int k1 = 2; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead1 = solution.rotateRight(head1, k1);
        // Print the list
        System.out.print("Test Case 1: ");
        solution.printList(rotatedHead1);

        // Test Case 2
        // Creating a linked list: 0 -> 1 -> 2
        int nums2[] = {0, 1, 2};
        ListNode head2 = solution.createLinkedList(nums2);
        int k2 = 4; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead2 = solution.rotateRight(head2, k2);
        // Print the list
        System.out.print("Test Case 2: ");
        solution.printList(rotatedHead2);

        // Test Case 3
        // Creating a linked list: 1 
        int nums3[] = {1};
        ListNode head3 = solution.createLinkedList(nums3);
        int k3 = 99; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead3 = solution.rotateRight(head3, k3);
        // Print the list
        System.out.print("Test Case 3: ");
        solution.printList(rotatedHead3);

        // Test Case 4
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        int nums4[] = {1, 2, 3, 4, 5};
        ListNode head4 = solution.createLinkedList(nums4);
        int k4 = 0; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead4 = solution.rotateRight(head4, k4);
        // Print the list
        System.out.print("Test Case 4: ");
        solution.printList(rotatedHead4);

        // Test Case 5
        // Creating a linked list: 10 -> 20 -> 30 -> 40 -> 50
        int nums5[] = {10, 20, 30, 40, 50};
        ListNode head5 = solution.createLinkedList(nums5);
        int k5 = 5; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead5 = solution.rotateRight(head5, k5);
        // Print the list
        System.out.print("Test Case 5: ");
        solution.printList(rotatedHead5);

        // Test Case 6
        // Creating a linked list: { }
        int nums6[] = {};
        ListNode head6 = solution.createLinkedList(nums6);
        int k6 = 3; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead6 = solution.rotateRight(head6, k6);
        // Print the list
        System.out.print("Test Case 6: ");
        solution.printList(rotatedHead6);

        // Test Case 7
        // Creating a linked list 1 -> 2 -> 2 -> 2 -> 3 -> 4 -> 5 -> 5 -> 6
        int nums7[] = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        ListNode head7 = solution.createLinkedList(nums7);
        int k7 = 3; // Number of positions to rotate
        // Create an instance of Solution and rotate the list
        ListNode rotatedHead7 = solution.rotateRight(head7, k7);
        // Print the list
        System.out.print("Test Case 7: ");
        solution.printList(rotatedHead7);
    }
}