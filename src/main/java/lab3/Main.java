public class Main {
    public static void main(String[] args){
        Shorty dun = new Dunno("Незнайка");
        Shorty don = new Donut("Пончик");
        Button doorButton = ButtonFactory.getDoorButton();
        Button[] buttons = new Button[3];
        String naming = "пищевой продукт";
        buttons[0] = ButtonFactory.getButton(naming, FurnType.FRIDGE);
        buttons[1] = ButtonFactory.getButton(naming, FurnType.LOCKER);
        buttons[2] = ButtonFactory.getButton(naming, FurnType.TERMOSTAT);
        ((FallGuy)don).fall();
        dun.see(don);
        ((Dunno)dun).interact(doorButton);
        ((Dunno)dun).speak("");
        for (Button but : buttons){
            ((Dunno)dun).interact(but);
            don.see(but.getFurn());
        }
        ((Donut)don).changeSadness(-3);
        don.see(buttons[2].getFurn());
    }
}
