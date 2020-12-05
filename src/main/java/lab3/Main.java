public class Main {
    public static void main(String[] args){
        Dunno dunno = new Dunno("Незнайка");
        Donut donut = new Donut("Пончик");
        String naming = "пищевой продукт";
        Button doorButton = ButtonFactory.getDoorButton();
        Button[] buttons = {
                ButtonFactory.getButton(naming, FurnitureType.FRIDGE),
                ButtonFactory.getButton(naming, FurnitureType.LOCKER),
                ButtonFactory.getButton(naming, FurnitureType.TERMOSTAT)
        };
        donut.fall();
        dunno.see(donut);
        dunno.interact(doorButton);
        dunno.speak("");
        for (Button button : buttons){
            dunno.interact(button);
            donut.see(button.getFurniture());
        }
        donut.changeSadness(-3);
        donut.see(buttons[2].getFurniture());
    }
}
