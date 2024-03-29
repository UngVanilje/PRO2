package ex4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * null is not allowed as a value in the list.
 */
public class ArrayedList<T> implements Iterable<T> {
    // array to store the entries in;
    // not-empty entries have indices in [0, size-1]
    private T[] items;
    // number of entries in the list and also
    // index of the first empty slot in items
    private int size;

    private int changes;

    /**
     * Create an ArrayedList with capacity 16.
     */
    public ArrayedList() {
        this(16);
    }

    /**
     * Create an ArrayedList with the given capacity.
     * Pre: capacity >= 1.
     */
    public ArrayedList(int capacity) {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[capacity];
        items = temp;
        size = 0;
    }

    private void increaseCapacity() {
        @SuppressWarnings("unchecked")
        T[] temp = (T[]) new Object[2 * items.length];
        if (size >= 0) {
            System.arraycopy(this.items, 0, temp, 0, size);
        }
        changes++;
        items = temp;
    }

    /**
     * Add the entry at the end of this list.
     */
    public void add(T entry) {
        if (size == items.length) this.increaseCapacity();

        items[size] = entry;
        size++;
        changes++;
    }

    /**
     * Add the entry at the index.
     * Throw IndexOutOfBoundsException,
     * if index is not in [0, size()].
     */
    public void add(int index, T entry) {
        //
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        if (index == size) {
            this.add(entry);

            if (size == items.length)
                this.increaseCapacity();

            for (int i = size; i > index; i--) {
                items[i] = items[i - 1];
            }
            items[index] = entry;
            size++;
            changes++;

        }
    }

    /**
     * Remove and return the entry at the index.
     * Throw IndexOutOfBoundsException,
     * if this list is empty or index is not in [0, size()-1].
     */
    public void remove(int index) {
        T entry = items[index];
        if (index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {

            for (int i = 0; i < index; i++)
                items[i] = items[i + 1];
            changes++;
        }
        items[size - 1] = null;
        size--;

    }

    /**
     * Replace and return the old entry at the index
     * with the specified entry.
     * Throw IndexOutOfBoundsException,
     * if this list is empty or index is not in [0, size()-1].
     */
    public T replace(int index, T entry) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        T oldEntry = items[index];
        items[index] = entry;
        return oldEntry;
    }

    /**
     * Return the entry at the index.
     * Throw IndexOutOfBoundsException,
     * if this list is empty or index is not in [0, size()-1].
     */
    public T get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        return items[index];
    }

    /**
     * Return true, if the entry is in this list.
     */
    public boolean contains(T entry) {
        boolean found = false;
        int i = 0;
        while (!found && i < size) {
            if (items[i].equals(entry)) found = true;
            i++;
        }
        return found;
    }

    /**
     * Return the number of entries in this list.
     */
    public int size() {
        return size;
    }

    /**
     * Return true, if this list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Remove all entries from this list.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    /**
     * Return an array containing all entries
     * in the same order as in this list.
     */
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] copy = (T[]) new Object[size];
        System.arraycopy(items, 0, copy, 0, size);
        return copy;
    }

    @Override
    public String toString() {
        if (this.isEmpty())
            return ("[]");

        StringBuilder sb = new StringBuilder("[");
        sb.append(items[0]);
        for (int i = 1; i < size; i++) {
            sb.append(", ").append(items[i]);
        }
        sb.append("]");
        return sb.toString();

    }

    public Iterator<T> iterator() {
        Arraylistinner al = new Arraylistinner();
        return al;
    }


    //-------------------------------------------------------------------------
    // Ex. 4

    // TODO

    public class Arraylistinner implements Iterator {

        int position;
        int innerChanges = changes;

        @Override
        public boolean hasNext() {
            if (position >= size) {
                return false;
            } else {
                return true;
            }
        }


        @Override
        public T next() {
            if (hasNext()) {
                T t = items[position];
                position++;
                return t;
            }
            if (changes != innerChanges) {
                throw new ConcurrentModificationException();
            }else
                throw new IndexOutOfBoundsException();

        }
    }
}
