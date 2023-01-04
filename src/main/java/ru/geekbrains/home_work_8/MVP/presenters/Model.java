package ru.geekbrains.home_work_8.MVP.presenters;

import ru.geekbrains.home_work_8.MVP.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return номер бронирования
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Изменение бронирования столика
     * @param oldReservationNo номер старой брони
     * @param reservationDate новая дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return новый номер бронирования
     */
    int changeReservationTable(int oldReservationNo, Date reservationDate, int tableNo, String name);
}