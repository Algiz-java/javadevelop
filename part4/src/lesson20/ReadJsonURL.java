package lesson20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadJsonURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://jsonplaceholder.typicode.com/albums/20");
            printConsole(url);
            printClass(url);
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private static void printConsole(URL url) {
        try (InputStream is = url.openStream();
             Reader reader = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine())!=null){
                System.out.print(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printClass(URL url) {
        System.out.println("\n" + "Результат после Json.class:");
        try (InputStream is = url.openStream();
             Reader reader = new InputStreamReader(is)){
            ObjectMapper mapper = new ObjectMapper();
            Json json = mapper.readValue(reader, Json.class);
            System.out.printf("ID: %d \nUserID: %d \nTitle: '%s'",json.getId(), json.getUserId(),json.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
