package com.faux.Service;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;

import com.faux.Models.*;
public class UserService {
	private final String DB_LOCATION = "B:\\UserDB.txt"; 
	private List<User> users; 
	
	public UserService(){
	}
	
	public List<User> GetAllUsers(){
		return loadFile();
	}
	
	public boolean SaveUser(User user){
		return this.writeToFile(user);
	}
	private boolean writeToFile(User user){
		try {
			String writeOut =(
		    		user.getFirstName()+','+
		    		user.getLastName()+','+
		    		user.getEmail()+','+
		    		user.getUserName()+','+
		    		user.getPassword()+','+
		    		randInt(0,12345)+"\n"
		    		);
		    Files.write(Paths.get(this.DB_LOCATION), writeOut.getBytes(), StandardOpenOption.APPEND);
		    return true;
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
			System.err.println ("Unable to write to file");
			return false;
		}
	}
	private List<User> loadFile(){
		List<User> users = null;
		// Stream to read file
		BufferedReader fin;		
		String line; 
				try
				{
				    // Open an input stream
				    fin = new BufferedReader(new FileReader (DB_LOCATION));

				    // Read a line of text
				    while((line=fin.readLine())!=null){
		                String[] segment = line.split(",");
		                if(segment.length > 0){
		                	users.add(new User(
		                			segment[0],
		                			segment[1],
		                			segment[2],
		                			segment[3],
		                			segment[4],
		                			Integer.valueOf(segment[5])
		                			));
		                }
		            }

				    // Close our input stream
				    fin.close();	
				    return users;
				}
				// Catches any error conditions
				catch (IOException e)
				{
					System.err.println ("Unable to read from file");
					return null;
				}
	}
	public  int randInt(int min, int max) {

	    // NOTE: This will (intentionally) not run as written so that folks
	    // copy-pasting have to think about how to initialize their
	    // Random instance.  Initialization of the Random instance is outside
	    // the main scope of the question, but some decent options are to have
	    // a field that is initialized once and then re-used as needed or to
	    // use ThreadLocalRandom (if using at least Java 1.7).
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
