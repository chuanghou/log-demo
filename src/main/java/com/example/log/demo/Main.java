package com.example.log.demo;

import com.stellariver.milky.aspectj.tool.log.Log;

public class Main {

    public static void main(String[] args) {
        Fool fool = new Fool();
        fool.testLogOfAnno("Hello World");
    }


    static public class Fool {

        @Log
        // I can put an annotation here, let aspectj know that I want the aspect to cut this method, and it works well
        // but if I want to log all methods inside a class, I have to annotate all methods, it is unacceptable.
        // of course, I can change the com.stellariver.milky.aspectj.tool.log.LogAspect cutPoint expression, then copy source code and
        // paste it to this project, it's also a bit of inconvenient
        // so the question is. Are there a way where I can change a pointcut expression if a compiled aspect ?
        public void testLogOfAnno(String str) {
            System.out.println(str);
        }

        //look here
        public void testLogOfPackage(String str) {
            System.out.println(str);
        }
    }

}
