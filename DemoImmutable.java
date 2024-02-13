import java.util.Scanner;
public class DemoImmutable{
	public static void main(String[] args) {
		String msg = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word to search");
		String searchText = sc.nextLine();

		int index = msg.indexOf(searchText);
		while(index!=-1){
			System.out.println(index);
			index = msg.indexOf(searchText,index+1);
		}

		

	}
}