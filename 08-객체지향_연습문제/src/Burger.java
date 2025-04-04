class Burger extends MenuItem {
        public Burger(String name, int price) {
                super(name, price);
            }
        
        @Override
        public String toString() {
             return "Burger";
        }

        @Override
        public void addOption() {
            System.out.println("치즈추가");
        }
}
