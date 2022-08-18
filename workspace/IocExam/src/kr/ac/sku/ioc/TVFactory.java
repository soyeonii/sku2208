package kr.ac.sku.ioc;

public class TVFactory {
	public static TV getTV(String tvName) {
		TV tv = null;
		if ("ding".equals(tvName))
			tv = new DingdingTV();
		else if ("b".equals(tvName))
			tv = new BTV();
		return tv;
	}
}
