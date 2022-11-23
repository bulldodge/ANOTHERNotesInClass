package com.example.notesinclass;

import java.util.ArrayList;

public class Database {

    private static ArrayList<Note> notes;

    private static void load()
    {
        notes = new ArrayList<Note>();
        notes.add(new Note("Important", "Say Hello", "to Cathy"));
        notes.add(new Note("Ideas", "Experiment", "Ducks on roller skates"));
        notes.add(new Note("To-do", "Food", "Get groceries"));
        notes.add(new Note("Important", "Exam", "Due midnight"));
        notes.add(new Note("Ideas", "I know a song that", "never ends and it's called-"));
        notes.add(new Note("To-do", "This", "Note"));
        notes.add(new Note("Important", "Button", "Add Floating Button"));
    }

    public static ArrayList<Note> getData()
    {
        if (notes == null)
        {
            load();
        }
        return notes;
    }

}