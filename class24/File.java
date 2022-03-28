package com.syntax.class24;

/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
implementation of open behaviour: Example: to open .java file we need notepad++ or
sublime text, to open .doc file we need Microsoft word to be installed etc
 */

abstract class File{

    abstract void open();

    void edit(){
        System.out.println("Editing a file");
    }

    void close(){
        System.out.println("closing a file");
    }
}

class JavaFile extends File {

    @Override
    void open() {

        System.out.println("Use intellij to open Java files");
    }

    void refactor(){
        System.out.println("Renaming the code");
    }
}

class WordFile extends File {

    @Override
    void open() {
        System.out.println("Use Microsoft Word to open this file");
    }
}

class PDFFIle extends File {

    @Override
    void open() {

        System.out.println("Use Adobe Reader to open this file");
    }
}

    class Task2 {

    public static void main(String[] args) {

        /* if a method is not present inside the parent class, we can't call that method using Polymorphism
           Object [] files = {new JavaFile(),new PDFFIle(),new WordFile()};
           Object[0]. */

        File[] files = {new JavaFile(),new PDFFIle(),new WordFile()};

        for (int i = 0; i < files.length; i++) {

            files[i].open();
            files[i].edit();
            files[i].close();
        }

            /* int i =0;
            while(i < files.length){
            files[i].open();
            files[i].edit();
            files[i].close();
            i++;
            } */

    }
}

