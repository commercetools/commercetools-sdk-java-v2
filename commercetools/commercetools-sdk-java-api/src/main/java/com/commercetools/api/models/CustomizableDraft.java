
package com.commercetools.api.models;

import com.commercetools.api.models.type.CustomFieldsDraft;

/**
 * Entity with a CustomFieldDraft property
 * @param <T> the type of the underlying model, like category.
 */
public interface CustomizableDraft<T extends CustomizableDraft<T>> {
    public CustomFieldsDraft getCustom();

    public void setCustom(final CustomFieldsDraft custom);

    default T unwrapCustomizableDraft() {
        return (T) this;
    }
}
