package ru.geekbrains.home_work_6.notes.core.application.interfaces;

import ru.geekbrains.home_work_6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();

}
