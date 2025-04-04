interface Payable{
    
    public abstract void pay(int amount);
    
}


class CreditCard implements Payable{

    @Override
    public void pay(int amount) {
        System.out.println("신용카드로" + amount + "원 결제 합니다." );
    }


}


class  Cash implements Payable {

    @Override
    public void pay(int amount) {
        System.out.println("현금으로" + amount + "원 결제합니다.");
    }

}


class MobilePay implements Payable{

    @Override
    public void pay(int amount) {
        System.out.println("모바일 결제로" + amount + "원 결제합니다.");
    }

    public void useBiometics() {
        System.out.println("생체인증으로 모바일 결제를 시작합니다.");
    }
    
} 


public class PayInterface {
    public static void main(String[] args) {
        Payable [] p = new Payable[3];


        p[0] = new CreditCard();
        p[1] = new Cash();
        p[2] = new MobilePay();


        for(int i = 0; i< p.length; i++){
            p[i].pay(15000);

            if(p[i] instanceof MobilePay) {
                ((MobilePay) p[i]).useBiometics();
            } 
        }



    }
}
