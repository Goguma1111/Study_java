public class Ex02 {
    public static void main(String[] args) {
        Product p[] = new Product[3];
        
        p[0] = new Electronic();
        p[1] = new Clothing();
        p[2] = new Food();
        
        for(int i = 0; i < p.length; i++) {
            p[i].showInfo();
        
            
            
            if(i + 1 < p.length) {
                System.out.println("-------------------------");
            }
        }

    }
    
}
