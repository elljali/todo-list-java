import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UI ui = new UI(todoList, scanner);
        ui.start();
    }
}