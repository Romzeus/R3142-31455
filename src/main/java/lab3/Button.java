public class Button implements Interactable{
    private final Furniture furn;
    public Button(Furniture furn){
        this.furn = furn;
    }
    public void use(){
        System.out.print("Кнопку нажали: ");
        this.furn.use();
    }
    public Furniture getFurn() {
        return furn;
    }
    @Override
    public String toString(){
        return "Кнопка от " + furn.toString();
    }
    @Override
    public int hashCode(){
        return (furn.hashCode() * 2);
    }
    @Override
    public boolean equals(Object obj){
        return (obj instanceof Button) && (((Button)obj).getFurn().equals(this.getFurn()));
    }
}
