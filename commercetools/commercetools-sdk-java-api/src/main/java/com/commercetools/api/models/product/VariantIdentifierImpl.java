
package com.commercetools.api.models.product;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.vrap.rmf.base.client.ModelBase;

final class VariantIdentifierImpl implements ByIdVariantIdentifier, BySkuVariantIdentifier, ModelBase {
    @Nullable
    private final String productId;
    @Nullable
    private final Long variantId;
    @Nullable
    private final String sku;

    @JsonCreator
    VariantIdentifierImpl(@Nullable final String productId, @Nullable final Long variantId,
            @Nullable final String sku) {
        this.productId = productId;
        this.variantId = variantId;
        this.sku = sku;
    }

    @Nullable
    @Override
    public String getProductId() {
        return productId;
    }

    @Nullable
    @Override
    public Long getVariantId() {
        return variantId;
    }

    @Override
    @Nullable
    public String getSku() {
        return sku;
    }
}
