package fallback;

import java.util.Random;

public class FallbackGerador {

    private Random random = new Random();

    public String geraAnimalSimples() {
        double chanceAnimal = random.nextDouble();
        String animal = chanceAnimal > 0.5 ? "Fuinha" : "Zebra";

        double changeAdjetivo = random.nextDouble();
        String adjetivo = changeAdjetivo > 0.5 ? "honesta" : "sincera";

        return animal + " " + adjetivo;
    }
}
