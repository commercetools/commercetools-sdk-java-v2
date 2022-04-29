
package com.commercetools.api.models;

import com.commercetools.api.models.common.Reference;

/**
 * Interface of a resource with an ID and version
 * @param <T>
 */
public interface Referencable<T extends Referencable<T>> extends Identifiable<T> {
    public Reference toReference();
}
