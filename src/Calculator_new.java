public class Calculator_new {

    private double result;

    Calculator_new (){
        this.result = 0.0;
    }
    Calculator_new(double result){
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public void Add(double number){
        result += number;
    }
    public void Subtraction (double number){
        result -= number;
    }
    public void Multiplication (double number){
        result *= number;
    }
    public void Division (double number){
        result /= number;
    }
    public void Print(){
        System.out.println("The result is: " + result);
    }
}
/* Calculator_new obj = new Calculator_new();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give me one number: ");
            int input;
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter a number");
                    obj.Add(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter a number");
                    obj.Subtraction(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter a number");
                    obj.Multiplication(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Enter a number");
                    obj.Division(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("EPrinting the result");
                    obj.Print();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                case 7:
                    System.out.println("Invalid");
                    break;
            }
            if (input == 6){
                return;
            }


            } */
