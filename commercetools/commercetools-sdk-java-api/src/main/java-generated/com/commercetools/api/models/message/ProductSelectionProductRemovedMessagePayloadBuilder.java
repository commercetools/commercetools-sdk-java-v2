
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionProductRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductRemovedMessagePayload productSelectionProductRemovedMessagePayload = ProductSelectionProductRemovedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductRemovedMessagePayloadBuilder
        implements Builder<ProductSelectionProductRemovedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was removed from the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionProductRemovedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was removed from the Product Selection.</p>
     * @param builder function to build the product value
     * @return Builder
     */

    public ProductSelectionProductRemovedMessagePayloadBuilder withProduct(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReference> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was removed from the Product Selection.</p>
     * @param product value to be set
     * @return Builder
     */

    public ProductSelectionProductRemovedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that was removed from the Product Selection.</p>
     * @return product
     */

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    /**
     * builds ProductSelectionProductRemovedMessagePayload with checking for non-null required values
     * @return ProductSelectionProductRemovedMessagePayload
     */
    public ProductSelectionProductRemovedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductRemovedMessagePayload.class + ": product is missing");
        return new ProductSelectionProductRemovedMessagePayloadImpl(product);
    }

    /**
     * builds ProductSelectionProductRemovedMessagePayload without checking for non-null required values
     * @return ProductSelectionProductRemovedMessagePayload
     */
    public ProductSelectionProductRemovedMessagePayload buildUnchecked() {
        return new ProductSelectionProductRemovedMessagePayloadImpl(product);
    }

    /**
     * factory method for an instance of ProductSelectionProductRemovedMessagePayloadBuilder
     * @return builder
     */
    public static ProductSelectionProductRemovedMessagePayloadBuilder of() {
        return new ProductSelectionProductRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for ProductSelectionProductRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductRemovedMessagePayloadBuilder of(
            final ProductSelectionProductRemovedMessagePayload template) {
        ProductSelectionProductRemovedMessagePayloadBuilder builder = new ProductSelectionProductRemovedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
