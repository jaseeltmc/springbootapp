package com.greatlearning.library.springBootApp.model;

/*import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class GreatLearning {
	
	
	private String coursename;
	private String coursetype;
	private String instructorName;
	
	public GreatLearning() {
		super();
	}

	public GreatLearning(String coursename, String coursetype, String instructorName) {
		super();
		this.coursename = coursename;
		this.coursetype = coursetype;
		this.instructorName = instructorName;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "GreatLearning [coursename=" + coursename + ", coursetype=" + coursetype + ", instructorName="
				+ instructorName + "]";
	}
	

}
