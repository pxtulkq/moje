package src.oop;

public class Match {

    private int hostScore,visitingScore;

    public int getHostScore() {
        return hostScore;
    }

    public void setHostScore(int hostScore) {
        this.hostScore = hostScore;
    }

    public int getVisitingScore() {
        return visitingScore;
    }

    public void setVisitingScore(int visitingScore) {
        this.visitingScore = visitingScore;
    }

    void getResult(){
        if (hostScore > visitingScore){
            System.out.println("Vyhrali domaci");
        } else if (visitingScore > hostScore){
            System.out.println("Vyhrali hoste");
        } else {
            System.out.println("Remiza");
        }
    }
}
