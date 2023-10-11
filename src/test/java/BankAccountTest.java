import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    public void testGettersAndSetters() {
        BankAccount account = new BankAccount();

        account.setFirstName("Annie");
        assertEquals("Annie", account.getFirstName());

        account.setLastName("Wilson");
        assertEquals("Wilson", account.getLastName());

        // Test for dateOfBirth and accountNumber
        LocalDate dob = LocalDate.of(1997, 9, 24);
        account.setDateOfBirth(dob);
        assertEquals(dob, account.getDateOfBirth());

        account.setAccountNumber(202122);
        assertEquals(202122, account.getAccountNumber());

        // Test for balance
        account.setBalance(5000);
        assertEquals(5000, account.getBalance());
    }

    // test deposit n withdrawal methods

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        assertEquals(1000, account.getBalance());
    }

    @Test
    public void testWithdrawal() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdrawal(500);
        assertEquals(500, account.getBalance());
    }
// test the paying interest method here

    @Test
    public void testPayInterest() {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.payInterest();
        assertEquals(1050, account.getBalance());
    }


}
