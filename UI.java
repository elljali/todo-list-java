import java.util.Scanner;

public class UI {

    private Scanner scanner;
    private TodoList list;

    public UI(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Masukkan Perintah : (tambah, daftar, hapus, keluar)");
            String input = this.scanner.nextLine();

            if (input.contentEquals("tambah")) {
                add();
            }

            if (input.contentEquals("daftar")) {
                list();
            }

            if (input.contentEquals("hapus")) {
                remove();
            }

            if (input.contentEquals("keluar")) {
                System.exit(0);
            }
        }
    }

    public void add() {
        System.out.print("Masukkan List yang Ingin Ditambah : ");
        String input = this.scanner.nextLine();
        this.list.add(input);
    }

    public void list() {
        this.list.print();
    }

    public void remove() {
        System.out.println("Pilih List yang Ingin Dihapus : ");
        list();
        int input = Integer.parseInt(scanner.nextLine());
        this.list.remove(input);
    }
}
