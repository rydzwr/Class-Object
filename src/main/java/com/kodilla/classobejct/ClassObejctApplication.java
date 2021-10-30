package com.kodilla.classobejct;

import java.util.*;
import java.lang.*;
import java.io.*;

class Example {

}

class Application
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Example obj = new Example();
        int result = obj.hashCode();

        System.out.println(result);

        Example obj2 = new Example();
        result = obj2.hashCode();

        System.out.println(result);
    }
}

