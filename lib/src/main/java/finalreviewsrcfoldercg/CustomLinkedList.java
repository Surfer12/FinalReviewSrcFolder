package finalreviewsrcfoldercg;

/**
 * A custom implementation of a doubly linked list that allows for efficient
 * insertion and deletion of elements.
 * 
 * @param <E> the type of elements held in this list
 */
public class CustomLinkedList<E> {
    private Node<E> head; // The first node in the list
    private Node<E> tail; // The last node in the list
    private int size; // The number of elements in the list

    /**
     * A private static nested class representing a node in the list.
     * 
     * @param <E> the type of data held in the node
     */
    private static class Node<E> {
        E data; // The data stored in the node
        Node<E> next; // The next node in the list
        Node<E> prev; // The previous node in the list

        Node(E data) {
            this.data = data;
        }
    }

    /**
     * Adds a new element to the end of the list.
     * 
     * @param element the element to be added
     */
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Retrieves the element at the specified index.
     * 
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    /**
     * Traverses the list in reverse order.
     */
    public void traverseInReverse() {
        Node<E> current = tail;
        while (current != null) {
            System.out.println(current.data);
            current = current.prev;
        }
    }

    /**
     * Deletes the nodeat the specified index.
     * 
     * @param index the index of the node to delete
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void deleteNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }
        size--;
    }

    /**
     * Returns the number of elements in the list.
     * 
     * @return the size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Prints the elements of the list.
     */
    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}