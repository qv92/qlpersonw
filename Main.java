import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        while (true){
            System.out.println("1.Thêm người");
            System.out.println("2.Ghi file");
            System.out.println("3.Xóa file");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    Manager.themNguoi();
                    break;
                case 2:
                    Manager.ghiFile();
                    break;
                case 3:
                    Manager.docFile();
                    break;
                case 4:
                    break;
            }
        }
    }
}
