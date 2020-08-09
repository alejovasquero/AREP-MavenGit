package edu.escuelaing.arep.mavengit;

public class Node<E> {
    private E value;
    private Node<E> nextNode;

    public Node(E value){
        this.value = value;
        nextNode = null;
    }

    public E getValue() {
        return value;
    }

    public E nextValue(){
        return nextNode!=null ? nextNode.value : null;
    }

    public Node<E> getNextNode(){
        return nextNode;
    }

    public void setNextNode(Node<E> node){
        nextNode = node;
    }
}

