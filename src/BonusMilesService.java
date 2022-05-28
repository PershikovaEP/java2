public class BonusMilesService {
    public int calculate(int cost) {

        int m = 20; //количество рублей, приходящихся на одну милю
        int mile = cost / m; //количество бонусных миль
        return mile;
    }
}