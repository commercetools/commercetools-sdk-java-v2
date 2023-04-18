
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

    private com.commercetools.api.models.product_selection.ProductSelection productSelection;

    /**
     *  <p>Product Selection that was created.</p>
     * @param builder function to build the productSelection value
     * @return Builder
     */

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            Function<com.commercetools.api.models.product_selection.ProductSelectionBuilder, com.commercetools.api.models.product_selection.ProductSelectionBuilder> builder) {
        this.productSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Selection that was created.</p>
     * @param productSelection value to be set
     * @return Builder
     */

    public ProductSelectionCreatedMessagePayloadBuilder productSelection(
            final com.commercetools.api.models.product_selection.ProductSelection productSelection) {
        this.productSelection = productSelection;
        return this;
    }

    /**
     *  <p>Product Selection that was created.</p>
     * @return productSelection
     */

    public com.commercetools.api.models.product_selection.ProductSelection getProductSelection() {
        return this.productSelection;
    }

    /**
     * builds ProductSelectionCreatedMessagePayload with checking for non-null required values
     * @return ProductSelectionCreatedMessagePayload
     */
    public ProductSelectionCreatedMessagePayload build() {
        Objects.requireNonNull(productSelection,
            ProductSelectionCreatedMessagePayload.class + ": productSelection is missing");
        return new ProductSelectionCreatedMessagePayloadImpl(productSelection);
    }

    /**
     * builds ProductSelectionCreatedMessagePayload without checking for non-null required values
     * @return ProductSelectionCreatedMessagePayload
     */
    public ProductSelectionCreatedMessagePayload buildUnchecked() {
        return new ProductSelectionCreatedMessagePayloadImpl(productSelection);
    }

    /**
     * factory method for an instance of ProductSelectionCreatedMessagePayloadBuilder
     * @return builder
     */
    public static ProductSelectionCreatedMessagePayloadBuilder of() {
        return new ProductSelectionCreatedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionCreatedMessagePayloadBuilder of(
            final ProductSelectionCreatedMessagePayload template) {
        ProductSelectionCreatedMessagePayloadBuilder builder = new ProductSelectionCreatedMessagePayloadBuilder();
        builder.productSelection = template.getProductSelection();
        return builder;
    }

}
