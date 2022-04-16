/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

public record AccountInfo(AccountType type, String name, double openingBalance, String description) {

    public AccountInfo {
        if (!type.isValidOpening(openingBalance)) {
            throw new IllegalArgumentException("Invalid opening balance for account of type "+type);
        }
    }

}
