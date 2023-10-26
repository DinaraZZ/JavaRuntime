package oop_prac3;

public class Main {
    public static void main(String[] args) {
        /*Common c1 = new Common();
        Company co1 = new Company("Co1", 1_500, c1);
        System.out.println(co1.getAmountAfterTax());
        System.out.println(co1.getTaxAmount());*/

        Simplified simplified = new Simplified();
        Common common = new Common();
        Patent patent = new Patent();

        Company runtime = new Company("Runtime", 2_400_000, simplified);
        Company arta = new Company("Arta", 90_000_000, common);
        Company arta2 = new Company("Arta2", 95_000_000, common);
        Company john = new Company("John", 7_500_000, patent);

        Company[] companies = new Company[]{runtime, arta, john, arta2};

        for (Company company : companies) {
            System.out.println(company.getName());
            System.out.println("- Сумма после вычета ИПН: " + company.getAmountAfterTax());
            System.out.println("- Размер ИПН: " + company.getTaxAmount());
            System.out.println();
        }

       /* long maxTax = companies[0].getTaxAmount();
        Company maxTaxComp = null;
        for (int i = 1; i < companies.length; i++) {
            if (companies[i].getTaxAmount() > maxTax) {
                maxTax = companies[i].getTaxAmount();
                maxTaxComp = companies[i];
            }
        }
        System.out.println(maxTaxComp.getName() + " " + maxTax);*/

        long maxTax = 0;
        Company maxTaxComp = null;
        for (Company company : companies) {
            if (company.getTax() instanceof Common) {
//                System.out.println(company.getName());
                if (company.getTaxAmount() > maxTax) {
                    maxTax = company.getTaxAmount();
                    maxTaxComp = company;
                }
            }
        }
        System.out.println(maxTaxComp.getName() + " " + maxTax);

    }
}
