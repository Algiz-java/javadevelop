package lesson18;

import java.io.*;

public class FileCode {
    public static void main(String[] args) throws IOException {
        String textForFile = "Привет, Влад!";
        String nameNewFile = "newFile.txt";
        String codeNewFile = "UTF8";
        String nameCopyFile = "copyFile.txt";
        String codeCopyFile = "koi8";
        createNewFile(nameNewFile, codeNewFile, textForFile);
        String s = copyFile(nameNewFile, codeNewFile);
        createNewFile(nameCopyFile, codeCopyFile, s);

    }
    private static void createNewFile(String nameFile, String codeFile, String string) throws IOException {
        try (OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream(nameFile), codeFile)){
            fos.write(string);
        }
    }
    private static String copyFile(String readFile, String codeNewFile) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(readFile), codeNewFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        }
    }
}
