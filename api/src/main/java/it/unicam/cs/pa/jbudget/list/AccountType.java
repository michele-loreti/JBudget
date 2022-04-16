/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * We consider two kinds of accounts: assets and liabilities.
 */
public enum AccountType {

    /**
     * Assets are resources (tangible and intangible) that your business owns,
     * and that can provide you with future economic benefit.
     */
    ASSET,

    /**
     * Liabilities are your business' debts or obligations which you need to fulfil in the future.
     */
    LIABILITY;


    public boolean isValidOpening(double amount) {
        return ((this == ASSET)&&(amount>=0))||((this == LIABILITY)&&(amount<=0));
    }
}
