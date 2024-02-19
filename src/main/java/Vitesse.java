public class Vitesse {
    private final Voiture voiture;

    public Vitesse(Voiture voiture) {
        this.voiture = voiture;
    }

    public void accelerer() {
        if (voiture.getVitesse() + 10 <= 120) {
            voiture.setVitesse(voiture.getVitesse() + 10);
            voiture.afficherDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (voiture.getVitesse() - 10 >= 0) {
            voiture.setVitesse(voiture.getVitesse() - 10);
            voiture.afficherDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}