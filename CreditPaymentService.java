public class CreditPaymentService {
    /* Создаем метод calculate, который принимает
       сумму кредита, срок кредита, процентную ставку
       и возвращает размер ежемесячного платежа */
    public int calculate (int credit, int time, float percentage) {

        // Рассчет коэффициента аннуитета
        float ann_factor = (float) (percentage * Math.pow((1 + percentage), time) / (Math.pow((1 + percentage), time) - 1));
        float ann_payment = ann_factor * credit; // Ежемесячный взнос
        return (int) ann_payment;
    }
}