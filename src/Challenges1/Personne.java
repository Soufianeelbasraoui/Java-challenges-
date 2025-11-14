package Challenges1;

public class Personne {
    private String nom;
    private int age;
    private Passeport passeport;

    public Personne(String nom, int age, Passeport passeport) {
        this.nom = nom;
        this.age = age;
        this.passeport = passeport;
    }
    public void  afficherInfos(){
        System.out.print("nom: "+nom+ "\n");
        System.out.print("age: "+age);
        System.out.println("  Passeport n° : " + passeport.getNumero());
        System.out.println("  Nationalité : " + passeport.getNationalite());
        System.out.println("  Date d'expiration : " + passeport.getDateExpiration());
    }

    public void assignerPasseport(Passeport p){
       this.passeport=p;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        age=age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", passeport=" + passeport +
                '}';
    }

}
