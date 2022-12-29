package ru.geekbrains.home_work_6;

import ru.geekbrains.home_work_6.databases.NotesDatabase;
import ru.geekbrains.home_work_6.notes.core.application.ConcreteNoteEditor;
import ru.geekbrains.home_work_6.notes.infrastructure.DatabaseContext;
import ru.geekbrains.home_work_6.notes.presentation.queries.controllers.NotesController;
import ru.geekbrains.home_work_6.notes.presentation.queries.views.NotesConsolePresenter;

public class Sample01 {

    /**
     * Приложение "редактор заметок"
     *      *      * TODO: ДОМАШНЯЯ РАБОТА
     *      *      *  разработать UML-диаграмму классов для текущего приложения
     */
    public static void main(String[] args) {
        NotesController notesController = new NotesController(
                new ConcreteNoteEditor(new DatabaseContext(new NotesDatabase()), new NotesConsolePresenter()));
        notesController.routeGetAll();
    }
}