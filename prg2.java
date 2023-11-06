import java.io.*;

public class FilePropertiesInfo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the file name: ");
            String fileName = reader.readLine();

            File file = new File(fileName);

            if (file.exists()) {
                System.out.println("File exists.");
                if (file.canRead()) {
                    System.out.println("File is readable.");
                } else {
                    System.out.println("File is not readable.");
                }
                if (file.canWrite()) {
                    System.out.println("File is writable.");
                } else {
                    System.out.println("File is not writable.");
                }
                if (file.isFile()) {
                    System.out.println("File type: Regular file");
                } else if (file.isDirectory()) {
                    System.out.println("File type: Directory");
                }
                System.out.println("File length (bytes): " + file.length() + " bytes");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
