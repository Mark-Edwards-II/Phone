
public class Test {
	public static void main(String[] args) {
		Galaxy note = new Galaxy("Note", 98, "Boost Mobile", "ring");
		System.out.println(note.ring());
		System.out.println(note.unlock());
		note.displayInfo();
		
	}
}
