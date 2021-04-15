
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantDeletedMessagePayloadBuilder {

    private com.commercetools.api.models.product.ProductVariant variant;

    private java.util.List<String> removedImageUrls;

    public ProductVariantDeletedMessagePayloadBuilder variant(
            final com.commercetools.api.models.product.ProductVariant variant) {
        this.variant = variant;
        return this;
    }

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    public ProductVariantDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    public com.commercetools.api.models.product.ProductVariant getVariant() {
        return this.variant;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public ProductVariantDeletedMessagePayload build() {
        return new ProductVariantDeletedMessagePayloadImpl(variant, removedImageUrls);
    }

    public static ProductVariantDeletedMessagePayloadBuilder of() {
        return new ProductVariantDeletedMessagePayloadBuilder();
    }

    public static ProductVariantDeletedMessagePayloadBuilder of(final ProductVariantDeletedMessagePayload template) {
        ProductVariantDeletedMessagePayloadBuilder builder = new ProductVariantDeletedMessagePayloadBuilder();
        builder.variant = template.getVariant();
        builder.removedImageUrls = template.getRemovedImageUrls();
        return builder;
    }

}
