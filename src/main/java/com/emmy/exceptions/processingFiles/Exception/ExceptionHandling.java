package com.emmy.exceptions.processingFiles.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.emmy.exceptions.processingFiles.Exception.myException.Exception;

public class ExceptionHandling {
    public static void main(String[] args)  {

        try{
            File file = new File("C:\\Users\\Emmy_Jhay\\Documents\\JavaWorkSpace\\src\\main\\java\\com\\emmy\\exceptions\\processingFiles\\newFile.txt");
            Scanner stdin =  new Scanner(file);

            while(stdin.hasNext()){
                String input = stdin.nextLine();
                System.out.println(input);
            }
        stdin.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }


    // Created my own Exception Extending the Exception Class
        try{
            Exception exception = new Exception();
            Scanner input = new Scanner(System.in);
            System.out.println("=========================");
            System.out.println("Enter a Digit: ");
            int userInput = input.nextInt();
            int result =  Math.round(exception.divideInputby10(userInput));
            System.out.println(result);
            //Close scanner
            input.close();
        }catch (java.lang.Exception e){
            e.printStackTrace();
        }

    }
}
