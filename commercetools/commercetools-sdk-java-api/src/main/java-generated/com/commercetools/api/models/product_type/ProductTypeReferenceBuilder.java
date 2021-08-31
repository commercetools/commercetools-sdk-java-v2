
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeReferenceBuilder implements Builder<ProductTypeReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_type.ProductType obj;

    public ProductTypeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductTypeReferenceBuilder obj(
            Function<com.commercetools.api.models.product_type.ProductTypeBuilder, com.commercetools.api.models.product_type.ProductTypeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_type.ProductTypeBuilder.of()).build();
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
        Objects.requireNonNull(id, ProductTypeReference.class + ": id is missing");
        return new ProductTypeReferenceImpl(id, obj);
    }

    /**
     * builds ProductTypeReference without checking for non null required values
     */
    public ProductTypeReference buildUnchecked() {
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
