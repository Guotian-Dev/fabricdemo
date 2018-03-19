package net.zwj.fabric;

public class Demo {
	public static void main(String[] args) throws Exception{
		ChaincodeManager manager = FabricManager.obtain().getManager();
		 
		manager.invoke("invoke", new String[]{"a","b","10"});
		manager.query("query", new String[]{"a"});
	}
}
