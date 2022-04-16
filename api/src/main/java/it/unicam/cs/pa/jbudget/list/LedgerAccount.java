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


    private AccountType accountType;

    public LedgerAccount(int id) {
        super(id);
    }

    @Override
    public AccountType getAccountType() {
        return accountType;
    }

    @Override
    public String getAccountName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public List<Movement> getMovements() {
        return null;
    }

    @Override
    public double getOpeningBalance() {
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }
}
