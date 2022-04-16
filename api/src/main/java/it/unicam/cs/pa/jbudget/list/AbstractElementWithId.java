/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * This is an abstract class that provides the base for implementing
 * an element with id.
 */
public abstract class AbstractElementWithId implements ElementWithId {

    private final int id;

    public AbstractElementWithId(int id) {
        this.id = id;
    }

    @Override
    public final int getId() {
        return id;
    }
}
