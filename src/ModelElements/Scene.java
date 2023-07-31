package ModelElements;

public class Scene implements Type{
    public int id;
    public PoligonalModel models;
    public Flash flashes;

    public Scene(int id, PoligonalModel models, Flash flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PoligonalModel getModels() {
        return models;
    }

    public void setModels(PoligonalModel models) {
        this.models = models;
    }

    public Flash getFlashes() {
        return flashes;
    }

    public void setFlashes(Flash flashes) {
        this.flashes = flashes;
    }
    @Override
    public Type method1(Type smth) {
        return null;
    }
    @Override
    public Type method2(Type option1, Type option2){
        return null;
    }


}
