
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantKeyReferenceBuilder implements Builder<ProductVariantKeyReference> {

    private String key;

    public ProductVariantKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductVariantKeyReference build() {
        Objects.requireNonNull(key, ProductVariantKeyReference.class + ": key is missing");
        return new ProductVariantKeyReferenceImpl(key);
    }

    /**
     * builds ProductVariantKeyReference without checking for non null required values
     */
    public ProductVariantKeyReference buildUnchecked() {
        return new ProductVariantKeyReferenceImpl(key);
    }

    public static ProductVariantKeyReferenceBuilder of() {
        return new ProductVariantKeyReferenceBuilder();
    }

    public static ProductVariantKeyReferenceBuilder of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceBuilder builder = new ProductVariantKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
