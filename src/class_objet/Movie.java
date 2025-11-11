package class_objet;

public class Movie {
    String title;
    int rating;
    public Movie(String title, int rating){
        this.title=title;
        this.rating=rating;
    }
    public void displayRating(){
        if (rating>8){
            System.out.println("Excellent");
        }
        else if (rating>5 && rating<8){
            System.out.println("Good");
        }
        else {
            System.out.println("Poor");
        }
    }
}
