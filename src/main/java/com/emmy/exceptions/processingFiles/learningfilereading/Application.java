package com.emmy.exceptions.processingFiles.learningfilereading;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args){
        File file = new File("C:\\Users\\Emmy_Jhay\\Documents\\JavaWorkSpace\\src\\main\\java\\com\\emmy\\exceptions\\processingFiles\\newFiles.txt");
        BufferedReader bufferedReader = null;
        try{
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

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
        }finally {
            try{
                bufferedReader.close();
            }catch(IOException e){
                e.printStackTrace();
            }catch (NullPointerException e){ //NullPointerException
                System.out.println("File was probably not even read \n" + e.getMessage());
            }

        }

    }

    

}
