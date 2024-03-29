package edunextS9;

public class PlayerTest {
    public static void main(String[]args){
        TournamentIncome tournamentIncome = new TournamentIncome("9","9","Thu");
        PlayerIncome playerIncome = new PlayerIncome("Thu",5000);
        System.out.println(tournamentIncome.calculateGradeBonus(100));
        System.out.println(playerIncome.calculateTax());
    }
}

