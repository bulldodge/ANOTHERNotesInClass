package com.example.notesinclass;

public class Note {

    private String status;
    private String title;
    private String text;

    public Note(String s, String ti, String te)
    {
        status = s;
        title = ti;
        text = te;
    }

    public String getStatus()
    {
        return status;
    }

    public String getTitle()
    {
        return title;
    }

    public String getText()
    {
        return text;
    }


}
