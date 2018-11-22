import java.util.Iterator;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        AccountDao accountDao = (AccountDao)context.getBean("accountDaoImp", AccountDao.class);
        accountDao.insertAccount(new Account(6, "Puu"));
        Account act = accountDao.getOneAccount(6);
        System.out.println("---getOne: " + act);
        List<Account> accountList = accountDao.getAllAccounts();
        Iterator var5 = accountList.iterator();

        while(var5.hasNext()) {
            Account account = (Account)var5.next();
            System.out.println(account);
        }

    }
}