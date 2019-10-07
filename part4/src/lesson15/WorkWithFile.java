package lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class WorkWithFile {

    public static void main(String[] args) {
        File file_one = new File("E:\\Java8\\ru.akhmetshin\\part4\\src\\lesson15\\file_one.txt");
        generateFile(file_one);//вызов метода создания файла
        File file_two = new File("E:\\Java8\\ru.akhmetshin\\part4\\src\\lesson15\\file_two.txt");
        renameFile(file_one, file_two);//вызов метода переименовывания файла
        copyFile(file_two);//вызов метода копирования файла
        deleteFile(file_two);//вызов метода удаления файла
    }

    private static void deleteFile(File file_two) {
        file_two.delete();
        if (!file_two.exists()) {
            System.out.println(file_two.getName() + " удален");
        }
    }

    private static void copyFile(File file_two) {
        Path file_two_path = file_two.toPath();
        File newFile = new File("E:\\Java8\\ru.akhmetshin\\part4\\src\\lesson15\\newFile.txt");
        Path newFile_path = newFile.toPath();
        try {
            Files.copy(file_two_path, newFile_path , StandardCopyOption.REPLACE_EXISTING);
            System.out.println(file_two.getName() + " успешно скопирован в " + newFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void renameFile(File file, File renameFile) {
        if (file.exists()) {
            if (file.renameTo(renameFile)) {
                System.out.println(file.getName() + " переименован в " + renameFile.getName());
            } else {
                System.out.println("Ошибка переименовывания");
            }
        } else {
            System.out.println(renameFile.getName() + " не существует");
        }
    }

    private static void generateFile(File file) {
        try {
            System.out.println(file.getName() + " создан успешно? " + file.createNewFile());
        } catch (IOException e) {
            System.out.println("Исключение " + e.getMessage());
        }
    }
}