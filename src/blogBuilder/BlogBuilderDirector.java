package blogBuilder;

public class BlogBuilderDirector {

	private BlogBuilder blogBuilder;
	
	public BlogBuilderDirector(BlogBuilder blogBuilder) {
		this.blogBuilder = blogBuilder;
		
		if(this.blogBuilder.validation()){
			System.out.println("\nBLOG WAS CREATED SUCSSESFULLY!");
		}
		else {
			System.out.println("\nBLOG CREATION WAS FAILED!");
			System.out.println("PLEASE CREATE HEADER, FOOTER AND MIDDLE SECTION OF THE BLOG!");
		}
	}	
}
