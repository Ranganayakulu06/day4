public class Ticket {
	public String getTicketInfo(String theaterName , String movieName , String seatNo){
		return "Theater Name : " + theaterName + "\n" + "Movie Name : " + movieName + "\n" + "Seat No : " + seatNo + "\n" + "---------------------------";
}
	public static void main(String [] args){
		Ticket ticket = new Ticket();
		String ticket1 = ticket.getTicketInfo("Galaxy Cinemas" , "Interstellar" , "A10");
		System.out.println(ticket1);
		String ticket2 = ticket.getTicketInfo("Galaxy Cinemas" , "Inception" , "B12");
		System.out.println(ticket2);

}
}

