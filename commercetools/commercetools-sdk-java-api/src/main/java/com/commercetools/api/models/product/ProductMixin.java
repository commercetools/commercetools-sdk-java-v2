
package com.commercetools.api.models.product;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ProductMixin extends Referencable<Product>, ResourceIdentifiable<Product> {
    @Override
    public default ProductResourceIdentifier toResourceIdentifier() {
        return ProductResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductReference toReference() {
        return ProductReference.builder().id(getId()).build();
    }
}
