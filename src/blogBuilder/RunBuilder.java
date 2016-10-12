package blogBuilder;

public class RunBuilder {
	
	public static void main(String[] args) {

		BlogBuilder blogBuilder = new BlogBuilderImpl();

		blogBuilder.setHeader();
		blogBuilder.setFooter();
		blogBuilder.setMiddleSection(1);
		blogBuilder.setLeftPane();
		blogBuilder.setRightPane();

		BlogBuilderDirector blogBuildDirector = new BlogBuilderDirector(blogBuilder);	
	}
}