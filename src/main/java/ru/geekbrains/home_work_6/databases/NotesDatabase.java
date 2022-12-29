package ru.geekbrains.home_work_6.databases;

import ru.geekbrains.home_work_6.notes.infrastructure.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable = new NotesTable();

    public NotesTable getNotesTable() {
        return notesTable;
    }
}
