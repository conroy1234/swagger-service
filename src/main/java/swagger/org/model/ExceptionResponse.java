package swagger.org.model;

import java.time.LocalDate;

public class ExceptionResponse {
	private LocalDate time;
	private String massage;
	private String discription;

	
	
	
	public ExceptionResponse(LocalDate time, String massage, String discription) {		
		this.time = time;
		this.massage = massage;
		this.discription = discription;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [time=" + time + ", massage=" + massage + ", discription=" + discription + "]";
	}

}
