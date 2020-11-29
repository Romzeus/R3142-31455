public class Donut extends Shorty implements FallGuy{
    boolean condition = false;
    public Donut(String name){
        super(name);
    }
    @Override
    public void see(Object A){
        System.out.print(this.toString() + " видит ");
        if ((A instanceof Container) && (((Furniture)A).getCondition().equals("открыт")))
            System.out.println(((Container)A).getFoodName() + ", но даже это его не радует");
        else
            System.out.println(A.toString());
    }
    @Override
    public void fall(){
        condition = true;
        System.out.println(this.toString() + " падает");
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
