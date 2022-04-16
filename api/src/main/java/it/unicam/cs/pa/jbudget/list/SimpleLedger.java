/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

import java.util.LinkedList;
import java.util.List;

public class SimpleLedger implements Ledger {

    private final FactoryRegistry<Ledger, Transaction> transactions;
    private final FactoryRegistry<AccountInfo, Account> accounts;

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
        this.accounts =
                new FactoryRegistry<>((i, ai) -> new LedgerAccount(i, this, ai));
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
        double sum = getOpeningBalance();
        for(Transaction t: getTransactions()) {
            sum += t.balance();
        }
        return sum;
    }

    @Override
    public double getOpeningBalance() {
        double sum = 0.0;
        for (Account a: getAccounts()) {
            sum += a.getBalance();
        }
        return sum;
    }

    @Override
    public double getTotalAssets() {
        double sum = 0.0;
        for (Account a: getAccounts()) {
            if (a.getAccountType() == AccountType.ASSET) {
                sum += a.getBalance();
            }
        }
        return sum;
    }

    @Override
    public double getTotalLiabilities() {
        double sum = 0.0;
        for (Account a: getAccounts()) {
            if (a.getAccountType() == AccountType.LIABILITY) {
                sum += a.getBalance();
            }
        }
        return sum;
    }

    @Override
    public List<Movement> getAccountMovement(Account account) {
        List<Movement> toReturn = new LinkedList<>();
        for(Transaction t: getTransactions()) {
            for(Movement m: t.getMovements()) {
                if (m.account() == account) {
                    toReturn.add(m);
                }
            }
        }
        return toReturn;
    }

    @Override
    public Account newAccount(AccountType type, String name, double openingBalance, String description) {
        return accounts.create(new AccountInfo(type, name, openingBalance, description));
    }


}
