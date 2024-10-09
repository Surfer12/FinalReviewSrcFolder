package JavaPracticeCode;

import java.util.Arrays;

public class CustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}