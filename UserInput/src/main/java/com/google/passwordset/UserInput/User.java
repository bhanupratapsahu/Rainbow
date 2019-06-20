package com.google.passwordset.UserInput;

import com.google.passwordset.PasswordSet.PasswordCheck;
import com.google.passwordset.PasswordSet.PasswordCorrectionException;

public class User {
	static int setPasswordCount = 0;
	public static void main(String[] args) {
		PasswordCheck pass = new PasswordCheck();
		boolean status = passwordVerify(pass);
		
		while(status==false) {
			if(setPasswordCount==5) {
				System.out.println("You have exceeded the password setting attempt limit of "+setPasswordCount);
				break;
			}
			status = passwordVerify(pass);
		}
		
	}
	
	public static boolean passwordVerify(PasswordCheck pass) {
		boolean passwordStatus = false;
		pass.setPassword();
		
		try {
			String password = pass.getPassword();
			pass.checkPassword(password);
			passwordStatus = true;
		}
		catch(PasswordCorrectionException e) {
			System.out.println(e.getMessage());
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Password exceeds 8 characters " );
			System.out.println("set the password again");
		}
		finally {
			setPasswordCount ++;
			System.out.println("password setting attempt "+setPasswordCount);
			
		}
		return passwordStatus;
	}
	
	


}
