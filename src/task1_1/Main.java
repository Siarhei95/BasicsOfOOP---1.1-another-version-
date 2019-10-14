//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить

package task1_1;

import java.io.File;
import java.io.IOException;


//рассмотрено дополнительно, пытался разобраться через различные видеоуроки!

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/Siarhei/Desktop/test/move/copy/file.txt");
        File dir = new File("/Users/Siarhei/Desktop");
        File newDir = new File("C://Users/Siarhei/Desktop");

        dir.renameTo(newDir); //переименовать

        boolean deleted = newDir.delete(); //удалить

        File newFile = new File("C://SomeDir//MyFile"); //создать
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
