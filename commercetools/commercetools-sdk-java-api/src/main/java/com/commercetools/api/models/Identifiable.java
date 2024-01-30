
package com.commercetools.api.models;

/**
 * an object identifiable by an ID
 * @param <T> The type which has an ID.
 */
public interface Identifiable<T> {
    /**
     * The unique ID of this object.
     * @return ID
     */
    String getId();

    static <T> Identifiable<T> of(final String id) {
        return new SimpleIdentifiable<>(id);
    }
}
