package Rizal.JAVALearn.GetterAndSetter;

public class Category {

    private String Id;

    private boolean Expensive;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        if (id != null)
        this.Id = id;
    }

    public boolean isExpensive() {
        return Expensive;
    }

    public void setExpensive(boolean expensive) {
        Expensive = expensive;

    }
}
