package work.dto;

/** POJO 클래스 */
public class MessageBean {
	private String message;
	private String courseName;
	
	
	public MessageBean() {
		System.out.println("MessageBean() default constructor!!!");
	}


	public MessageBean(String message, String courseName) {
		super();
		this.message = message;
		this.courseName = courseName;
		System.out.println("MessageBean(String,String) constructor!!!");
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	public void sayMessage(String name) {
		System.out.println(name + ", Hello Spring Framework!!!");
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(message);
		builder.append(", ");
		builder.append(courseName);
		return builder.toString();
	}


	
	
	
	
	
	
	
	
	
}
