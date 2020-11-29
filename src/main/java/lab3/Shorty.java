public abstract class Shorty{
    private String name;
    Shorty(String name){
        this.name = name;
    }
    public abstract void see(Object A);
    @Override
    public String toString(){
        return name;
    }
    @Override
    public int hashCode(){
        return (name.hashCode() * 2);
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Shorty) && (obj.hashCode() == this.hashCode());
    }
}
