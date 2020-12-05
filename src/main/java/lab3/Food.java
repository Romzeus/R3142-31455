public class Food {
    private final String foodName;
    public Food(){
        foodName = "пищевой продукт";
    }
    public Food(String foodName){
        this.foodName = foodName;
    }
    @Override
    public String toString(){
        return foodName;
    }
    @Override
    public int hashCode(){
        return foodName.hashCode();
    }

    @Override
    public boolean equals(Object A) {
        return (A instanceof Food) && (A.toString().equals(this.toString()));
    }
}
