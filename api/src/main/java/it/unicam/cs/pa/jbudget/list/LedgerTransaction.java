/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * This is a transaction associated with a specific ledger.
 */
public class LedgerTransaction extends AbstractElementWithId implements Transaction {


    private final Ledger ledger;

    private Date date;
    private final List<Movement> movements;
    private String description;

    /**
     * Creates a transaction associated with the given ledger and having the
     * given id. The new crated transaction does not contain any movement, and
     * it is performed at the current date.
     *
     * @param id id associated with the created transaction.
     * @param ledger ledger associated with the transaction.
     */
    public LedgerTransaction(Integer id, Ledger ledger) {
        this(id, ledger, new Date(), new LinkedList<>(), "");
    }

    /**
     * Creates a new transaction from the given arguments.
     *
     * @param id id associated with the created transaction.
     * @param ledger ledger associated with the new created transaction.
     * @param date transaction date.
     * @param movements list of movements in the transaction.
     */
    public LedgerTransaction(int id, Ledger ledger, Date date, List<Movement> movements, String description) {
        super(id);
        this.ledger = ledger;
        this.date = date;
        this.movements = movements;
        this.description = description;
    }

    /**
     * Returns the ledger associated with this transaction.
     *
     * @return the ledger associated with this transaction.
     */
    public Ledger getLedger() {
        return ledger;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public double balance() {
        double toReturn = 0.0;
        for (Movement m: getMovements()) {
            toReturn += m.getAmount();
        }
        return toReturn;
    }

    @Override
    public List<Movement> getMovements() {
        return movements;
    }

    @Override
    public List<Tag> getTags() {
        return null;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
