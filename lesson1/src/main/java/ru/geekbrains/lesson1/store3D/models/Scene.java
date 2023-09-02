package ru.geekbrains.lesson1.store3D.models;

public class Scene {
    private int id;
    private List<PoligonalModel> models;
    private List<Flash> flashes;
    private Camera camera;




    public Scene(List<PoligonalModel> models, Camera camera) {
        this.models = models;
        this.camera = camera;
    }

    public Type method1(Type type){
       return type;
    }

    public Type method2(Type type1, Type type2){
        return type2;
    }
    public List<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(List<PoligonalModel> models) {
        this.models = models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
