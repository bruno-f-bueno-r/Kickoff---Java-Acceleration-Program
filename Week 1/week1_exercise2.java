void main() {
    IO.println("-------- CALCULADORA --------");
    float first = Float.parseFloat(IO.readln("Introduzca el primero número: "));
    float second = Float.parseFloat(IO.readln("Introduzca el segundo número: "));

    IO.println("1. Suma (+)");
    IO.println("2. Resta (-)");
    IO.println("3. Multiplicación (*)");
    IO.println("4. División (/)");
    IO.println("5. Residuo (%)");
    String operation = IO.readln("Introduzca el signo para realizar la operación deseada: ");
    float result = 0;

    switch(operation) {
        case "+": result = first + second; break;
        case "-": result = first - second; break;
        case "*": result = first * second; break;
        case "/": result = first / second; break;
        case "%": result = first % second; break;
        default: IO.println("No se pudo realizar la operación");
    }

    IO.println(String.format("%f", first) + " " + operation + " " + String.format("%f", second) + " = " + String.format("%f", result));
}