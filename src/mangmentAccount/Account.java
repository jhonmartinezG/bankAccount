package mangmentAccount;

public class Account {

    private String ownerName;
    private float currentAmount = 0;

    public float addMoney(float valueEntered) {
        currentAmount = currentAmount + valueEntered;
        System.out.println(this.ownerName + " su nuevo saldo es: " + currentAmount);
        return currentAmount;
    }

    public float retrieveMoney(float valueEntered) {

        if(valueEntered < currentAmount) {
            currentAmount = currentAmount - valueEntered;
            System.out.println(this.ownerName + " su nuevo saldo es: " + currentAmount);
        } else {
            System.out.println(this.ownerName + " no es posible retirar esta cantidad de dinero, ya que es mayor al saldo actual");
        }
        return currentAmount;

    }

    public String addName(String ownerName) {
        return this.ownerName = ownerName;
    }

    public void showCurrentAmount() {
        System.out.println("Su saldo actual es: "  + currentAmount);
    }


}
