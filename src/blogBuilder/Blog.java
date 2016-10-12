package blogBuilder;

public class Blog {

	Header header;
	Footer footer;
	LeftPane leftPane;
	RightPane rightPane;
	MiddleSection middleSection;
	
	public Blog() {	
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Footer getFooter() {
		return footer;
	}

	public void setFooter(Footer footer) {
		this.footer = footer;
	}

	public LeftPane getLeftPane() {
		return leftPane;
	}

	public void setLeftPane(LeftPane leftPane) {
		this.leftPane = leftPane;
	}

	public RightPane getRightPane() {
		return rightPane;
	}

	public void setRightPane(RightPane rightPane) {
		this.rightPane = rightPane;
	}

	public MiddleSection getMiddleSection() {
		return middleSection;
	}

	public void setMiddleSection(MiddleSection middleSection) {
		this.middleSection = middleSection;
	}
}