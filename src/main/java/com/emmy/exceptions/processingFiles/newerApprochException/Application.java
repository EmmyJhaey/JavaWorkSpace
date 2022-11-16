package com.emmy.exceptions.processingFiles.newerApprochException;

import java.io.*;

public class Application {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Emmy_Jhay\\Documents\\JavaWorkSpace\\src\\main\\java\\com\\emmy\\exceptions\\processingFiles\\newFile.txt");
        //        BufferedReader bufferedReader = null;
        try(FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader); ){
            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch(FileNotFoundException e){
            //            e.printStackTrace();
            System.out.println("File not Found ! ");
        }catch (IOException e){
            System.out.println("Errors in reading file " + file.getName());
        }

    }
}
