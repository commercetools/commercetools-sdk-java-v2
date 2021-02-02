
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.product.Product obj;

    public ProductReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductReferenceBuilder obj(@Nullable final com.commercetools.api.models.product.Product obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.product.Product getObj() {
        return this.obj;
    }

    public ProductReference build() {
        return new ProductReferenceImpl(id, obj);
    }

    public static ProductReferenceBuilder of() {
        return new ProductReferenceBuilder();
    }

    public static ProductReferenceBuilder of(final ProductReference template) {
        ProductReferenceBuilder builder = new ProductReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
