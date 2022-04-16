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
 * This class identifies accounts that are used in a given ledger.
 */
public class LedgerAccount extends AbstractElementWithId implements Account {


    private final Ledger ledger;
    private final AccountType accountType;
    private String name;
    private String description;
    private double openingBalance;

    public LedgerAccount(int id, Ledger ledger, AccountInfo info) {
        super(id);
        this.name = info.name();
        this.accountType = info.type();
        this.openingBalance = info.openingBalance();
        this.description = info.description();
        this.ledger = ledger;
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String getAccountName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<Movement> getMovements() {
        return ledger.getAccountMovement(this);
    }

    @Override
    public double getOpeningBalance() {
        return openingBalance;
    }

    @Override
    public void setOpeningBalance(double openingBalance) {
        if (!getAccountType().isValidOpening(openingBalance)) {
            throw new IllegalArgumentException();
        }
        this.openingBalance = openingBalance;
    }

    @Override
    public double getBalance() {
        double sum = openingBalance;
        for (Movement m: getMovements()) {
            sum  += m.amount();
        }
        return sum;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
