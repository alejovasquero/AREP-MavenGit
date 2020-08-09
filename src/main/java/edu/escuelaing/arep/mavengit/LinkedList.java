package edu.escuelaing.arep.mavengit;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class LinkedList<E> implements Collection<E> {
    
    private Node<E> head;

    public LinkedList(){
        head = null;
    }


    public static void main(String args[]){
        LinkedList<Integer> h = new LinkedList<Integer>();
        System.out.println(h.size());
        h.add(1);
        h.add(100);
        System.out.println(h.size());
        System.out.println(h);
    }
    public int size() {
        Node<E> current = head;
        int size = 0;
        while(current!= null){
            size++;
            current=current.getNextNode();
        }
        return size;
    }


    public boolean isEmpty() {
        return head==null;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        Object[] ans =  new Object[size()];
        Node<E> current  = head;
        for(int i=0; i<ans.length && current != null; i++){
            ans[i] = current.getValue();
            current = current.getNextNode();
        }
        return ans;
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean add(E o) {
        Node<E> last = getLast();
        if(last == null){
            head = new Node<E>(o);
        } else {
            last.setNextNode(new Node<E>(o));
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public void clear() {

    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }



    public Node<E> getLast(){
        Node<E> last = head;
        while(last!= null && last.getNextNode()!=null){
            last = last.getNextNode();
        }
        return last;
    }

    public String toString(){
        return Arrays.toString(toArray());
    }
}
