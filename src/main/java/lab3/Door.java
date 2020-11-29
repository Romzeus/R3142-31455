public class Door extends Furniture{
    public Door(){
        condition = Openness.OPEN;
    }
    @Override
    public void use(){
        this.changeCondition();
        System.out.println(this.toString() + " " + this.getCondition() + "а");
    }
    @Override
    public int hashCode(){
        int result = 0;
        if (this.condition == Openness.OPEN)
            result = 1;
        return result;
    }
    @Override
    public String toString() {
        return "Дверь";
    }
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Door) && (obj.hashCode() == this.hashCode());
    }
}
