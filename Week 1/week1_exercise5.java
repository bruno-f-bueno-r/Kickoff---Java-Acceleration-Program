void main() {
    float balance = 100;
    int option;
    do {
        float deposit;
        float withdraw;
        IO.println("""
                1. Check Balance
                2. Deposit
                3. Withdraw
                4. Exit""");
        option = Integer.parseInt(IO.readln("Enter an option: "));
        if(option == 1) {
            IO.println("Balance: $" + String.format("%.2f", balance));
        }
        else if(option == 2) {
            do {
                deposit = Float.parseFloat(IO.readln("How much do you want to deposit? "));
                if(deposit >= 0) {
                    balance += deposit;
                    IO.println("New balance = $" + String.format("%.2f", balance));
                }
                else {
                    IO.println("Error! The value entered isn't valid to deposit");
                }
            } while(deposit < 0);
        }
        else if(option == 3) {
            float previous_bal = balance;
            do {
                withdraw = Float.parseFloat(IO.readln("How much do you want to withdraw? "));
                if (withdraw > balance) {
                    IO.println("You don't have enough to withdraw!");
                }
                else if(withdraw < 0) {
                    IO.println("Error! The value entered isn't valid to withdraw");
                }
                else {
                    balance -= withdraw;
                    IO.println("New balance = $" + String.format("%.2f", balance));
                }
            } while(withdraw > previous_bal || withdraw < 0);
        }
        else if(option == 4) {
            IO.println("See you next time!");
        }
        else {
            IO.println("Error! Enter a number between 1 - 4");
        }
        IO.println("");
    } while(option != 4);
}