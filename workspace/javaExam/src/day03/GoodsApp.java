package day03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println("��ǰ�̸�:" + camera.getName());
		System.out.println("��ǰ����:" + camera.getPrice());
		System.out.println("������:" + camera.getCountStock());
		System.out.println("�ȸ�����:" + camera.getCountSold());
	}
}
