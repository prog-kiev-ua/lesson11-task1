package ua.kovalev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceFile {
    public static List<String> read(File file) throws IOException{
        List<String> list;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            list = br.lines().collect(Collectors.toList());
        }
        return list;
    }
}
