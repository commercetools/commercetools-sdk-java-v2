
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountMatchQueryBuilder implements Builder<ProductDiscountMatchQuery> {

    private String productId;

    private Integer variantId;

    private Boolean staged;

    private com.commercetools.api.models.common.QueryPrice price;

    public ProductDiscountMatchQueryBuilder productId(final String productId) {
        this.productId = productId;
        return this;
    }

    public ProductDiscountMatchQueryBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductDiscountMatchQueryBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductDiscountMatchQueryBuilder price(
            Function<com.commercetools.api.models.common.QueryPriceBuilder, com.commercetools.api.models.common.QueryPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.QueryPriceBuilder.of()).build();
        return this;
    }

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
