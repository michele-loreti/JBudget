/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

import java.util.List;
import java.util.function.BiFunction;

public class SimpleLedger implements Ledger {

    private final FactoryRegistry<Ledger, Transaction> transactions;

    public SimpleLedger() {
        // OLD STYLE
//        this.transactions = new FactoryRegistry<>(new BiFunction<Integer, Ledger, Transaction>() {
//            @Override
//            public Transaction apply(Integer integer, Ledger ledger) {
//                return new LedgerTransaction(integer, ledger);
//            }
//        });
        // LAMBDA EXPRESSION
//        this.transactions = new FactoryRegistry<>(
//                (id, ledger) -> new LedgerTransaction(id, ledger)
//        );
        this.transactions =
                new FactoryRegistry<>(LedgerTransaction::new);

    }

    public Transaction newTransaction() {
        return transactions.create(this);
    }

    @Override
    public List<Transaction> getTransactions() {
        return transactions.getElements();
    }

    @Override
    public List<Account> getAccounts() {
        return null;
    }

    @Override
    public List<Tag> getTags() {
        return null;
    }

    @Override
    public double getTotalBalance() {
        return 0;
    }

    @Override
    public double getTotalAssets() {
        return 0;
    }

    @Override
    public double getTotalLiabilities() {
        return 0;
    }
}
