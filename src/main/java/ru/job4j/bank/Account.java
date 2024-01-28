package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает счет пользователя.
 */
public class Account {

    /**
     * Реквизиты счета.
     */
    private String requisite;

    /**
     * Баланс денежных средств которые в настоящее время находятся на счету.
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод производит сравнение счетов пользователя по реквизитам.
     * @param o счет пользователя.
     * @return результат сравнения двух счетов.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
