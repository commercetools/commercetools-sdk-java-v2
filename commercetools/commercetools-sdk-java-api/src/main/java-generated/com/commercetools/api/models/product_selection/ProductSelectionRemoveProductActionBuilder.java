
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
     <*  <p>ResourceIdentifier to Product</p>>
     */

    public ProductSelectionRemoveProductActionBuilder product(
            Function<com.commercetools.api.models.product.ProductResourceIdentifierBuilder, com.commercetools.api.models.product.ProductResourceIdentifierBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>ResourceIdentifier to Product</p>>
     */

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
