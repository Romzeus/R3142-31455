public class Donut extends Shorty implements FallGuy{
    private boolean condition = false;
    private int sadness;
    public Donut(String name){
        super(name);
        sadness = 3;
    }
    @Override
    public void see(Object object){
        System.out.print(this.toString() + " видит ");
        if (object instanceof Container)
            if (((Furniture)object).getCondition())
                System.out.println(((Container)object).getFoodName() + ", " + (this.sadness > 0 ? "но даже это его не " : "и это его ") + "радует");
        else
            System.out.println(object.toString());
    }
    @Override
    public void fall(){
        condition = true;
        System.out.println(this.toString() + " падает");
    }
    public void changeSadness(int change){
        sadness += change;
    }
    @Override
    public boolean isFallen() {
        return condition;
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof Donut)
            return (object.toString().equals(this.toString())) && (((Donut)object).isFallen() == this.isFallen());
        return false;
    }
}
