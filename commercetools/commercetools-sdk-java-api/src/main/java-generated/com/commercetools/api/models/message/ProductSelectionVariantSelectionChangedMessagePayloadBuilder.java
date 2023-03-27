
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionVariantSelectionChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantSelectionChangedMessagePayload productSelectionVariantSelectionChangedMessagePayload = ProductSelectionVariantSelectionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantSelection(oldVariantSelectionBuilder -> oldVariantSelectionBuilder)
 *             .newVariantSelection(newVariantSelectionBuilder -> newVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionVariantSelectionChangedMessagePayloadBuilder
        implements Builder<ProductSelectionVariantSelectionChangedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection;

    private com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection;

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     * @param oldVariantSelection value to be set
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder oldVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection) {
        this.oldVariantSelection = oldVariantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     * @param builder function to build the oldVariantSelection value
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder oldVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.oldVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     * @param newVariantSelection value to be set
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder newVariantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection) {
        this.newVariantSelection = newVariantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     * @param builder function to build the newVariantSelection value
     * @return Builder
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder newVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.newVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Product for which the Product Variant Selection changed.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Product Variant Selection before the Set Variant Selection update action.</p>
     * @return oldVariantSelection
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getOldVariantSelection() {
        return this.oldVariantSelection;
    }

    /**
     *  <p>Product Variant Selection after the Set Variant Selection update action.</p>
     * @return newVariantSelection
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getNewVariantSelection() {
        return this.newVariantSelection;
    }

    /**
     * builds ProductSelectionVariantSelectionChangedMessagePayload with checking for non-null required values
     * @return ProductSelectionVariantSelectionChangedMessagePayload
     */
    public ProductSelectionVariantSelectionChangedMessagePayload build() {
        Objects.requireNonNull(product,
            ProductSelectionVariantSelectionChangedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(oldVariantSelection,
            ProductSelectionVariantSelectionChangedMessagePayload.class + ": oldVariantSelection is missing");
        Objects.requireNonNull(newVariantSelection,
            ProductSelectionVariantSelectionChangedMessagePayload.class + ": newVariantSelection is missing");
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl(product, oldVariantSelection,
            newVariantSelection);
    }

    /**
     * builds ProductSelectionVariantSelectionChangedMessagePayload without checking for non-null required values
     * @return ProductSelectionVariantSelectionChangedMessagePayload
     */
    public ProductSelectionVariantSelectionChangedMessagePayload buildUnchecked() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl(product, oldVariantSelection,
            newVariantSelection);
    }

    /**
     * factory method for an instance of ProductSelectionVariantSelectionChangedMessagePayloadBuilder
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder of() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionVariantSelectionChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder of(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder = new ProductSelectionVariantSelectionChangedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.oldVariantSelection = template.getOldVariantSelection();
        builder.newVariantSelection = template.getNewVariantSelection();
        return builder;
    }

}
