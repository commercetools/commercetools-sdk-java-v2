
package com.commercetools.ml.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeReferenceBuilder {

    private String id;

    public ProductTypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ProductTypeReference build() {
        return new ProductTypeReferenceImpl(id);
    }

    public static ProductTypeReferenceBuilder of() {
        return new ProductTypeReferenceBuilder();
    }

    public static ProductTypeReferenceBuilder of(final ProductTypeReference template) {
        ProductTypeReferenceBuilder builder = new ProductTypeReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
