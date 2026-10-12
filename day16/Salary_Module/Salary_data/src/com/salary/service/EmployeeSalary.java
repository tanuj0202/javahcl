package day16.Salary_Module.Salary_data.src.com.salary.service;

public class EmployeeSalary{
	
     private static final String[] MONTHS = {
        "January", "February", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

    private static final int[] DAYS = {
        31, 28, 31, 30,
        31, 30, 31, 31,
        30, 31, 30, 31
    };

    private final int[] leaveDays;

    public EmployeeSalary(int[] leaveDays) {
        if (leaveDays == null) {
            throw new IllegalArgumentException("Leave days cannot be null.");
        }
        if (leaveDays.length != MONTHS.length) {
            throw new IllegalArgumentException("Leave days must be provided for all 12 months.");
        }

        this.leaveDays = leaveDays.clone();
        for (int i = 0; i < this.leaveDays.length; i++) {
            if (this.leaveDays[i] < 0 || this.leaveDays[i] > DAYS[i]) {
                throw new IllegalArgumentException(
                    "Leave days for " + MONTHS[i] + " must be between 0 and " + DAYS[i] + "."
                );
            }
        }
    }

    public static int getMonthCount() {
        return MONTHS.length;
    }

    public static String getMonth(int index) {
        return MONTHS[index];
    }

    public static int getDays(int index) {
        return DAYS[index];
    }

    public int getLeaveDays(int index) {
        return leaveDays[index];
    }
}
