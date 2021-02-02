
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantAddedMessagePayloadBuilder {

    private com.commercetools.api.models.product.ProductVariant variant;

    private Boolean staged;

    public ProductVariantAddedMessagePayloadBuilder variant(
            final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    public ProductVariantAddedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductVariantAddedMessagePayload build() {
        return new ProductVariantAddedMessagePayloadImpl(variant, staged);
    }

    public static ProductVariantAddedMessagePayloadBuilder of() {
        return new ProductVariantAddedMessagePayloadBuilder();
    }

    public static ProductVariantAddedMessagePayloadBuilder of(final ProductVariantAddedMessagePayload template) {
        ProductVariantAddedMessagePayloadBuilder builder = new ProductVariantAddedMessagePayloadBuilder();
        builder.variant = template.getVariant();
        builder.staged = template.getStaged();
        return builder;
    }

}
