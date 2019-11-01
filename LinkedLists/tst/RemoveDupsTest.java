import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDupsTest {
    @Test
    public void testRemoveDups() {
        Node<Integer> headNode = new Node<>();
        headNode.object = 1;

        Node<Integer> currentNode = new Node<>();
        currentNode.object = 2;
        currentNode.prevNode = headNode;
        headNode.nextNode = currentNode;

        Node<Integer> nextNode = new Node<>();
        nextNode.object = 1;
        nextNode.prevNode = currentNode;
        currentNode.nextNode = nextNode;

        assertEquals("12", getString(RemoveDups.removeDups(headNode)));
    }

    private String getString(Node<Integer> headNode) {
        Node<Integer> currentNode = headNode;
        StringBuilder stringBuilder = new StringBuilder();
        while(currentNode != null) {
            stringBuilder.append(Integer.toString(currentNode.object));
            currentNode = currentNode.nextNode;
        }
        return  stringBuilder.toString();
    }
}
