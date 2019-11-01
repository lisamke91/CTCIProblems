import java.util.Hashtable;

/*
 * 2.1  Write code to remove duplicates from an unsorted linked list.
 */

public class RemoveDups {
    public static Node<Integer> removeDups(Node<Integer> head) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        Node<Integer> trackingNode = head;

        while(trackingNode != null) {
            if(hashtable.containsKey(trackingNode.object)) {
                trackingNode.prevNode.nextNode = trackingNode.nextNode;
                if(trackingNode.nextNode != null) {
                    trackingNode.nextNode.prevNode = trackingNode.prevNode;
                }
            } else {
                hashtable.put(trackingNode.object, 1);
            }
            trackingNode = trackingNode.nextNode;
        }
        return head;
    }
}
