/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * This interface is used to represent objects that are univocally
 * identified by an id, that is an integer.
 */
public interface ElementWithId {

    /**
     * Returns the id used to identify this object.
     *
     * @return the id used to identify this object.
     */
    int getId();

}
