
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionCreatedMessagePayloadBuilder implements Builder<ProductSelectionCreatedMessagePayload> {

    private com.commercetools.api.models.product_selection.ProductSelectionType productSelection;

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionType productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionTypeBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductSelectionType>> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionTypeBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionType getProductSelection() {
        return this.productSelection;
    }

    public ProductSelectionCreatedMessagePayload build() {
        Objects.requireNonNull(productSelection,
            ProductSelectionCreatedMessagePayload.class + ": productSelection is missing");
        return new ProductSelectionCreatedMessagePayloadImpl(productSelection);
    }

    /**
     * builds ProductSelectionCreatedMessagePayload without checking for non null required values
     */
    public ProductSelectionCreatedMessagePayload buildUnchecked() {
        return new ProductSelectionCreatedMessagePayloadImpl(productSelection);
    }

    public static ProductSelectionCreatedMessagePayloadBuilder of() {
        return new ProductSelectionCreatedMessagePayloadBuilder();
    }

    public static ProductSelectionCreatedMessagePayloadBuilder of(
            final ProductSelectionCreatedMessagePayload template) {
        ProductSelectionCreatedMessagePayloadBuilder builder = new ProductSelectionCreatedMessagePayloadBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
