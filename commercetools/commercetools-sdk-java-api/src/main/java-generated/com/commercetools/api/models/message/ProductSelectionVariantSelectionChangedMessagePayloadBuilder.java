
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionVariantSelectionChangedMessagePayloadBuilder
        implements Builder<ProductSelectionVariantSelectionChangedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection;

    @Nullable
    private com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection;

    /**
     *  <p>Reference to a Product.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Product.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>The former Product Variant Selection if any.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder oldVariantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection oldVariantSelection) {
        this.oldVariantSelection = oldVariantSelection;
        return this;
    }

    /**
     *  <p>The former Product Variant Selection if any.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder oldVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.oldVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The updated Product Variant Selection if any.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder newVariantSelection(
            @Nullable final com.commercetools.api.models.product_selection.ProductVariantSelection newVariantSelection) {
        this.newVariantSelection = newVariantSelection;
        return this;
    }

    /**
     *  <p>The updated Product Variant Selection if any.</p>
     */

    public ProductSelectionVariantSelectionChangedMessagePayloadBuilder newVariantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.newVariantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getOldVariantSelection() {
        return this.oldVariantSelection;
    }

    @Nullable
    public com.commercetools.api.models.product_selection.ProductVariantSelection getNewVariantSelection() {
        return this.newVariantSelection;
    }

    public ProductSelectionVariantSelectionChangedMessagePayload build() {
        Objects.requireNonNull(product,
            ProductSelectionVariantSelectionChangedMessagePayload.class + ": product is missing");
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl(product, oldVariantSelection,
            newVariantSelection);
    }

    /**
     * builds ProductSelectionVariantSelectionChangedMessagePayload without checking for non null required values
     */
    public ProductSelectionVariantSelectionChangedMessagePayload buildUnchecked() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl(product, oldVariantSelection,
            newVariantSelection);
    }

    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder of() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadBuilder();
    }

    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder of(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder = new ProductSelectionVariantSelectionChangedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.oldVariantSelection = template.getOldVariantSelection();
        builder.newVariantSelection = template.getNewVariantSelection();
        return builder;
    }

}
