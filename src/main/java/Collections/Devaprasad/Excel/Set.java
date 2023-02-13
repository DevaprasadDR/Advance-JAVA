package Collections.Devaprasad.Excel;

import Collections.Devaprasad.LinkedHashset.Employee;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set {
    public static <toString> void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("sheetName");
        LinkedHashSet<Employee> lhs = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many elements do you want to store");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("add element:");
            String a = sc1.next();
            Integer b = sc1.nextInt();
            Integer c = sc1.nextInt();
            Employee emp = new Employee(a, b, c);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter the row");
            // XSSFRow row1 = sheet.createRow(sc2.nextInt());


            Scanner sc3 = new Scanner(System.in);

            for (int j = 0; j < n; j++) {
                XSSFRow row1 = sheet.createRow(sc2.nextInt());

                System.out.println("cell number are: ");

                for (int k = 0; k < 3; k++) {

                    row1.createCell(sc3.nextInt()).setCellValue(lhs.add(emp));


                }
            }
            System.out.println("linkedHashSet : " + lhs + "\n");
            for (Employee employee : lhs) {
                System.out.println("-------------------------------------");
                System.out.println(employee.toString());
                System.out.println("Name : " + employee.getName());
                System.out.println("Age : " + employee.getAge());
                System.out.println("Salary : " + employee.getSalary());
                FileOutputStream file = new FileOutputStream("src/Datafile/wr.xlsx");
                workbook.write(file);

            }
        }
    }
}