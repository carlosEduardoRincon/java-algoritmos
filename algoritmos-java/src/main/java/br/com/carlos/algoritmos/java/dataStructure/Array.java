package br.com.carlos.algoritmos.java.dataStructure;

/*
    O(n) - Add element, because needs to allocate in memory the exact space to keep the data
         - Delete element, because it needs to move
    O(1) - Read element

    Commum used to random position access
 */
public class Array<T> {
    private Object[] elements;
    private int size;

    public Array(int size) {
        this.elements = new Object[size];
        this.size = 0;
    }

    public void add(T element) {
        this.increaseSize();
        this.elements[this.size++] = element;
    }

    private void increaseSize() {
        var newCapacity = this.elements.length * 2;
        var newArray = new Object[newCapacity];

        for (int i = 0; i < this.elements.length; i++) {
            newArray[i] = this.elements[i];
        }

        this.elements = newArray;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) this.elements[index];
    }

    public int size() {
        return this.size;
    }
}
