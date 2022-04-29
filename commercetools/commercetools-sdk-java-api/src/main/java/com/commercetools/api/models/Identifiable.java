
package com.commercetools.api.models;

/**
 * an object identifiable by an ID
 * @param <T>
 */
public interface Identifiable<T> {
    /**
     * The unique ID of this object.
     * @return ID
     */
    String getId();
}
