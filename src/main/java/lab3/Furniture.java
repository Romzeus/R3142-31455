public abstract class Furniture implements Interactable{
    private boolean openess;
    public Furniture(boolean condition){
        openess = condition;
    }
    public void changeCondition() {
        if (openess)
            openess = false;
        else
            openess = true;
    }
    public boolean getCondition(){
        return openess;
    }
}
