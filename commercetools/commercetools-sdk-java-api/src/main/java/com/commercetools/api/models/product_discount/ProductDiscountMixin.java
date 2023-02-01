
package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ProductDiscountMixin extends Referencable<ProductDiscount>, ResourceIdentifiable<ProductDiscount> {
    @Override
    public default ProductDiscountResourceIdentifier toResourceIdentifier() {
        return ProductDiscountResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductDiscountReference toReference() {
        return ProductDiscountReference.builder().id(getId()).build();
    }
}
