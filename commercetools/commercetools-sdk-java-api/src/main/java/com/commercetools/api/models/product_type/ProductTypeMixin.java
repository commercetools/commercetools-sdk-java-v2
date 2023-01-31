
package com.commercetools.api.models.product_type;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ProductTypeMixin extends Referencable<ProductType>, ResourceIdentifiable<ProductType> {
    @Override
    public default ProductTypeResourceIdentifier toResourceIdentifier() {
        return ProductTypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductTypeReference toReference() {
        return ProductTypeReference.builder().id(getId()).build();
    }
}
