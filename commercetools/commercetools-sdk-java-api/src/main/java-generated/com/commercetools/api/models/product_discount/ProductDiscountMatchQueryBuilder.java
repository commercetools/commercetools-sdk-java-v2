
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountMatchQueryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountMatchQuery productDiscountMatchQuery = ProductDiscountMatchQuery.builder()
 *             .productId("{productId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountMatchQueryBuilder implements Builder<ProductDiscountMatchQuery> {

    private String productId;

    private Integer variantId;

    private Boolean staged;

    private com.commercetools.api.models.common.QueryPrice price;

    /**
     *  <p>ID of the specified Product.</p>
     */

    public ProductDiscountMatchQueryBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    /**
     *  <p>ID of the specified Product Variant.</p>
     */

    public ProductDiscountMatchQueryBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Controls which projected representation is applied for the query. Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
     */

    public ProductDiscountMatchQueryBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     */

    public ProductDiscountMatchQueryBuilder price(
            Function<com.commercetools.api.models.common.QueryPriceBuilder, com.commercetools.api.models.common.QueryPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.QueryPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     */

    public ProductDiscountMatchQueryBuilder price(final com.commercetools.api.models.common.QueryPrice price) {
        this.price = price;
        return this;
    }

    public String getProductId() {
        return this.productId;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public com.commercetools.api.models.common.QueryPrice getPrice() {
        return this.price;
    }

    public ProductDiscountMatchQuery build() {
        Objects.requireNonNull(productId, ProductDiscountMatchQuery.class + ": productId is missing");
        Objects.requireNonNull(variantId, ProductDiscountMatchQuery.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductDiscountMatchQuery.class + ": staged is missing");
        Objects.requireNonNull(price, ProductDiscountMatchQuery.class + ": price is missing");
        return new ProductDiscountMatchQueryImpl(productId, variantId, staged, price);
    }

    /**
     * builds ProductDiscountMatchQuery without checking for non null required values
     */
    public ProductDiscountMatchQuery buildUnchecked() {
        return new ProductDiscountMatchQueryImpl(productId, variantId, staged, price);
    }

    public static ProductDiscountMatchQueryBuilder of() {
        return new ProductDiscountMatchQueryBuilder();
    }

    public static ProductDiscountMatchQueryBuilder of(final ProductDiscountMatchQuery template) {
        ProductDiscountMatchQueryBuilder builder = new ProductDiscountMatchQueryBuilder();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.price = template.getPrice();
        return builder;
    }

}
