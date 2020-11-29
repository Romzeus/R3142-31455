public enum FurnType {
    FRIDGE{
        @Override
        public String type(){
            return "холодильник";
        }
    },
    TERMOSTAT{
        @Override
        public String type(){
            return "термостат";
        }
    },
    LOCKER{
        @Override
        public String type(){
            return "шкаф";
        }
    };
    public String type(){
        return "фурнитура";
    }
}
