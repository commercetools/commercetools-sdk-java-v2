
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductReferenceBuilder {

    private String id;

    public ProductReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ProductReference build() {
        return new ProductReferenceImpl(id);
    }

    public static ProductReferenceBuilder of() {
        return new ProductReferenceBuilder();
    }

    public static ProductReferenceBuilder of(final ProductReference template) {
        ProductReferenceBuilder builder = new ProductReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
