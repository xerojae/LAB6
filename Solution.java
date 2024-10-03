public class Solution{
    public ListNode rotateRight(ListNode head, int k){
        if(head == null){
            return head;
        }

        int size = 1;
        
        ListNode sizeNode = head;

        while(sizeNode.next != null){
            size++;
            sizeNode = sizeNode.next;
        }

        ListNode newNode = head;

        for(int i = 1; i < size - k % size; i ++){
            newNode = newNode.next;
        }
        sizeNode.next = head;
        head = newNode.next;
        newNode.next = null;
        return head;
    }

    // Helper method to create a linked list from an array of integers
    public ListNode createLinkedList(int[] nums){
        if(nums.length == 0){
            return null; // Return null if the array is empty
        }

        ListNode head = new ListNode(nums[0]);
        ListNode current = head;

        // Iterate through the rest of the array and build the linked list
        for(int i = 1; i < nums.length; i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        return head; // Return the head of the linked list
    }

    // Helper method to print the linked list
    public void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}