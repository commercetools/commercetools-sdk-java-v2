
package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.Referencable;

public interface CustomObjectMixin extends Referencable<CustomObject> {
    @Override
    public default CustomObjectReference toReference() {
        return CustomObjectReference.builder().id(getId()).build();
    }
}
