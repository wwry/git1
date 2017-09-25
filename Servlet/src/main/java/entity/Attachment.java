package entity;

public class Attachment{    //附件名 

	private String name;    //文件名
	private byte[] contents;//文字内容放入字节数组
	
	public Attachment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attachment(String name, byte[] contents) {
		super();
		this.name = name;
		this.contents = contents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getContents() {
		return contents;
	}
	public void setContents(byte[] contents) {
		this.contents = contents;
	}
	
	
	
}
