package lesson15;

import java.io.File;

public class FilesDirectory {
    public static void main(String[] args) {
        showFiles(new File("E:\\Java8\\ru.akhmetshin\\part4\\"));
    }
    private static void showFiles(File f) {
        File[] files = f.listFiles();
        for(File p:files){
            if (!p.isDirectory ()) {
                System.out.println (p.getName ());
            }
            if (p.isDirectory ()) {
                try {
                    showFiles(p);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
