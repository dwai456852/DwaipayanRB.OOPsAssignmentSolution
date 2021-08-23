package in.greatlearning.oops_assessment.java;

// This is a subclass

class HrDepartment extends SuperDepartment {

	@Override
	String departmentName() {
		return "HR Department";
	}

	@Override
	String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	@Override
	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String doActivity() {
		return "Team Lunch";
	}

}
