package com.company;

import java.io.File;

/**
 * Created by Piotrek on 2017-09-27.
 */
public class TextNote extends Note {

    public TextNote(String filename, File file){
        super(filename,file);
    }

    public void read(){}

    public String write()
    {
        System.out.println("TextNote");
        return filename;
    }
}
