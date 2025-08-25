
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductAddedMessagePayload productSelectionProductAddedMessagePayload = ProductSelectionProductAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductAddedMessagePayloadBuilder
        implements Builder<ProductSelectionProductAddedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    private com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAddProductAction" rel="nofollow">Add Product</a> update action.</p>
     * @param variantSelection value to be set
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder variantSelection(
            final com.commercetools.api.models.product_selection.ProductVariantSelection variantSelection) {
        this.variantSelection = variantSelection;
        return this;
    }

    /**
     *  <p>Product Variant Selection after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAddProductAction" rel="nofollow">Add Product</a> update action.</p>
     * @param builder function to build the variantSelection value
     * @return Builder
     */

    public ProductSelectionProductAddedMessagePayloadBuilder variantSelection(
            Function<com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder, Builder<? extends com.commercetools.api.models.product_selection.ProductVariantSelection>> builder) {
        this.variantSelection = builder
                .apply(com.commercetools.api.models.product_selection.ProductVariantSelectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a>.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     *  <p>Product Variant Selection after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelectionAddProductAction" rel="nofollow">Add Product</a> update action.</p>
     * @return variantSelection
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelection getVariantSelection() {
        return this.variantSelection;
    }

    /**
     * builds ProductSelectionProductAddedMessagePayload with checking for non-null required values
     * @return ProductSelectionProductAddedMessagePayload
     */
    public ProductSelectionProductAddedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductAddedMessagePayload.class + ": product is missing");
        Objects.requireNonNull(variantSelection,
            ProductSelectionProductAddedMessagePayload.class + ": variantSelection is missing");
        return new ProductSelectionProductAddedMessagePayloadImpl(product, variantSelection);
    }

    /**
     * builds ProductSelectionProductAddedMessagePayload without checking for non-null required values
     * @return ProductSelectionProductAddedMessagePayload
     */
    public ProductSelectionProductAddedMessagePayload buildUnchecked() {
        return new ProductSelectionProductAddedMessagePayloadImpl(product, variantSelection);
    }

    /**
     * factory method for an instance of ProductSelectionProductAddedMessagePayloadBuilder
     * @return builder
     */
    public static ProductSelectionProductAddedMessagePayloadBuilder of() {
        return new ProductSelectionProductAddedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionProductAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductAddedMessagePayloadBuilder of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadBuilder builder = new ProductSelectionProductAddedMessagePayloadBuilder();
        builder.product = template.getProduct();
        builder.variantSelection = template.getVariantSelection();
        return builder;
    }

}
