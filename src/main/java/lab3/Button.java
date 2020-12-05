public class Button implements Interactable{
    private final Furniture furniture;
    public Button(Furniture furniture){
        this.furniture = furniture;
    }
    public void use(){
        System.out.print("Кнопку нажали: ");
        this.furniture.use();
    }
    public Furniture getFurniture() {
        return furniture;
    }
    @Override
    public String toString(){
        return "Кнопка от " + furniture.toString();
    }
    @Override
    public int hashCode(){
        return (furniture.hashCode() * 2);
    }
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Button)
            return (((Button)obj).getFurniture().equals(this.getFurniture()));
        return false;
    }
}
