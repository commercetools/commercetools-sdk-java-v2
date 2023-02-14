
package com.commercetools.api.models.product_type;

import java.util.Optional;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ProductTypeMixin extends Referencable<ProductType>, ResourceIdentifiable<ProductType> {

    AttributeDefinition getAttribute(final String attributeName);

    Optional<AttributeDefinition> findAttribute(final String attributeName);

    @Override
    public default ProductTypeResourceIdentifier toResourceIdentifier() {
        return ProductTypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ProductTypeReference toReference() {
        return ProductTypeReference.builder().id(getId()).build();
    }
}
