package com.mycompany.app;
//import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;
/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
     //   error("Build failed because of this and that..");
        
    }

    private final String getMessage() {
        return message;
    }

}
