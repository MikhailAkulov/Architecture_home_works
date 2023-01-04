package ru.geekbrains.home_work_8.MVP.models;

import ru.geekbrains.home_work_8.MVP.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class BookingModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     * @return номер бронирования
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        Optional<Table> table = loadTables().stream().filter(t -> t.getNo() == tableNo).findFirst();
        if (table.isPresent()){
            Reservation reservation = new Reservation(reservationDate, name);
            table.get().getReservations().add(reservation);
            return reservation.getId();
        }
        throw new RuntimeException("Incorrect table number.");
    }

    public int changeReservationTable(int oldReservationNO, Date reservationDate, int tableNo, String name){
        for (Table table:tables) {
            for (Reservation reservation:table.getReservations()) {
                if (reservation.getId() == oldReservationNO){
                    table.getReservations().remove(reservation);

                    return reservationTable(reservationDate, tableNo, name);
                }
            }
        } throw new RuntimeException("Table is free. You can book it.");
    }
}