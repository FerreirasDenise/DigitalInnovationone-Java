package collections.optionals;

import java.util.Optional;

public class ProgramaOptional {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor opcional"); // se passar nulo, lança exception
        //Optional<String> optionalStringNull = Optional.ofNullable(null); // se passar valor de string, chama o metodo of()
        //Optional<String> optionalStringEmpty = Optional.empty();

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));

        if (optionalString.isPresent()) {
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);

        //Se o valor optionalString é presente, retorna, senão lança uma exceção
        optionalString.orElseThrow(IllegalStateException::new);

    }
}
