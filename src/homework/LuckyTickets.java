package HomeWork.Done;

/*В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую
неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от
000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр
номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 или
567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета
и теперь раздумывает, как много сувениров потребуется. С помощью программы подсчитайте
сколько счастливых билетов в одном рулоне?*/

public class LuckyTickets {
    public static void main(String[] args) {
        int firstSum;
        int secondSum;
        int luckyCount = 0;

        for (int first3Num = 1; first3Num <= 999; first3Num++) {
            firstSum = first3Num / 100 + (first3Num / 10) % 10 + first3Num % 10;
            for (int second3Num = 1; second3Num <= 999; second3Num++) {
                secondSum = second3Num / 100 + (second3Num / 10) % 10 + second3Num % 10;
                if (firstSum == secondSum) {
                    luckyCount++;
                }
            }
        }
        System.out.println("Number of lucky tickets is " + luckyCount); // Итого 55251 счастливых билетов
    }
}
