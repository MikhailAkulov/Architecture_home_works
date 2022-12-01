package ru.geekbrains.home_work_1.inmemorymodel;

public interface ModelChanger {

    void RegisterModelChanger(ModelChangedObserver o);
    void RemoveModelChanger(ModelChangedObserver o);
    void NotifyChange();

}
