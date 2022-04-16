/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * A movement represents an action performed in an account. It can
 */
public interface Movement {

    /**
     * Returns the account involved in the movement.
     *
     * @return the account involved in the movement.
     */
    Account getAccount();

    /**
     * Returns the amount associated with this movement.
     *
     * @return the amount associated with this movement.
     */
    double getAmount();

    /**
     * Returns a short description associated with this movement.
     *
     * @return a short description associated with this movement.
     */
    String getDescription();

    /**
     * Returns the transaction where this movement occur.
     *
     * @return the transaction where this movement occur.
     */
    Transaction getTransaction();
}
