package linkedlist;

/*
add(E object)
addfirst(E object)
addlast(E object)
removeFirst()
removeLast()
clear()
getFirst()
getLast()

get(int index)
 */
public class MyLinkedList<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private boolean isFirstInitialization = true;
    private int index;

    public int getIndex() {
        return index;
    }

    public E get() {
        return null;
    }

    public class Node<E> {
        private E object;
        private Node previousNode;
        private Node nextNode;
    }

    public E getFirst() {
        if (this.firstNode == null) return null;
        return this.firstNode.object;
    }

    public E getLast() {
        if (this.lastNode == null) return null;
        return this.lastNode.object;
    }

    public void clear() {
        this.firstNode = this.lastNode = null;
        isFirstInitialization = true;
        this.index = 0;
    }

    public void add(E object) {
        addLast(object);
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
        this.index++;
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
        this.index++;
    }

    public E removeFirst() {
        if (this.firstNode == null) return null;
        Node<E> node = this.firstNode;
        if (this.lastNode == this.firstNode) {
            this.clear();
        }
        this.firstNode = this.firstNode.nextNode;
        this.firstNode.previousNode = null;
        this.index--;
        return node.object;
    }

    public E removeLast() {
        if (this.lastNode == null) return null;
        Node<E> node = this.lastNode;
        if (this.lastNode == this.firstNode) {
            this.clear();
        }
        this.lastNode = this.lastNode.previousNode;
        this.lastNode.nextNode = null;
        this.index--;
        return node.object;
    }

    private void firstInitial(E object) {
        if (firstNode == null || lastNode == null) {
            firstNode = lastNode = new Node<>();
            lastNode.object = object;
            isFirstInitialization = false;
            this.index++;
        }
    }
}
