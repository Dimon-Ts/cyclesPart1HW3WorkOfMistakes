public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println(" Накопления");
        int contribution = 29000;
        int totalContribution = 0;
        for(int a = 1; a <= 12; a++ ) {
            totalContribution = totalContribution + contribution;
            System.out.println("Месяц " + a + " ,сумма накоплений равна " + totalContribution + " рублей.");
        }
        // Задание 2
        System.out.println(" Накопления + проценты по вкладу");
        int contributionNew = 29000;
        int totalContributionNew =  0;
        for(int i = 1; i <= 12; i++ ) {
            totalContributionNew = totalContributionNew + totalContributionNew/100;
            totalContributionNew = totalContributionNew + contributionNew;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + totalContributionNew + " рублей.");
        }
        // Задание 3 (дополнительно)
        System.out.println(" Накопления + проценты по вкладу,точнее,для очень бдительных клиентов)))");
        int contributionNewX = 29000;
        double totalContributionNewX = (double) 0;
        for(int b = 1; b <= 12; b++ ) {
            totalContributionNewX = totalContributionNewX + totalContributionNewX/100;
            totalContributionNewX = totalContributionNewX + contributionNewX;
            System.out.println("Месяц " + b + " ,сумма накоплений равна "
                    + String.format("%.2f",totalContributionNewX) + " рублей.");
        }
    }
}