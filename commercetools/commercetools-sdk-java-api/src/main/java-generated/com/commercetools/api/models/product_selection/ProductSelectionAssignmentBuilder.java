
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionAssignmentBuilder implements Builder<ProductSelectionAssignment> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductSelectionReference productSelection;

    public ProductSelectionAssignmentBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    public ProductSelectionAssignmentBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public ProductSelectionAssignmentBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder, com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductSelectionAssignmentBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelectionReference productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.api.models.product_selection.ProductSelectionReference getProductSelection() {
        return this.productSelection;
    }

    public ProductSelectionAssignment build() {
        Objects.requireNonNull(product, ProductSelectionAssignment.class + ": product is missing");
        Objects.requireNonNull(productSelection, ProductSelectionAssignment.class + ": productSelection is missing");
        return new ProductSelectionAssignmentImpl(product, productSelection);
    }

    /**
     * builds ProductSelectionAssignment without checking for non null required values
     */
    public ProductSelectionAssignment buildUnchecked() {
        return new ProductSelectionAssignmentImpl(product, productSelection);
    }

    public static ProductSelectionAssignmentBuilder of() {
        return new ProductSelectionAssignmentBuilder();
    }

    public static ProductSelectionAssignmentBuilder of(final ProductSelectionAssignment template) {
        ProductSelectionAssignmentBuilder builder = new ProductSelectionAssignmentBuilder();
        builder.product = template.getProduct();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
