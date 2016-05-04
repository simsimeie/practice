package study_java;

class Promotion {

	public static void main(String[] args) {
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		buyer.buyApple(seller, 2000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
	}
}

class FruitSeller{
	final int APPLE_PRICE = 1000;
	private int numOfApple = 20;
	private int myMoney = 0;
	
	public int saleApple(int money){
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
		
	}
	
	public void showSaleResult(){
		System.out.println("판매자 남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}

class FruitBuyer{
	private int myMoney=5000;
	private int numOfApple=0;
	
	public void buyApple(FruitSeller seller, int money){
		numOfApple+=seller.saleApple(money);
		myMoney-=money;
	}
	public void showBuyResult(){
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("구매자 사과 개수 : " + numOfApple);
	}
}