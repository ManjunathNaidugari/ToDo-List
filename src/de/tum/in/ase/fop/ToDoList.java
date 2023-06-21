package de.tum.in.ase.fop;

//import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
//import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class ToDoList {

    private List<ToDoItem> items;
//    private ToDoItem items;

    public ToDoList() {
         items = new ArrayList<>();
    }

    public void add(ToDoItem item) {
        items.add(item);
    }

    public void resolve(ToDoItem item) {
        if (items.contains(item)) {
            item.setResolved(true);
        }
    }

    public void unresolve(ToDoItem item) {
        if (items.contains(item)) {
            item.setResolved(false);
        }
    }

    public void delete(ToDoItem item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

    public ObservableList<ToDoItem> getItems() {
        return FXCollections.observableList(items);
    }

//    public static void main(String[] args) {
//        ToDoList list = new ToDoList();
//        ToDoItem item = new ToDoItem("Homework");
//        ToDoItem item2 = new ToDoItem("Home");
//        list.add(item);
//        list.add(item2);
//        System.out.println(list.getItems());
//    }

}
