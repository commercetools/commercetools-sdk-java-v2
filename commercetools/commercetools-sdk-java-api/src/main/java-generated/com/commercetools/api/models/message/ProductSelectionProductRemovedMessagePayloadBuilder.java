
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionProductRemovedMessagePayloadBuilder
        implements Builder<ProductSelectionProductRemovedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    public ProductSelectionProductRemovedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    public ProductSelectionProductRemovedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public ProductSelectionProductRemovedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductRemovedMessagePayload.class + ": product is missing");
        return new ProductSelectionProductRemovedMessagePayloadImpl(product);
    }

    /**
     * builds ProductSelectionProductRemovedMessagePayload without checking for non null required values
     */
    public ProductSelectionProductRemovedMessagePayload buildUnchecked() {
        return new ProductSelectionProductRemovedMessagePayloadImpl(product);
    }

    public static ProductSelectionProductRemovedMessagePayloadBuilder of() {
        return new ProductSelectionProductRemovedMessagePayloadBuilder();
    }

    public static ProductSelectionProductRemovedMessagePayloadBuilder of(
            final ProductSelectionProductRemovedMessagePayload template) {
        ProductSelectionProductRemovedMessagePayloadBuilder builder = new ProductSelectionProductRemovedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
