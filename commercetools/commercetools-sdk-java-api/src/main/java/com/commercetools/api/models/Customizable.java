
package com.commercetools.api.models;

import com.commercetools.api.models.type.CustomFields;

public interface Customizable<T extends Customizable<T>> {
    public CustomFields getCustom();

    public void setCustom(final CustomFields custom);

    default T unwrapCustomizable() {
        return (T) this;
    }
}
