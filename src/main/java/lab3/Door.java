public class Door extends Furniture{
    public Door(){
        super(true);
    }
    @Override
    public void use(){
        this.changeCondition();
        System.out.println(this.toString() + " " + (this.getCondition() ? "открыта" : "закрыта"));
    }
    @Override
    public int hashCode(){
        int result = 0;
        if (this.getCondition())
            result = 1;
        return result;
    }
    @Override
    public String toString() {
        return "Дверь";
    }
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Door) && (((Door)obj).getCondition() == this.getCondition());
    }
}
