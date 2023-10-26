package oop_prac3;

public class Company {
    private final String name;
    private long income;
    private SCP tax;

    public Company(String name, int income, SCP tax) {
        this.name = name;
        this.income = income;
        this.tax = tax;
    }

    public long getAmountAfterTax() {
        return income - getTaxAmount();
    }

    public long getTaxAmount() {
        return income * tax.getPercent() / 100L;
    }

    public String getName() {
        return name;
    }

    public SCP getTax() {
        return tax;
    }
}