
package com.commercetools.api.models.product;

import com.commercetools.api.models.Referencable;

public interface ByIdVariantIdentifier extends VariantIdentifier {
    String getProductId();

    Integer getVariantId();

    static ByIdVariantIdentifier of(final Referencable<Product> product, final Integer variantId) {
        return of(product.toReference().getId(), variantId);
    }

    static ByIdVariantIdentifier of(final String productId, final Integer variantId) {
        return new VariantIdentifierImpl(productId, variantId, null);
    }
}
