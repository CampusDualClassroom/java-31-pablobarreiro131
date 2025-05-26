package com.campusdual.classroom;
import java.io.*;
import java.nio.charset.StandardCharsets;


public class Exercise31 {

    public static void main(String[] args) {
        try{
            File archivo = new File("src/main/resources/lorem.txt");
            FileInputStream fis = new FileInputStream(archivo);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String linea;
            while ((linea = br.readLine())!=null){
                System.out.println(linea);
            }

            } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        }
    }

