
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionCreatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionCreatedMessagePayload productSelectionCreatedMessagePayload = ProductSelectionCreatedMessagePayload.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionCreatedMessagePayloadBuilder implements Builder<ProductSelectionCreatedMessagePayload> {

    private com.commercetools.api.models.product_selection.IndividualProductSelectionType productSelection;

    /**
     *  <p>The <code>type</code> and <code>name</code> of the individual Product Selection.</p>
     */

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder, com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.IndividualProductSelectionTypeBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The <code>type</code> and <code>name</code> of the individual Product Selection.</p>
     */

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            final com.commercetools.api.models.product_selection.IndividualProductSelectionType productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    public com.commercetools.api.models.product_selection.IndividualProductSelectionType getProductSelection() {
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
