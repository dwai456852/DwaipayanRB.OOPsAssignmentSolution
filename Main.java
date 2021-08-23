package in.greatlearning.oops_assessment.java;

// This is the driver class Main.

class Main {

	public static void main(String[] args) {

		AdminDepartment objAdmin = new AdminDepartment();   // Object created
		HrDepartment objHr = new HrDepartment();            // Object created
		TechDepartment objTech = new TechDepartment();      // Object created

		System.out.println("================================================");

		System.out.println(" " + "Welcome to" + " " + objAdmin.departmentName());
		System.out.println(" " + objAdmin.getTodaysWork());
		System.out.println(" " + objAdmin.getWorkDeadline());
		System.out.println(" " + objAdmin.isTodayAHoliday());

		System.out.println("================================================");

		System.out.println(" " + "Welcome to" + " " + objHr.departmentName());
		System.out.println(" " + objHr.doActivity());
		System.out.println(" " + objHr.getTodaysWork());
		System.out.println(" " + objHr.getWorkDeadline());
		System.out.println(" " + objHr.isTodayAHoliday());

		System.out.println("================================================");

		System.out.println(" " + "Welcome to" + " " + objTech.departmentName());
		System.out.println(" " + objTech.getTodaysWork());
		System.out.println(" " + objTech.getWorkDeadline());
		System.out.println(" " + objTech.getTechStackInformation());
		System.out.println(" " + objTech.isTodayAHoliday());

		System.out.println("================================================");

	}

}
