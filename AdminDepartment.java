package in.greatlearning.oops_assessment.java;

// This is a subclass

class AdminDepartment extends SuperDepartment {

	@Override
	String departmentName() {
		return "Admin Department";
	}

	@Override
	String getTodaysWork() {
		return "Complete your documents Submission";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}

}
