import java.util.ArrayList;
import java.util.List;

public class ProjetoMod12 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> generos = new ArrayList<>();

        nomes.add("Lucas");
        generos.add("Masculino");

        nomes.add("Joao");
        generos.add("Masculino");

        nomes.add("Pedro");
        generos.add("Masculino");

        nomes.add("Rafael");
        generos.add("Masculino");

        nomes.add("Maria");
        generos.add("Feminino");

        nomes.add("Giovana");
        generos.add("Feminino");

        nomes.add("Mariana");
        generos.add("Feminino");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (int i = 0; i < generos.size(); i++) {
            String genero = generos.get(i);
            String nome = nomes.get(i);

            if (genero.equalsIgnoreCase("Masculino")) {
                nomesMasculinos.add(nome);
            } else if (genero.equalsIgnoreCase("Feminino")) {
                nomesFemininos.add(nome);
            }
        }

        System.out.println("Nomes Masculinos:");
        for (String nomeMasculino : nomesMasculinos) {
            System.out.println(nomeMasculino);
        }

        System.out.println("\nNomes Femininos:");
        for (String nomeFeminino : nomesFemininos) {
            System.out.println(nomeFeminino);
        }
    }
}
