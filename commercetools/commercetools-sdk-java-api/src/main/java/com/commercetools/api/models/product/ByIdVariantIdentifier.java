
package com.commercetools.api.models.product;

import com.commercetools.api.models.Referencable;

public interface ByIdVariantIdentifier extends VariantIdentifier {
    String getProductId();

    Long getVariantId();

    static ByIdVariantIdentifier of(final Referencable<Product> product, final Long variantId) {
        return of(product.toReference().getId(), variantId);
    }

    static ByIdVariantIdentifier of(final String productId, final Long variantId) {
        return new VariantIdentifierImpl(productId, variantId, null);
    }
}
