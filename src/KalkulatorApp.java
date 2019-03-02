public class KalkulatorApp {
    public static void main(String[] args) {
        String działanie = InputManager.getOperation();
        OperationValidator.validate(działanie); //todo obsługa wyjatku

        String liczba1 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba1);

        String liczba2 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba2);

        Integer a = Integer.valueOf(liczba1);
        Integer b = Integer.valueOf(liczba2);


        System.out.println(Operations.giveAnswer()); //todo obsługa wyjatku... czy napewno?
    }
}
