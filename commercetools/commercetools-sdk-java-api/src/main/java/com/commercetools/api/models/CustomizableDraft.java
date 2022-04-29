
package com.commercetools.api.models;

import com.commercetools.api.models.type.CustomFieldsDraft;

public interface CustomizableDraft<T extends CustomizableDraft<T>> {
    public CustomFieldsDraft getCustom();

    public void setCustom(final CustomFieldsDraft custom);

    default T unwrapCustomizableDraft() {
        return (T) this;
    }
}
