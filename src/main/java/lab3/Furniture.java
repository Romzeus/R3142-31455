public abstract class Furniture implements Interactable{
    protected Openness condition;
    public Furniture(){
        condition = Openness.CLOSE;
    }
    public void changeCondition() {
        switch (this.condition){
            case OPEN:
                this.condition = Openness.CLOSE;
                break;
            case CLOSE:
                this.condition = Openness.OPEN;
                break;
        }
    }
    public String getCondition(){
        return condition.Condition();
    }
    @Override
    public abstract void use();
}
