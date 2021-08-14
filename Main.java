public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit_sum = 1_000_000; // Сумма кредита

        int credit_time = 3; // Срок кредита в годах
        int credit_time_month = credit_time * 12; // // Срок кредита в месяцах

        float year_percentage = 9.99F; // Годовая процентная ставка
        float month_percentage = year_percentage / 12 / 100; // Месячная процентная ставка

        int payment = service.calculate(credit_sum, credit_time_month, month_percentage);
        System.out.println(payment);
    }
}