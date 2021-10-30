package ua.kovalev;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sites = new ArrayList<>();
        try {
            sites = ServiceFile.read(new File("sites.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> accessableSites = new ArrayList<>();
        List<String> notAccessableSites = new ArrayList<>();

        ServiceControlSite.checkAccess(sites, accessableSites, notAccessableSites);

        System.out.println("Список доступных сайтов: " + accessableSites);
        System.out.println("Список недоступных сайтов: " + notAccessableSites);
    }
}
