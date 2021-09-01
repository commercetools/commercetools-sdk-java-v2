
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountKeyReferenceBuilder implements Builder<ProductDiscountKeyReference> {

    private String key;

    public ProductDiscountKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductDiscountKeyReference build() {
        Objects.requireNonNull(key, ProductDiscountKeyReference.class + ": key is missing");
        return new ProductDiscountKeyReferenceImpl(key);
    }

    /**
     * builds ProductDiscountKeyReference without checking for non null required values
     */
    public ProductDiscountKeyReference buildUnchecked() {
        return new ProductDiscountKeyReferenceImpl(key);
    }

    public static ProductDiscountKeyReferenceBuilder of() {
        return new ProductDiscountKeyReferenceBuilder();
    }

    public static ProductDiscountKeyReferenceBuilder of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceBuilder builder = new ProductDiscountKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
