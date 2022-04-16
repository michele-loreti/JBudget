/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * A movement represents an operation performed over an account.
 *
 * @param account account involved in the movement.
 * @param amount the amount of the movement.
 * @param description a short description of the movement.
 */
public record Movement(Account account, double amount, String description) {

}
