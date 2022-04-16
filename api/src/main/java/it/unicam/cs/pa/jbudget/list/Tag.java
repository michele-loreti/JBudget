/*
 * JBudget: A simple Java application for tracking incomes and expenses.
 *
 * Copyright 2022 Michele Loreti
 *
 * Use of this source code is governed by an MIT-style license that can be found in the LICENSE file or at https://opensource.org/licenses/MIT.
 */

package it.unicam.cs.pa.jbudget.list;

/**
 * A tag represents a label associated with transactions and movements.
 */
public interface Tag {

    /**
     * Returns the index that univocally identifying this tag.
     *
     * @return the index that univocally identifying this tag.
     */
    int getTagIndex();

    /**
     * Returns the name of this tag.
     *
     * @return the name of this tag.
     */
    String getTagName();

}
