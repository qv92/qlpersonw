import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Nguoi> list = new ArrayList<>();
    static File file = new File("D:\\untitled3\\src\\nguoi.txt");
    public static void ghiFile() {
        try{
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Nguoi nguoi:list) {
                bufferedWriter.write(nguoi.toString());
            }
            bufferedWriter.close();
        }
        catch (Exception e){
            System.out.println("Lỗi");
        }
    }
    public static void docFile() throws IOException {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
//                System.out.println(Arrays.toString(str));
                if (str.length == 5 ) {
                    list.add(new Nguoi(str[1], Integer.parseInt(str[2].trim()), str[3], Integer.parseInt(str[4])));
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void themNguoi(){
        System.out.println("Nhâp tên");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        int phone = Integer.parseInt(sc.nextLine());
        Nguoi nguoi = new Nguoi(name,age,gender,phone);
        list.add(nguoi);
    }

}
