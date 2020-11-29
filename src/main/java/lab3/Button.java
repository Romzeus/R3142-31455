public class Button implements Controller, Interactable{
    private Furniture furn;
    public Button(Furniture furn){
        this.furn = furn;
    }
    @Override
    public void interact(Interactable A){
        A.use();
    }
    public void use(){
        System.out.print("Кнопку нажали: ");
        interact(furn);
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
