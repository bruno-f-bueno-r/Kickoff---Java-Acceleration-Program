void main() {
    ArrayList<BankUser> users = new ArrayList<>();
    BankUser user1 = new BankUser("3839284291824334", "12-29", 305, 13340);
    BankUser user2 = new BankUser("1849209179023921", "04-28", 283, 2020);
    BankUser user3 = new BankUser("7583928875938921", "08-30", 305, 917);
    BankUser user4 = new BankUser("8590291802938495", "07-29", 157, 10000);
    Random r = new Random();
    int option;
    int opt2;
    String cardNumber;
    String expiryDate;
    int cvv;
    boolean flag = false;
    float price = 0;
    int i;

    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);

    do {
        i = 0;
        cardNumber = IO.readln("Enter the card number: ");
        cvv = Integer.parseInt(IO.readln("Enter the CVV: "));
        expiryDate = IO.readln("Enter the expiry date: ");

        for(BankUser user : users) {
            if(cardNumber.equals(user.getCardNumber()) && cvv == user.getCVV() && expiryDate.equals(user.getExpiryDate())) {
                flag = true;
                break;
            }
            else i++;
        }
        if(!flag) IO.println("There's not a card number like that!");
    } while(!flag);
    IO.println("");
    IO.println("Welcome!");
    IO.println("Funds: $" + String.format("%.2f", users.get(i).getMoney()));

    do {
        IO.println("-------- Payment System --------");
        IO.println("1. Credit Card Payment");
        IO.println("2. PayPal Payment");
        IO.println("3. Bank Transfer Payment");
        IO.println("4. Change Bank Account");
        IO.println("5. Exit");
        option = Integer.parseInt(IO.readln("Enter an option: "));
        price = (float) (r.nextInt(10000) + 1) / 10;

        switch (option) {
            case 1:
                IO.println("Price of the product: $" + String.format("%.2f", price));
                IO.println("Do you want to pay for this product? 1. Yes   2. No");
                opt2 = Integer.parseInt(IO.readln(""));
                if(opt2 == 1) {
                    if(users.get(i).getMoney() >= price) {
                        IO.println("You have successfully purchased the product!");
                        users.get(i).setMoney(users.get(i).getMoney() - price);
                        IO.println("Funds left: $" + String.format("%.2f", users.get(i).getMoney()));
                    }
                    else {
                        IO.println("You don't have enough funds!");
                    }
                }
                else {
                    IO.println("Goodbye!");
                }
                break;
            case 2:
                IO.println("Price of the product: $" + String.format("%.2f", price));
                IO.println("Do you want to pay for this product with PayPal? 1. Yes   2. No");
                int opt3 = Integer.parseInt(IO.readln(""));
                if(opt3 == 1) {
                    if(users.get(i).getMoney() >= price) {
                        IO.println("You have successfully purchased the product!");
                        users.get(i).setMoney(users.get(i).getMoney() - price);
                        IO.println("Funds left: $" + String.format("%.2f", users.get(i).getMoney()));
                    }
                    else {
                        IO.println("You don't have enough funds!");
                    }
                }
                else {
                    IO.println("Goodbye!");
                }
                break;
            case 3:
                boolean flag2;
                do {
                    flag2 = false;
                    String transferCard = IO.readln("Enter the card number to transfer to: ");
                    float transfer;
                    for(BankUser user : users) {
                        if(transferCard.equals(user.getCardNumber()) && !transferCard.equals(cardNumber)) {
                            do {
                                transfer = Float.parseFloat(IO.readln("Enter the funds to transfer: $"));
                                if(transfer > users.get(i).getMoney()) IO.println("You don't have enough funds!");
                            } while(transfer > users.get(i).getMoney());
                            if(users.get(i).getMoney() >= transfer) {
                                user.setMoney(user.getMoney() + transfer);
                                users.get(i).setMoney(users.get(i).getMoney() - transfer);
                                IO.println("Successfully transferred!");
                                IO.println("Funds left: $" + String.format("%.2f", users.get(i).getMoney()));
                                flag2 = true;
                                break;
                            }
                        }
                    }
                    if(!flag2) {
                        IO.println("The card number doesn't exist...");
                    }
                } while(!flag2);
                break;
            case 4:
                flag = false;
                do {
                    i = 0;
                    cardNumber = IO.readln("Enter the card number: ");
                    cvv = Integer.parseInt(IO.readln("Enter the CVV: "));
                    expiryDate = IO.readln("Enter the expiry date: ");

                    for(BankUser user : users) {
                        if(cardNumber.equals(user.getCardNumber()) && cvv == user.getCVV() && expiryDate.equals(user.getExpiryDate())) {
                            flag = true;
                            break;
                        }
                        else i++;
                    }
                    if(!flag) IO.println("There's not a card number like that!");
                } while(!flag);
                IO.println("");
                IO.println("Welcome!");
                IO.println("Funds: $" + String.format("%.2f", users.get(i).getMoney()));
                break;
            case 5:
                IO.println("See you later!");
                break;
            default:
                IO.println("Error! The option must be between 1 - 6");
        }
        IO.println("");
    } while(option != 5);
}