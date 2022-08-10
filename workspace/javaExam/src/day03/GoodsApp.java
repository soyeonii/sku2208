package day03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println("상품이름:" + camera.getName());
		System.out.println("상품가격:" + camera.getPrice());
		System.out.println("재고수량:" + camera.getCountStock());
		System.out.println("팔린수량:" + camera.getCountSold());
	}
}
