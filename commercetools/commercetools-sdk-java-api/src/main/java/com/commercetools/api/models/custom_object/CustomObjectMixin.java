
package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface CustomObjectMixin extends Referencable<CustomObject> {
    @Override
    public default CustomObjectReference toReference() {
        return CustomObjectReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.KEY_VALUE_DOCUMENT;
    }
}
