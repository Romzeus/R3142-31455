public enum FurnType {
    FRIDGE("холодильник"),
    TERMOSTAT("термостат"),
    LOCKER("шкаф");
    private final String naming;
    FurnType(String naming){this.naming = naming;}
    public String type(){
        return this.naming;
    }
}
