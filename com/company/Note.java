package com.company;

import java.io.File;

/**
 * Created by Piotrek on 2017-09-27.
 */
public abstract class Note{
    protected String filename = null;
    protected File file = null;

    public Note(String filename, File file){
        this.filename = filename;
        this.file = file;
    }

    public void read(){}
    public String write(){ return filename;}

}
