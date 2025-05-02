public class Library{
	public void displayInfo(String libraryName, String title , String author){

			System.out.println("Library Name : " + libraryName);
			System.out.println("Book Title : " + title);
			System.out.println("Book Author : " + author);
			System.out.println("---------------------------");

	}

	public static void main(String [] args){
		Library library = new Library();
		library.displayInfo("City Public Library" , "The Great Gatsby" , "F.Scott Fitzgerald");
		library.displayInfo("City Public Library" , "1984" , "George Orwell");
}
}
		