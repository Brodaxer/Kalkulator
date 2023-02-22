import java.util.Scanner;

class Math {
    public Scanner sc = new Scanner(System.in);

    public void setNumbers(Number number) {
        System.out.println("Podaj pierwsza liczbe: ");
        number.setA(sc.nextDouble());
        System.out.println("Podaj druga liczbe: ");
        number.setB(sc.nextDouble());
        sc.nextLine();
    }
    public void resoult(Number number) throws UnknownOperatorException {
        System.out.println("Wprowadz znak dzialania (+,-,*,/)");
        try {
            String input = sc.nextLine();
            if (input == "+" || input == "-" || input == "/" || input == "*") {
                switch (input) {
                    case "+" -> System.out.println(addNumbers(number));
                    case "-" -> System.out.println(subNumbers(number));
                    case "*" -> System.out.println(multiNumbers(number));
                    case "/" -> System.out.println(dividNumbers(number));
                }
            }
            throw new UnknownOperatorException("Zly operator arytmetyczny");
        }catch (UnknownOperatorException er){
            System.err.println("Zly operator arytmetyczny");
        }
    }
    public double dividNumbers(Number number) {
            try{
                return (int) number.getA() / (int) number.getB();
            }catch (ArithmeticException er){
                System.err.println("Nie mozna dzielic przez zero");

            }
            return  number.getA() /  number.getB();
    }

    public double addNumbers(Number number) {
        return number.getA() + number.getB();
    }

    public double subNumbers(Number number) {
        return number.getA() - number.getB();
    }

    public double multiNumbers(Number number) {
        return number.getA() * number.getB();
    }


}
