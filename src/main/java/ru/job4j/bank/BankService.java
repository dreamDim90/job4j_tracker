package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса, который позволяет
 * @author DMITRIY MIHAYLIN
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователя с привязанными к нему счетами осуществляется в коллекции типа HashMap.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на входе пользователя и добавляет его в хранилище пользователей,
     * если пользователь уже присутствует в хранилище то добавление не происходит.
     * @param user пользователь которого добавляем в хранилище
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из хранилища.
     * Поиск пользователя происходит по номеру паспорта
     * @param passport идентифицирует пользователя в хранилище
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод добавляет новый счет пользователю.
     * @param passport номер паспорта пользователя которому необходимо добавить новый счет.
     * @param account счет который необходимо добавить пользователю.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> value = users.get(user);
            if (!value.contains(account)) {
                value.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по пасспорту.
     * @param passport номер паспорта пользователя.
     * @return пользователя, который был найден по номеру пасспорта или null если пользователь не найден.
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод осуществляет поиск счета пользователя. Сначала происходит поиск пользователя по номеру пасспорта.
     * Если пользователь найден, то происходит поиск счета пользователя по реквизитам.
     * @param passport номер пасспорта пользователя.
     * @param requisite номер счета пользователя.
     * @return найденный счет пользователя или null если пользователь не найден.
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> values = users.get(user);
            for (Account value : values) {
                if (value.getRequisite().equals(requisite)) {
                    rsl = value;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод осуществляет перевод средств с одного счета на другой.
     * @param sourcePassport пасспорт отправителя средств.
     * @param sourceRequisite счет отправителя средств.
     * @param destinationPassport пасспорт получателя средств.
     * @param destinationRequisite счет получателя средств.
     * @param amount сумма перемещаемых средств.
     * @return true если перевод выполнен успешно, false если перевод не выполнен.
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null
                && sourceAccount.getBalance() >= amount) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destinationAccount.setBalance(destinationAccount.getBalance() + amount);
            result = true;
        }
        return result;
    }

    /**
     * Метод позволяет получить список счетов привязанных к пользователю.
     * @param user пользователь, счета которого необходимо получить.
     * @return список счетов пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
