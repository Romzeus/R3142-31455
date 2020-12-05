public class Donut extends Shorty implements FallGuy{
    private boolean condition = false;
    private int sadness;
    public Donut(String name){
        super(name);
        sadness = 3;
    }
    @Override
    public void see(Object A){
        System.out.print(this.toString() + " видит ");
        if ((A instanceof Container) && (((Furniture)A).getCondition()))
            System.out.println(((Container)A).getFoodName() + ", " + (this.sadness > 0 ? "но даже это его не " : "и это его ") + "радует");
        else
            System.out.println(A.toString());
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
    public boolean equals(Object obj){
        return (obj instanceof Donut) && (obj.toString().equals(this.toString())) && (((Donut)obj).isFallen() == this.isFallen());
    }
}
