public interface ApteConduire {
    boolean estAdulte();

    void apteAConduire(Voiture voiture);

    default void demarer(String nom) {
        if (estAdulte()) {
            apte(nom);
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    default void apte(String nom) {
        System.out.println(nom + " démarre la voiture.");
    }

    void arreterVoiture(Voiture voiture);
}
