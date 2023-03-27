
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionRemoveProductActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionRemoveProductAction productSelectionRemoveProductAction = ProductSelectionRemoveProductAction.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionRemoveProductActionBuilder implements Builder<ProductSelectionRemoveProductAction> {

    private com.commercetools.api.models.product.ProductResourceIdentifier product;

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionRemoveProductActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionRemoveProductActionBuilder product(
            final com.commercetools.api.models.product.ProductResourceIdentifier product) {
        this.product = product;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of the Product</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductResourceIdentifier getProduct() {
        return this.product;
    }

    /**
     * builds ProductSelectionRemoveProductAction with checking for non-null required values
     * @return ProductSelectionRemoveProductAction
     */
    public ProductSelectionRemoveProductAction build() {
        Objects.requireNonNull(product, ProductSelectionRemoveProductAction.class + ": product is missing");
        return new ProductSelectionRemoveProductActionImpl(product);
    }

    /**
     * builds ProductSelectionRemoveProductAction without checking for non-null required values
     * @return ProductSelectionRemoveProductAction
     */
    public ProductSelectionRemoveProductAction buildUnchecked() {
        return new ProductSelectionRemoveProductActionImpl(product);
    }

    /**
     * factory method for an instance of ProductSelectionRemoveProductActionBuilder
     * @return builder
     */
    public static ProductSelectionRemoveProductActionBuilder of() {
        return new ProductSelectionRemoveProductActionBuilder();
    }

    /**
     * create builder for ProductSelectionRemoveProductAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionRemoveProductActionBuilder of(final ProductSelectionRemoveProductAction template) {
        ProductSelectionRemoveProductActionBuilder builder = new ProductSelectionRemoveProductActionBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
