import java.util.List;

public interface AccountDao {
    void insertAccount(Account var1);

    Account getOneAccount(int var1);

    List<Account> getAllAccounts();
}
