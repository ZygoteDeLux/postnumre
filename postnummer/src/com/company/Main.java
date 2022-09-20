package com.company;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<String, String> Postnumre = new HashMap<String, String>();
        File file = new File("/Users/oscarstorm/IdeaProjects/postnummer/src/com/company/danske-postnumre-byer-ny (1).csv");
        Scanner sc = new Scanner(file);
        sc.nextLine();

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner lineScanner = new Scanner(line).useDelimiter(";");
            String postNummber = lineScanner.next();
            String By = lineScanner.next();

            Postnumre.put(postNummber,By);

        }
        System.out.println(Postnumre);

        System.out.println(Postnumre.get("1220"));
    }
}
