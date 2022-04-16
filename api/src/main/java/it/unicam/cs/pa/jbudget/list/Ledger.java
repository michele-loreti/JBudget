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

    double getTotalBalance();

    double getTotalAssets();

    double getTotalLiabilities();

}
