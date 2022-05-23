
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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionProductAddedMessagePayloadBuilder
        implements Builder<ProductSelectionProductAddedMessagePayload> {

    private com.commercetools.api.models.product.ProductReference product;

    /**
     <*  <p>Reference to a Product.</p>>
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            Function<com.commercetools.api.models.product.ProductReferenceBuilder, com.commercetools.api.models.product.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.api.models.product.ProductReferenceBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Reference to a Product.</p>>
     */

    public ProductSelectionProductAddedMessagePayloadBuilder product(
            final com.commercetools.api.models.product.ProductReference product) {
        this.product = product;
        return this;
    }

    public com.commercetools.api.models.product.ProductReference getProduct() {
        return this.product;
    }

    public ProductSelectionProductAddedMessagePayload build() {
        Objects.requireNonNull(product, ProductSelectionProductAddedMessagePayload.class + ": product is missing");
        return new ProductSelectionProductAddedMessagePayloadImpl(product);
    }

    /**
     * builds ProductSelectionProductAddedMessagePayload without checking for non null required values
     */
    public ProductSelectionProductAddedMessagePayload buildUnchecked() {
        return new ProductSelectionProductAddedMessagePayloadImpl(product);
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder of() {
        return new ProductSelectionProductAddedMessagePayloadBuilder();
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadBuilder builder = new ProductSelectionProductAddedMessagePayloadBuilder();
        builder.product = template.getProduct();
        return builder;
    }

}
