public class Main {
    public static void main(String[] args){
        Shorty dun = new Dunno("Незнайка");
        Shorty don = new Donut("Пончик");
        Button doorButton = ButtonFactory.getDoorButton();
        Button[] buttons = new Button[5];
        for (int i = 0; i < buttons.length; i++){
            buttons[i] = ButtonFactory.getButton();
        }
        ((FallGuy)don).fall();
        dun.see(don);
        ((Dunno)dun).interact(doorButton);
        ((Dunno)dun).speak("");
        for (int i = 0; i < buttons.length; i++){
            ((Dunno)dun).interact(buttons[i]);
            don.see(buttons[i].getFurn());
        }
    }
}
