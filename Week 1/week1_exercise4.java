void main() {
    // Guessing Game
    Random r = new Random();
    int number = r.nextInt(100) + 1;
    int guess;
    int count = 0;

    do {
        guess = Integer.parseInt(IO.readln("Enter a number (1 - 100): "));
        if(guess < number) IO.println("Your number is LOWER than the real one");
        else if(guess > number) IO.println("Your number is HIGHER than the real one");
        else if(guess == number) IO.println("You guessed it!!");
        else IO.println("Error! Your guess isn't valid");
        count++;
    } while (guess != number);

    IO.println("Number of guesses: " + count);
}