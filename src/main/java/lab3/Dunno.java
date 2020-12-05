public class Dunno extends Shorty implements Controller{
    public Dunno(String name){
        super(name);
    }
    @Override
    public void see(Object object) {
        System.out.print(this.toString() + " видит: " + object.toString());
        if (object instanceof FallGuy)
            System.out.println(((FallGuy) object).isFallen() ? " упал" : " стоит");
    }
    public void speak(String message){
        System.out.println(this.toString() + " говорит с широкой улыбкой: " + message);
    }
    @Override
    public void interact(Interactable object){
        System.out.println(this.toString() + " использует " + object.toString());
        object.use();
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof Dunno)
            return (object.toString().equals(this.toString()));
        return false;
    }
}
