package Credit;

import RealBank.GeneralSystem;

import java.util.Scanner;

public class BackData extends GeneralSystem {
    private String usernameForCredit;
    private double loanMoney;
    private int months;
    private int salary;

//    public void entering(Scanner scanner) {
//        while (true) {
////            GeneralSystem generalSystem = new GeneralSystem();
//            BackData backData = new BackData();
//            System.out.println("Please enter your username: ");
//            backData.setUsernameForCredit(scanner.next());
//            if (generalSystem.getUsername().equals(backData.getUsernameForCredit())) {
//                System.out.println("Welcome " + backData.getUsernameForCredit());
//                break;
//            } else {
//            }
//        }
//    }

    public void workingTime(Scanner scanner) {
        while (true) {
            BackData backData = new BackData();
            System.out.println(backData.getUsernameForCredit() + ", are you working?");
            System.out.print("Please confirm with yes or no: ");
            String workOrNot = scanner.next();

            if (workOrNot.equalsIgnoreCase("yes")) {
                System.out.print("How long you have been working? - ");
                backData.setMonths(scanner.nextInt());

                if (backData.getMonths() < 6) {
                    System.out.println("For getting loan, you should work at least 6 months.");
                    break;
                } else {
                    System.out.println(backData.getUsernameForCredit() + ", you can loan money from OurBank!");
                    break;
                }

            } else if (workOrNot.equalsIgnoreCase("no")) {
                System.out.println("Unfortunately, you should work for getting loan.");
                break;
            } else {
                System.out.println("Please enter only yes or no:");
            }
        }
    }

    public String getUsernameForCredit() {
        return usernameForCredit;
    }

    public void setUsernameForCredit(String usernameForCredit) {
        this.usernameForCredit = usernameForCredit;
    }

    public double getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(double loanMoney) {
        this.loanMoney = loanMoney;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
