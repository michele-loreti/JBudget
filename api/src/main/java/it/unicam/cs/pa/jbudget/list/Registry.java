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
 * This class is used to create and retrieve objects that
 * are univocally identified by an id.
 */
public interface Registry<R, T extends ElementWithId> {

    /**
     * Creates an element with a new generated id.
     * @param args parameters used to create the new element.
     * @return an element wit a new generated id.
     */
    T create(R args);

    /**
     * Creates an element with that is identified by the given id.
     * @param id identifier associated with the created element.
     * @param args parameters used to create the new element.
     * @return an element wit a new generated id.
     * @throws IllegalArgumentException if the given id is not valid.
     */
    T create(int id, R args);

    /**
     * Returns true if the given id is valid in this registry.
     * @param id an identifier.
     * @return true if the given id is valid in this registry.
     */
    boolean isValidForNewId(int id);

    /**
     * Returns the element associated with the given id, if it exists.
     * A null value is returned otherwise.
     *
     * @param id an identifier.
     * @return the element associated with the given id, if it exists.
     */
    T get(int id);

    /**
     * Deletes the element associated with the given id. This method
     * returns true if the element has been cancelled, false otherwise.
     * @param id the identifier associated with the element to delete.
     * @return true if the element has been cancelled, false otherwise.
     */
    boolean delete(int id);

    /**
     * Returns true if there exists in this registry an element having the
     * given id.
     *
     * @param id an element id.
     * @return true if there exists in this registry an element having the
     * given id.
     */
    boolean contains(int id);

    /**
     * Returns the list of elements in the given registry.
     *
     * @return the list of elements in the given registry.
     */
    List<T> getElements();
}
