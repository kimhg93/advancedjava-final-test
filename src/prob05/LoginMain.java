package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) throws PasswordDismatchException, UserNotFoundException {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		for(int i=0;i<joinUsers.size();i++) {
			if((joinUsers.get(i).getId()).equals(id)) {
				if((joinUsers.get(i).getPassword()).equals(password)) {
					System.out.println("로그인 성공");
				}else {
					throw new PasswordDismatchException();
				}
			}else {
				throw new UserNotFoundException();
			}
		}
		
		
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
