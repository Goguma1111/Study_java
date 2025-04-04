class Salad extends MenuItem {
    public Salad(String name, int price) {
            super(name, price);
        }
    
        @Override
    public String toString() {
        System.out.println("pizza");
        return super.toString();
    }

    @Override
    public void addOption() {
        System.out.println("치즈 크러스트");
    }
}
