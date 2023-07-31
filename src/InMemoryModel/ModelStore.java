package InMemoryModel;
import ModelElements.*;
public class ModelStore implements IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private  ImodelChangeObserver changeObservers;

    public ModelStore(PoligonalModel models, Scene scenes, Flash flashes, Camera cameras, ImodelChangeObserver changeObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObservers = changeObservers;
    }

    public PoligonalModel getModels() {
        return models;
    }

    public void setModels(PoligonalModel models) {
        this.models = models;
    }

    public Scene getScenes() {
        return scenes;
    }

    public void setScenes(Scene scenes) {
        this.scenes = scenes;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public void setFlashes(Flash flashes) {
        this.flashes = flashes;
    }

    public Camera getCameras() {
        return cameras;
    }

    public void setCameras(Camera cameras) {
        this.cameras = cameras;
    }

    public ImodelChangeObserver getChangeObservers() {
        return changeObservers;
    }

    public void setChangeObservers(ImodelChangeObserver changeObservers) {
        this.changeObservers = changeObservers;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // Notify Change
    }
    public Scene getScena(int id) {

        return null;
    }
}
