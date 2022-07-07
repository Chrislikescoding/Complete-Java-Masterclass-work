package com.company;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
    return this.leftLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.leftLink = item;
        return this.leftLink;

    }

    @Override
    ListItem  previous() {
        return this.rightLink;
    }

    @Override
    ListItem  setPrevious(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    int compareTo(ListItem item) {
    if (item != null){
        return((String) super.getValue()).compareTo((String) item.getValue());
    }else{
        return -1;
    }
    }
}
