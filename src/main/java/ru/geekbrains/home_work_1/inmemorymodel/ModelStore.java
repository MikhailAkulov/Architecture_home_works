package ru.geekbrains.home_work_1.inmemorymodel;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore  implements ModelChanger{

    //TODO: Доработать

    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {

    }

    @Override
    public void NotifyChange() {

    }
}
