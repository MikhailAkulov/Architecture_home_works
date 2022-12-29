package ru.geekbrains.home_work_6.notes.core.application.interfaces;

import ru.geekbrains.home_work_6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();
}
