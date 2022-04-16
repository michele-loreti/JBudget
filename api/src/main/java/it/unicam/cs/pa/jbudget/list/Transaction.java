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

}
