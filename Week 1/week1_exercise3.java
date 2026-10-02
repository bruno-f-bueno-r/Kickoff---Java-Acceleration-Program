void main() {
    int number = Integer.parseInt(IO.readln("Enter a number: "));

    if(number % 2 == 0) IO.println("Even");
    else IO.println("Odd");

    if(number > 0) IO.println("Positive");
    else IO.println("Negative");

    int count = 0;
    for(int i = 2; i < number; i++) {
        if(number % i == 0) {
            count++;
        }
    }

    if(count > 0) IO.println("Not prime");
    else IO.println("Prime");
}