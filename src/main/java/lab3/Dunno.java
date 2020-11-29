public class Dunno extends Shorty implements Controller{
    public Dunno(String name){
        super(name);
    }
    @Override
    public void see(Object A) {
        System.out.print(this.toString() + " видит: ");
        if (A instanceof FallGuy)
            if (((FallGuy)A).isFallen())
                System.out.println(A.toString() + " упал");
            else
                System.out.println(A.toString() + " стоит");
        else
            System.out.println(A.toString());
    }
    public void speak(String message){
        System.out.println(this.toString() + " говорит с широкой улыбкой: " + message);
    }
    @Override
    public void interact(Interactable A){
        A.use();
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Dunno) && (obj.toString().equals(this.toString()));
    }
}
