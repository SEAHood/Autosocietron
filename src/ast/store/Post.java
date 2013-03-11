package ast.store;

import java.util.Date;

public class Post {

	
	
	private String postBody;
	private Date postTimestamp;
	private String postType;
	
	public Post()
	{
		
	}
	
	public void setPostTimestamp(Date postTimestamp) {
		this.postTimestamp = postTimestamp;
	}
	
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	
	public void setPostType(String postType) {
		this.postType = postType;
	}
	
	
	public String getPostBody() {
		return postBody;
	}

	public Date getPostTimestamp() {
		return postTimestamp;
	}

	public String getPostType() {
		return postType.toString();
	}
	
	
}
