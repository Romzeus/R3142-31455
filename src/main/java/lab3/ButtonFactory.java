public class ButtonFactory {
    public static Button getButton(){
        return ButtonFactory.getButton("пищевой продукт", FurnitureType.FRIDGE);
    }
    public static Button getButton(String foodName, FurnitureType ftype){
        Food food = new Food(foodName);
        Furniture furniture = new Container(ftype, food);
        Button button = new Button(furniture);
        return button;
    }
    public static Button getDoorButton(){
        Furniture door = new Door();
        Button button = new Button(door);
        return button;
    }
}
