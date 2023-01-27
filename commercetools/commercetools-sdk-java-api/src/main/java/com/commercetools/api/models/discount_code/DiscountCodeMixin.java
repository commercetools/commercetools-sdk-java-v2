
package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface DiscountCodeMixin extends Referencable<DiscountCode>, ResourceIdentifiable<DiscountCode> {
    @Override
    public default DiscountCodeResourceIdentifier toResourceIdentifier() {
        return DiscountCodeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default DiscountCodeReference toReference() {
        return DiscountCodeReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.DISCOUNT_CODE;
    }
}
