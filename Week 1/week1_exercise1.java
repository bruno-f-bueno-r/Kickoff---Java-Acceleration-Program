void main() {
    IO.println("1. Celsius -> Fahrenheit");
    IO.println("2. Fahrenheit -> Celsius");
    int convert_to;

    do {
        convert_to = Integer.parseInt(IO.readln("Escribir el número que corresponda a la conversión deseada: "));
        if(convert_to < 1 || convert_to > 2) {
            IO.println("Error! El valor introducido es incorrecto");
        }
    } while(convert_to < 1 || convert_to > 2);

    float result = 0;
    float input = 0;

    if (convert_to == 1) {
        input = Float.parseFloat(IO.readln("Introduce la temperatura en Celsius: "));
    } else if (convert_to == 2) {
        input = Float.parseFloat(IO.readln("Introduce la temperatura en Fahrenheit: "));
    } else {
        IO.println("Error! El valor introducido no es un número correcto");
    }

    if (convert_to == 1) {
        result = input * (9f / 5) + 32;
        IO.println(input + " C -> " + result + " F");
    }
    else if (convert_to == 2) {
        result = (input - 32) * (5f / 9);
        IO.println(input + " F -> " + result + " C");
    }
}
