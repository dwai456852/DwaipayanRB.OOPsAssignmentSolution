package in.greatlearning.oops_assessment.java;

// This is a subclass

class TechDepartment extends SuperDepartment {

	@Override
	String departmentName() {
		return "Tech Department";
	}

	@Override
	String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String getTechStackInformation() {
		return "Core Java";
	}
}
