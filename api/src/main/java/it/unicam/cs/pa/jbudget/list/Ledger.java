/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

import java.util.List;

/**
 * A ledger is a book or collection of accounts in which account transactions are recorded.
 */
public interface Ledger {

    /**
     * Returns the list of transactions recorded in this ledger.
     *
     * @return the list of transactions recorded in this ledger.
     */
    List<Transaction> getTransactions();

    /**
     * Returns the list of accounts in this ledger.
     *
     * @return the list of accounts in this ledger.
     */
    List<Account> getAccounts();

    /**
     * Returns the list of tag used in this ledger.
     *
     * @return the list of tag used in this ledger.
     */
    List<Tag> getTags();

    /**
     * Returns the current balance in the ledger.
     *
     * @return the current balance in the ledger.
     */
    double getTotalBalance();

    /**
     * Returns the sum of opening balances of the accounts in this ledger.
     *
     * @return the sum of opening balances of the accounts in this ledger.
     */
    double getOpeningBalance();

    /**
     * Returns the total amount of assets in this ledger.
     *
     * @return the total amount of assets in this ledger.
     */
    double getTotalAssets();

    /**
     * Returns the total amount of liabilities in this ledger.
     *
     * @return the total amount of liabilities in this ledger.
     */
    double getTotalLiabilities();

    /**
     * Returns the movement of the given account.
     *
     * @param account a non-null reference to an account in this ledger.
     * @return the movement of the given account.
     */
    List<Movement> getAccountMovement(Account account);

    /**
     * Creates an account with the given type, name and openingBalance.
     *
     * @param type account type.
     * @param name account name.
     * @param openingBalance opening balance of the account.
     * @return the new created account.
     * @throws IllegalArgumentException when <code>!type.isValidOpening(openingBalance)</code>.
     */
    default Account newAccount(AccountType type, String name, double openingBalance) {
        return newAccount(type, name, openingBalance, "");
    }

    /**
     * Creates an account with the given type, name and openingBalance.
     *
     * @param type account type.
     * @param name account name.
     * @param openingBalance opening balance of the account.
     * @param description a short description of account.
     * @return the new created account.
     * @throws IllegalArgumentException when <code>!type.isValidOpening(openingBalance)</code>.
     */
    Account newAccount(AccountType type, String name, double openingBalance, String description);
}
