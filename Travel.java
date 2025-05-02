public class Travel {
	public String getTravelInfo(String agency , String destination , int travellers){
		return "Agency : " + agency + "\n" + "Destination : " + destination + "\n" + "Travellers : " + travellers + "\n" + "---------------------------";
}
	public static void main(String [] args){
		Travel travel = new Travel();
		String info1 =travel. getTravelInfo("Wanderlust Travels" , "Paris" , 2);
		System.out.println(info1);
		String info2 = travel.getTravelInfo("Wanderlust Travels" , "Tokyo" , 3);
		System.out.println(info2);

}
}

