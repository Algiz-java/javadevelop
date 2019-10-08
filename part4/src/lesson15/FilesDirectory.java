package lesson15;

import java.io.File;

public class FilesDirectory {
    public static void main(String[] args) {
        File file = new File("E:\\Java8\\ru.akhmetshin\\part4");
        System.out.println(file.getAbsolutePath());
        int dirrect = 0;
        for (char c : file.getAbsolutePath().toCharArray()) {
            if (c == '\\') {
                dirrect++;
            }
        }
        showFiles(file, dirrect);
    }

    private static void showFiles(File f, int d) {
        File[] files = f.listFiles();
        int count = 0;
        for (char c : f.getAbsolutePath().toCharArray()) {
            if (c == '\\') {
                count++;
            }
        }
        int div = count - d;//разница в символе "\" между заданной дирректорией и анализируемой
        assert files != null;
        for (File p : files) {
            if (p.isDirectory()) {
                try {
                        System.out.printf("%" + (div + 1) + "s", "\\");
                        System.out.println(p.getName());

                    showFiles(p, d);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (p.isFile()) {
                System.out.printf("%" + (div + 1) + "s", "");
                System.out.println(p.getName() + " - file");
            }
        }
    }
}
