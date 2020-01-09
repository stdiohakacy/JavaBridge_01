package structual.Bridge._01;

public interface Account {
    void openAccount();
}

class CheckingAccount implements Account {
	 
    @Override
    public void openAccount() {
        System.out.println("Checking Account");
    }
}

class SavingAccount implements Account {
	 
    @Override
    public void openAccount() {
        System.out.println("Saving Account");
    }
}