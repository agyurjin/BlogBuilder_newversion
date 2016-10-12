package blogBuilder;

public class BlogBuilderImpl implements BlogBuilder {
	private Blog blog;
	
	public BlogBuilderImpl(){
		this.blog = new Blog();
	}
	@Override
	public void setHeader() {
		this.blog.setHeader(new Header());
	}

	@Override
	public void setFooter() {
		this.blog.setFooter(new Footer());
	}

	@Override
	public void setLeftPane() {
		this.blog.setLeftPane(new LeftPane());
	}

	@Override
	public void setRightPane() {
		this.blog.setRightPane(new RightPane());
	}

	@Override
	public void setMiddleSection(int n) {
		if(n<1) {
			System.out.println("Middle sections should be greater or equal than one!");
			System.out.println("Cannot creat middle section");
		}
		else {
			this.blog.setMiddleSection(new MiddleSection(n));
		}
	}
	@Override
	public boolean validation() {
		if(this.blog.getHeader() != null && this.blog.getFooter() != null && this.blog.getMiddleSection() != null){
			return true;
		}
		return false;
	}
}
