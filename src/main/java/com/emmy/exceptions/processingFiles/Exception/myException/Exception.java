package com.emmy.exceptions.processingFiles.Exception.myException;

public class Exception extends java.lang.Exception {

    public int divideInputby10(int input) throws java.lang.Exception {
        if(input < 10)
                throw new java.lang.Exception("Input Seems to be Lesser than Required(min: 10)");
        return input / 10;
    }

}
