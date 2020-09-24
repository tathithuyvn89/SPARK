package com.veho;

import static spark.Spark.*;

public class HelloWold {
    public static void main(String[] args) {
        get("/",(req,res) -> "Hello, World");
    }
}
