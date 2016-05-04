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
		System.out.println("�Ǹ��� ���� ��� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney);
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
		System.out.println("���� �ܾ� : " + myMoney);
		System.out.println("������ ��� ���� : " + numOfApple);
	}
}