


import ast.store.Post;
import ast.store.Profile;
import ast.util.DBC;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dbc.test();
		Post aPost = new Post();
		aPost.setPostBody("This is a post body test!");
		aPost.setPostType("TEXT");
		
		Profile aProfile = new Profile();
		aProfile.setUsername("shood");
		
		DBC.insertPost(aProfile, aPost);
	}

}
