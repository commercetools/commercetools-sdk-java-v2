
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeKeyReferenceBuilder implements Builder<ProductTypeKeyReference> {

    private String key;

    public ProductTypeKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductTypeKeyReference build() {
        Objects.requireNonNull(key, ProductTypeKeyReference.class + ": key is missing");
        return new ProductTypeKeyReferenceImpl(key);
    }

    /**
     * builds ProductTypeKeyReference without checking for non null required values
     */
    public ProductTypeKeyReference buildUnchecked() {
        return new ProductTypeKeyReferenceImpl(key);
    }

    public static ProductTypeKeyReferenceBuilder of() {
        return new ProductTypeKeyReferenceBuilder();
    }

    public static ProductTypeKeyReferenceBuilder of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceBuilder builder = new ProductTypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
