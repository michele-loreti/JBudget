/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

import java.util.Date;
import java.util.List;

/**
 * It represents an activity stored in a {@link Ledger}.
 */
public interface Transaction extends ElementWithId {

    /**
     * Returns the date when this transaction occurred.
     *
     * @return the date when this transaction occurred.
     */
    Date getDate();

    /**
     * Sets the date when this transaction occurred.
     *
     * @param date the date when this transaction occurred.
     */
    void setDate(Date date);

    /**
     * Returns the total amount of this transaction. If the returned value is positive, the transaction
     * correspond to an incoming, otherwise it represents an expence.
     *
     * @return the total amount of this transaction.
     */
    double balance();

    /**
     * Returns the list of movements involved in this transactions.
     *
     * @return the list of movements involved in this transactions.
     */
    List<Movement> getMovements();

    /**
     * Returns the list of movements associated with this transaction.
     *
     * @return the list of movements associated with this transaction.
     */
    List<Tag> getTags();


    /**
     * Returns a short description of this transaction.
     *
     * @return a short description of this transaction.
     */
    String getDescription();

    /**
     * Sets the description associated with this transaction.
     *
     * @param description the description associated with this transaction.
     */
    void setDescription(String description);

    /**
     * Adds a movement to this transaction.
     *
     * @param account the account involved in the movement.
     * @param amount the amount of the movement.
     * @param description a short description associated with the movement.
     */
    void addMovement(Account account, double amount, String description);

    /**
     * Adds a movement to this transaction.
     *
     * @param account the account involved in the movement.
     * @param amount the amount of the movement.
     */
    default void addMovement(Account account, double amount) {
        addMovement(account, amount, "");
    }

    /**
     * Removes the given movement from this transaction. The method returns true if the movement has been
     * successfully removed, false otherwise.
     * @param m the movement to remove.
     * @return true if the movement has been  successfully removed, false otherwise.
     */
    boolean removeMovement(Movement m);

    /**
     * Returns the number of movements in this transaction.
     *
     * @return the number of movements in this transaction.
     */
    int size();

    /**
     * Returns the i-th movement in this transaction.
     *
     * @param i movement index.
     * @return the i-th movement in this transaction.
     * @throws IndexOutOfBoundsException whenever <code>(i<0)||(i>=size())></code>
     */
    Movement getMovement(int i);

    /**
     * Sets the i-th movement in this transaction.
     *
     * @param i movement index.
     * @param m movement to set.
     * @throws IndexOutOfBoundsException whenever <code>(i<0)||(i>=size())></code>
     * @throws NullPointerException whenever <code>m==null</code>
     */
    void setMovement(int i, Movement m);
}
