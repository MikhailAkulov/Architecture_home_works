package ru.geekbrains.home_work_1.inmemorymodel;

import ru.geekbrains.home_work_1.modelelements.Camera;
import ru.geekbrains.home_work_1.modelelements.Flash;
import ru.geekbrains.home_work_1.modelelements.PoligonalModel;
import ru.geekbrains.home_work_1.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger{

    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras, Collection<ModelChangedObserver> changeObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObservers = changeObservers;
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void NotifyChange() {
        for (ModelChangedObserver o: changeObservers) {
            o.ApplyUpdateModel();
        }
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public Collection<ModelChangedObserver> getChangeObservers() {
        return changeObservers;
    }
}

class MyObserver1 implements ModelChangedObserver {
    @Override
    public void ApplyUpdateModel() {
        System.out.println("Observer1 -> Отслеживает изменения");
    }
}
class MyObserver2 implements ModelChangedObserver {
    @Override
    public void ApplyUpdateModel() {
        System.out.println("Observer2 -> Отслеживает изменения");
    }
}