public enum Openness {
    OPEN{
        @Override
        String Condition() {
            return "открыт";
        }
    },
    CLOSE{
        @Override
        String Condition() {
            return "закрыт";
        }
    };
    String Condition(){
        return "неопределен";
    }
}
