class assign4 {
    public static void main(String inp[]) {

        int hour, rate, wslary, msalary;
        hour = Integer.parseInt(inp[0]);
        rate = Integer.parseInt(inp[1]);

        if (hour > 7 && rate < 100) {
            System.out.println("work hour must less then 7");
            System.out.println("wage rate must greater than 100");
        } else if (rate < 100) {
            System.out.println("wage rate must greater than 100");
        } else if (hour > 7) {
            System.out.println("work hour must less then 7");
        } else {
            wslary = (hour * 7) * rate;
            msalary = wslary * 4;

            System.out.println("weekly salary of employee: " + wslary);
            System.out.println("monthly salary of employee: " + msalary);
        }

    }
}
