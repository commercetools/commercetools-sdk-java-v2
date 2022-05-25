
package com.commercetools.api.models;

import com.commercetools.api.models.common.ResourceIdentifier;

/**
 * Interface of a resource with an ID and version
 * @param <T> the type of the resource which is referenced to
 */
public interface ResourceIdentifiable<T extends ResourceIdentifiable<T>> extends Identifiable<T> {
    public ResourceIdentifier toResourceIdentifier();
}
