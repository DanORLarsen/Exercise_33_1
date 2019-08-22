import java.io.Serializable;

public class Loan implements Serializable {
    private double annualIntrest, ammount, totalPayment, monthlyPayment;
    private int years;
    public Loan(double annualIntrest, int years, double ammount)
    {
        this.ammount = ammount;
        this.annualIntrest = annualIntrest;
        this.years = years;
    }

     void totalPayment(){
        double totalPayment = this.ammount * Math.pow(this.annualIntrest, this.years);
        this.totalPayment = totalPayment;
     }

     void monthlyPayment(){
         double startAmount = this.ammount;
         double totalPayment = this.ammount * Math.pow(this.annualIntrest, this.years);
         int months = years*12;
         this.monthlyPayment = totalPayment/months;
    }

    public double getAnnualIntrest() {
        return annualIntrest;
    }

    public void setAnnualIntrest(double annualIntrest) {
        this.annualIntrest = annualIntrest;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}

// Rantes rante  - - - - k1 = k0*(1+r)^n