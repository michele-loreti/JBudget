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
 * Represents a statement of transactions during a period and the resulting balance.
 */
public interface Account extends ElementWithId {

    /**
     * Returns the account type.
     * @return the account type.
     */
    AccountType getAccountType();

    /**
     * Returns the account name.
     *
     * @return the account name.
     */
    String getAccountName();

    /**
     * Returns a short description identifying the account.
     *
     * @return a short description identifying the account.
     */
    String getDescription();

    /**
     * Returns the list of movements recorded in this account.
     *
     * @return the list of movements recorded in this account.
     */
    List<Movement> getMovements();

    /**
     * Returns the opening balance for this account.
     *
     * @return the opening balance for this account.
     */
    double getOpeningBalance();

    /**
     * Returns the current balance for this account.
     *
     * @return the current balance for this account.
     */
    double getBalance();

}
