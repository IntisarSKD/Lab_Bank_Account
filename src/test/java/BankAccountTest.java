import org.junit.jupiter.api.Assertions;
import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp(){
        account = new BankAccount();
        account.setFirstName("Elon");
        account.setLastName("Musk");
        account.setDateOfBirth(LocalDate.of(1971, 06, 28));
        account.setAccountNumber("287452");
        account.setBalance(0);

    }
    @Test // testing deposit method
    public void testDeposit() {
        account.deposit(2000.0);
        assertEquals(2000.0, account.getBalance());
    }

    @Test // testing withdrawal method
    public void testWithdrawal() {
        account.withdrawal(2000);
        assertEquals(-2000, account.getBalance());
    }





}