public class Test {
    public static void main(String[] args) throws UnknownOperatorException {
        Number test = new Number();
        Math output = new Math();
        output.setNumbers(test);
        try {
            output.resoult(test);
        }catch (UnknownOperatorException er){
            System.err.println(er.getMessage());
        }


    }
}
