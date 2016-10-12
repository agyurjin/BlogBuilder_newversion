package blogBuilder;

public interface BlogBuilder {

	public void setHeader();
	public void setFooter();
	public void setLeftPane();
	public void setRightPane();
	public void setMiddleSection(int n);
	public boolean validation();
	
}
