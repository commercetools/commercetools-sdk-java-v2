
package com.commercetools.api.models.product_type;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_type.ProductType obj;

    public ProductTypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductTypeReferenceBuilder obj(@Nullable final com.commercetools.api.models.product_type.ProductType obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.product_type.ProductType getObj() {
        return this.obj;
    }

    public ProductTypeReference build() {
        return new ProductTypeReferenceImpl(id, obj);
    }

    public static ProductTypeReferenceBuilder of() {
        return new ProductTypeReferenceBuilder();
    }

    public static ProductTypeReferenceBuilder of(final ProductTypeReference template) {
        ProductTypeReferenceBuilder builder = new ProductTypeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
