package com.bsg5.chapter2;

import java.io.PrintStream;

/**
 * @author huawei
 **/
public interface Greeter {

    void setPrintStream(PrintStream printStream);

    void greet();
}
