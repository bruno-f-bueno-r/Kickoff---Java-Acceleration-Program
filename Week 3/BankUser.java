public class BankUser {
    private String cardNumber;
    private String expiryDate;
    private int cvv;
    private float money;

    public BankUser(String cardNumber, String expiryDate, int cvv, float money) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.money = money;
    }

    public String getCardNumber() { return this.cardNumber; }
    public String getExpiryDate() { return this.expiryDate; }
    public int getCVV() { return this.cvv; }
    public float getMoney() { return this.money; }

    public void setMoney(float money) { this.money = money; }
}