
package com.commercetools.api.models.product;

public interface BySkuVariantIdentifier extends VariantIdentifier {
    String getSku();

    static BySkuVariantIdentifier of(final String sku) {
        return new VariantIdentifierImpl(null, null, sku);
    }
}
