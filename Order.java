public class Order{
	public  String getOrderDetails(String restaurantName, String foodItem, int quantity){
		return  "Restaurant Name : "  + restaurantName + "\nFood Item : " + foodItem  + "\nQuantity :"+			quantity + "\n" + "----------------------"; 
		
	}
	public static void main(String [] args){
		Order order = new Order();
		String order1 = order.getOrderDetails("Spice Garder" ,"Paneer Butter Masala", 2);
		System.out.println(order1);
		String order2 = order.getOrderDetails("Spice Garder" , "Chicken Briyani" , 1);
		System.out.println(order2);
		order. getOrderDetails("Spice Garder","Paneer Butter Masala",2);

}
}