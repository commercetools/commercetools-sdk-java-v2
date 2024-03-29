
package com.commercetools.api.models;

import com.commercetools.api.models.common.Reference;

/**
 * Interface of a resource with an ID and version
 * @param <T> the type of the referenced object.
 */
public interface Referencable<T extends Referencable<T>> extends Identifiable<T> {
    public Reference toReference();
}
