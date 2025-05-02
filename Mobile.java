public class Mobile{
	public void showDetails(String storeName, String brand, int price){
		System.out.println("Store Name : " + storeName);
		System.out.println("Mobile Brand : " + brand);
		System.out.println("Mobile Price : " + price);
		System.out.println("---------------------------");
}
	public static void main(String [] args){
		Mobile mobile = new Mobile();
		mobile.showDetails("Tech World" , "Apple" , 1200);
		mobile.showDetails("Tech World" , "Samsung" , 900);
}
}