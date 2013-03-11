package ast.util;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import ast.store.Post;
import ast.store.Profile;

public class DBC {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/autosocietron_db";
	static final String USER = "web";
	static final String PASS = "ASTpas5";
		
	public static void selectProfile()
	{
		 Connection conn = null;
		 Statement stmt = null;
		 try{			
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "SELECT * FROM PROFILE";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         String username = rs.getString("username");

		         //Display values
		         System.out.print("Username:" + username);
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}
	
	
	public static boolean insertPost(Profile profileToPost, Post newPost)
	{
		Connection conn = null;
		 Statement stmt = null;
		 try {
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
						
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Connected.");
			stmt = conn.createStatement();
			
			String postBody = newPost.getPostBody();
							
			//SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			//String postDate = sdf.format(newPost.getPostTimestamp());
			
			String postType = newPost.getPostType();
			String username = profileToPost.getUsername();
			
			String sql = "INSERT INTO `POST` (postBody, postType, USER_username) " +
					"VALUES ('" + postBody + "', '" +
					postType + "', '" + username + "')";
			System.out.println("Executed successfully: '" + sql + "'");
			stmt.executeUpdate(sql);
		
		} 
		catch(SQLException se) {
		      //Handle errors for JDBC
			
		    se.printStackTrace();
		} 
		catch(Exception e) {
		      //Handle errors for Class.forName
		    e.printStackTrace();
		}
		finally {
			//finally block used to close resources
			try {
				if(stmt!=null)
					conn.close();
			}
			catch(SQLException se) {
			}// do nothing
			try {
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se) {
			   se.printStackTrace();
			}//end finally try
		}//end try
		return true;
	}
	
	
	public static boolean insertProfile(Profile newProfile)
	{
		 Connection conn = null;
		 Statement stmt = null;
		 try {
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
						
			//STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Connected.");
			stmt = conn.createStatement();
			
			String username, password, firstName, surname, gender, bio, avatar;
			String city, country;
			String interest1, interest2, interest3;
			int TTP, TTPJ, LTP, SPL;
			int LTPINT1, LTPINT2, LTPINT3, LTPNEWLOC, LTPEVENT, LTPWEATHER, LTPNEWS, LTPFLR, LTPPHOTO;
			
			username = newProfile.getUsername();
			password = newProfile.getPassword();
			firstName = newProfile.getFirstName();
			surname = newProfile.getSurname();
			gender = newProfile.getGender();
			bio = newProfile.getBio();
			avatar = newProfile.getAvatar();
			city = newProfile.getCity();
			country = newProfile.getCountry();
			interest1 = newProfile.getInterest1();
			interest2 = newProfile.getInterest2();
			interest3 = newProfile.getInterest3();
			TTP = newProfile.getTTP();
			TTPJ = newProfile.getTTPJ();
			LTP = newProfile.getLTP();
			SPL = newProfile.getSPL();
			LTPINT1 = newProfile.getLTPINT1();
			LTPINT2 = newProfile.getLTPINT2();
			LTPINT3 = newProfile.getLTPINT1();
			LTPNEWLOC = newProfile.getLTPNEWLOC();
			LTPEVENT = newProfile.getLTPEVENT();
			LTPWEATHER = newProfile.getLTPWEATHER();
			LTPNEWS = newProfile.getLTPNEWS();
			LTPFLR = newProfile.getLTPFLR();
			LTPPHOTO = newProfile.getLTPPHOTO();
			
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			String dob = df.format(newProfile.getDOB());
			
			String sql = "INSERT INTO `profile` " +
					"VALUES ('" + username + "', '" + password + "', '" + firstName + "', '" + surname + "', " + 
					"STR_TO_DATE('" + dob + "','%d-%m-%Y'), '" + gender + "', '" + bio + "', '" + avatar + "', '" +
					city + "', '" + country + "', '" + interest1 + "', '" + interest2 + "', '" + interest3 + "', '" +
					TTP + "', '" + TTPJ + "', '" + LTP + "', '" + SPL + "', '" + LTPINT1 + "', '" + LTPINT2 + "', '" +
					LTPINT3 + "', '" + LTPNEWLOC + "', '" + LTPEVENT + "', '" + LTPWEATHER + "', '" + LTPNEWS + "', '" +
					LTPFLR + "', '" + LTPPHOTO + "', CURRENT_TIMESTAMP)";
/*		
			String sql = "INSERT INTO `profile` " +
				"VALUES ('shood', 'password', 'Sam', 'Hood', STR_TO_DATE('" + dob + "','%d-%m-%Y'), 'Male', " +
				"'Not sure what this should be', " +
				"'doesnt matter', 'Dundee', 'Scotland', 'Science', 'Food', 'Computing', " +
				"'20', '1', '9', '9', '5', '5', '5', '5', '5', '5', '5', '5', '5')";
			*/

			stmt.executeUpdate(sql);
		
			System.out.println("Inserted new profile (" + username + " into the table...");
		} 
		catch(SQLException se) {
		      //Handle errors for JDBC
			
		    se.printStackTrace();
		} 
		catch(Exception e) {
		      //Handle errors for Class.forName
		    e.printStackTrace();
		}
		finally {
			//finally block used to close resources
			try {
				if(stmt!=null)
					conn.close();
			}
			catch(SQLException se) {
			}// do nothing
			try {
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se) {
			   se.printStackTrace();
			}//end finally try
		}//end try
		return true;
	}

	public boolean insertPost(Post newPost)
	{
		return true;
	}

	public boolean runQuery(String sql) {
		
		return true;
	}
}
