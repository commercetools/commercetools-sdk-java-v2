
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssignedProductReferenceBuilder implements Builder<AssignedProductReference> {

    private com.commercetools.api.models.product.ProductReference product;

    public AssignedProductReferenceBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    public AssignedProductReferenceBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public AssignedProductReference build() {
        Objects.requireNonNull(product, AssignedProductReference.class + ": product is missing");
        return new AssignedProductReferenceImpl(product);
    }

    /**
     * builds AssignedProductReference without checking for non null required values
     */
    public AssignedProductReference buildUnchecked() {
        return new AssignedProductReferenceImpl(product);
    }

    public static AssignedProductReferenceBuilder of() {
        return new AssignedProductReferenceBuilder();
    }

    public static AssignedProductReferenceBuilder of(final AssignedProductReference template) {
        AssignedProductReferenceBuilder builder = new AssignedProductReferenceBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
