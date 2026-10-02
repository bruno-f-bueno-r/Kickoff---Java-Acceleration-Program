void main() {
    IO.println("First, let's create an account");
    String username = IO.readln("Enter your username: ");
    String password = IO.readln("Enter your password: ");
    float balance = 100;
    int option;
    int i = 1;
    String transaction_history = "";
    IO.println("\nWelcome! Your balance is: $" + String.format("%.2f", balance));
    do {
        float deposit;
        float withdraw;
        IO.println("""
                1. Deposit
                2. Withdraw
                3. Check balance
                4. Transaction history
                5. Exit""");
        option = Integer.parseInt(IO.readln("Enter an option: "));
        IO.println("");
        float previous_bal = balance;
        switch(option) {
            case 1:
                do {
                    deposit = Float.parseFloat(IO.readln("How much do you want to deposit? $"));
                    if(deposit >= 0) {
                        balance += deposit;
                        IO.println("New balance = $" + String.format("%.2f", balance));
                        transaction_history += String.format("%d", i) + ". Balance: $" + String.format("%.2f", previous_bal) + " -> " + "You deposited $" + String.format("%.2f", deposit) + " \n";
                        i++;
                    }
                    else {
                        IO.println("Error! The value entered isn't valid to deposit");
                    }
                } while(deposit < 0);
                break;
            case 2:
                do {
                    withdraw = Float.parseFloat(IO.readln("How much do you want to withdraw? $"));
                    if (withdraw > balance) {
                        IO.println("You don't have enough money to withdraw!");
                    }
                    else if(withdraw < 0) {
                        IO.println("Error! The value entered isn't valid to withdraw");
                    }
                    else {
                        balance -= withdraw;
                        IO.println("New balance = $" + String.format("%.2f", balance));
                        transaction_history += String.format("%d", i) + ". Balance: $" + String.format("%.2f", previous_bal) + " -> " + "You withdrew $" + String.format("%.2f", withdraw) + " \n";
                        i++;
                    }
                } while(withdraw > previous_bal || withdraw < 0);
                break;
            case 3:
                IO.println("Balance: $" + String.format("%.2f", balance));
                break;
            case 4:
                IO.println("Your transaction history:");
                if(transaction_history.isEmpty()) {
                    IO.println("You have no transaction history yet!");
                }
                else {
                    IO.println(transaction_history);
                }
                IO.println("Actual Balance: $" + String.format("%.2f", balance));
                break;
            case 5:
                IO.println("See you next time!");
                break;
            default:
                IO.println("Error! Enter a number between 1 - 5");
        }
        IO.println("");
    } while(option != 5);
}