package Files;

import java.io.File;

public class Deleteafile {

        public static void main(String[] args) {
            File myObj = new File("src/Files/create.txt");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }

