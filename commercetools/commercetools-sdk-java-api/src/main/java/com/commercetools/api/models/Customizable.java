
package com.commercetools.api.models;

import com.commercetools.api.models.type.CustomFields;

/**
 * Entity with a CustomField property
 * @param <T> The type which is customizable.
 */
public interface Customizable<T extends Customizable<T>> {
    /**
     * <p>Custom Fields defined for the entity</p>
     * @return CustomFields
     */
    public CustomFields getCustom();

    /**
     * <p>Custom Fields defined for the entity</p>
     * @param custom custom field
     */
    public void setCustom(final CustomFields custom);

    default T unwrapCustomizable() {
        return (T) this;
    }
}
