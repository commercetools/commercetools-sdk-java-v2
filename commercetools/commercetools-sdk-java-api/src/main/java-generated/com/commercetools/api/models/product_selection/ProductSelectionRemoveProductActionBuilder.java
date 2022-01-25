
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionRemoveProductActionBuilder implements Builder<ProductSelectionRemoveProductAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    public ProductSelectionRemoveProductActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public ProductSelectionRemoveProductActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    public ProductSelectionRemoveProductAction build() {
        Objects.requireNonNull(product, ProductSelectionRemoveProductAction.class + ": product is missing");
        return new ProductSelectionRemoveProductActionImpl(product);
    }

    /**
     * builds ProductSelectionRemoveProductAction without checking for non null required values
     */
    public ProductSelectionRemoveProductAction buildUnchecked() {
        return new ProductSelectionRemoveProductActionImpl(product);
    }

    public static ProductSelectionRemoveProductActionBuilder of() {
        return new ProductSelectionRemoveProductActionBuilder();
    }

    public static ProductSelectionRemoveProductActionBuilder of(final ProductSelectionRemoveProductAction template) {
        ProductSelectionRemoveProductActionBuilder builder = new ProductSelectionRemoveProductActionBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
