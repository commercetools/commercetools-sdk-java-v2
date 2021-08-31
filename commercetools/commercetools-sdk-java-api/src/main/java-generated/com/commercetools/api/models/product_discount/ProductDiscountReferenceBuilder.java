
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountReferenceBuilder implements Builder<ProductDiscountReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.product_discount.ProductDiscount obj;

    public ProductDiscountReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public ProductDiscountReferenceBuilder obj(
            Function<com.commercetools.api.models.product_discount.ProductDiscountBuilder, com.commercetools.api.models.product_discount.ProductDiscountBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.product_discount.ProductDiscountBuilder.of()).build();
        return this;
    }

    public ProductDiscountReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.product_discount.ProductDiscount obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.product_discount.ProductDiscount getObj() {
        return this.obj;
    }

    public ProductDiscountReference build() {
        Objects.requireNonNull(id, ProductDiscountReference.class + ": id is missing");
        return new ProductDiscountReferenceImpl(id, obj);
    }

    /**
     * builds ProductDiscountReference without checking for non null required values
     */
    public ProductDiscountReference buildUnchecked() {
        return new ProductDiscountReferenceImpl(id, obj);
    }

    public static ProductDiscountReferenceBuilder of() {
        return new ProductDiscountReferenceBuilder();
    }

    public static ProductDiscountReferenceBuilder of(final ProductDiscountReference template) {
        ProductDiscountReferenceBuilder builder = new ProductDiscountReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
