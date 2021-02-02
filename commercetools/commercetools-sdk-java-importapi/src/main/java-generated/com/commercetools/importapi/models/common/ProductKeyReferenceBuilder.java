
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductKeyReferenceBuilder {

    private String key;

    public ProductKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ProductKeyReference build() {
        return new ProductKeyReferenceImpl(key);
    }

    public static ProductKeyReferenceBuilder of() {
        return new ProductKeyReferenceBuilder();
    }

    public static ProductKeyReferenceBuilder of(final ProductKeyReference template) {
        ProductKeyReferenceBuilder builder = new ProductKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
