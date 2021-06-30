import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<String>();
    }

    public void add(String task) {
        this.todoList.add(task);
    }

    public void print() {
        int i = 1;

        for (String task : this.todoList) {
            System.out.println(i + ": "+ task);
            i++;
        }

    }

    public void remove(int num) {
        this.todoList.remove(num - 1);
    }
}
