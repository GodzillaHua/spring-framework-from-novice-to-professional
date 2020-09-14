package com.bsg5.chapter2;

import java.io.PrintStream;

/**
 * @author huawei
 **/
public class HelloWorldGreeter implements Greeter{

    private PrintStream printStream;

    @Override
    public void setPrintStream(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void greet() {
        printStream.print("Hello World");
    }


}
