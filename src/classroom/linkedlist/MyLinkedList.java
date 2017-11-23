package classroom.linkedlist;

public class MyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private boolean isFirstInitialization = true;

    public class Node<E> {
        private E object;
        private Node previousNode;
        private Node nextNode;
    }

    public void addLast(E object) {
        if (isFirstInitialization) {
            firstInitial(object);
            return;
        }
        Node<E> newLastNode = new Node<>();
        newLastNode.object = object;
        newLastNode.previousNode = this.lastNode;
        this.lastNode.nextNode = newLastNode;
        this.lastNode = newLastNode;
    }

    public void addFirst(E object) {
        if (isFirstInitialization) {
            firstInitial(object);
            return;
        }
        Node<E> newFirstNode = new Node<>();
        newFirstNode.object = object;
        newFirstNode.nextNode = this.firstNode;
        this.firstNode.previousNode = newFirstNode;
        this.firstNode = newFirstNode;
    }

    public E removeFirst(E object) {
        return null;
    }

    public E removeLast(E object) {
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode) {
            this.lastNode = this.firstNode = null;
            isFirstInitialization = true;
        }
        this.lastNode = this.lastNode.previousNode;
        this.lastNode.nextNode = null;
        return node.object;
    }

    private void firstInitial(E object) {
        if (firstNode == null || lastNode == null) {
            firstNode = lastNode = new Node<>();
            lastNode.object = object;
            isFirstInitialization = false;
        }
    }
}
