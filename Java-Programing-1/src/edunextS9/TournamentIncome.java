package edunextS9;

public class TournamentIncome extends Player implements GradeBonus {
    private String grade;
    private String rate;
    public TournamentIncome(String grade,String rate,String name){
        super(name);
        this.grade=grade;
        this.rate=rate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String displayDetails() {
        return null;
    }

    @Override
    public double calculateGradeBonus(double score) {
        double bonusAmount ;

        // Logic tính tiền thưởng dựa trên điểm số
        if (score >= 90) {
            bonusAmount = 1000; // Tiền thưởng 1000 nếu điểm số lớn hơn hoặc bằng 90
        } else if (score >= 80) {
            bonusAmount = 500; // Tiền thưởng 500 nếu điểm số lớn hơn hoặc bằng 80
        } else {
            bonusAmount = 0; // Không có tiền thưởng nếu điểm số dưới 80
        }

        return bonusAmount;

    }
}
