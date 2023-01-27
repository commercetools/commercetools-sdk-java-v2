
package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;
import com.commercetools.api.models.common.ReferenceTypeId;

public interface ProductSelectionMixin extends Referencable<ProductSelection>, ResourceIdentifiable<ProductSelection> {
    @Override
    public default ProductSelectionResourceIdentifier toResourceIdentifier() {
        return ProductSelectionResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductSelectionReference toReference() {
        return ProductSelectionReference.builder().id(getId()).build();
    }

    public static ReferenceTypeId referenceTypeId() {
        return ReferenceTypeId.PRODUCT_SELECTION;
    }
}
