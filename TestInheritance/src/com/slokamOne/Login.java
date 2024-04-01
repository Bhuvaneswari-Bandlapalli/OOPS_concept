package com.slokamOne;
import java.io.*;
import java.util.*;
public class Login {
	public String role(String userName,String pwd) {
		String role=null;
		try {
			FileReader fr=new FileReader("C:\\Users\\bvnmp\\Desktop\\My_Files\\Role.txt");
			BufferedReader br=new BufferedReader(fr);
			for(String s=br.readLine();s!=null;s=br.readLine()) {
				String[] k=s.split(",");
				if(userName.equals(k[0]) && pwd.equals(k[1])) {
					role=k[2];
					System.out.println(role);
				}
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return role;
	}
}
