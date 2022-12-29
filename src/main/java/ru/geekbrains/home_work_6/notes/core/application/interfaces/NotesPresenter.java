package ru.geekbrains.home_work_6.notes.core.application.interfaces;

import ru.geekbrains.home_work_6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);
}
