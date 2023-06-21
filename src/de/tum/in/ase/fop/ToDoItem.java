package de.tum.in.ase.fop;

public class ToDoItem {

    private String content;
    private boolean resolved;

    public boolean isResolved() {
        return resolved;
    }

    public String getContent() {
        return content;
    }

    public void setResolved(Boolean resolved) {
        this.resolved = resolved;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ToDo " + content;
    }

    public ToDoItem(String content) {
        this.content = content;
        this.resolved = false;
    }
}
