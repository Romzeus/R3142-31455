public class Container extends Furniture{
    FurnType naming;
    Food food;
    public Container(FurnType naming, Food food){
        super();
        this.naming = naming;
        this.food = food;
    }
    public String getFoodName() {
        return food.toString();
    }
    @Override
    public void use(){
        this.changeCondition();
        System.out.println(this.naming.type() + " " + this.getCondition());
    }
    @Override
    public int hashCode(){
        int i = 0;
        switch(naming){
            case LOCKER:
                i += 1;
                break;
            case TERMOSTAT:
                i += 2;
                break;
            case FRIDGE:
                i += 3;
                break;
        }
        if (food.toString().equals("пищевой продукт"))
            i += 1;
        return i;
    }
    @Override
    public String toString(){
        return (naming.type() + " с " + food.toString());
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Container) && (((Container)obj).getFoodName().equals(this.getFoodName())) && (((Container)obj).getCondition() == this.getCondition());
    }
}
