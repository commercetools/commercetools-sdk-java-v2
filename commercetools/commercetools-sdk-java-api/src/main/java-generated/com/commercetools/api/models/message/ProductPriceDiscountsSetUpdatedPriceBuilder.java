
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceDiscountsSetUpdatedPriceBuilder
        implements Builder<ProductPriceDiscountsSetUpdatedPrice> {

    private Integer variantId;

    @Nullable
    private String variantKey;

    @Nullable
    private String sku;

    private String priceId;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public ProductPriceDiscountsSetUpdatedPriceBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getVariantKey() {
        return this.variantKey;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public ProductPriceDiscountsSetUpdatedPrice build() {
        Objects.requireNonNull(variantId, ProductPriceDiscountsSetUpdatedPrice.class + ": variantId is missing");
        Objects.requireNonNull(priceId, ProductPriceDiscountsSetUpdatedPrice.class + ": priceId is missing");
        Objects.requireNonNull(staged, ProductPriceDiscountsSetUpdatedPrice.class + ": staged is missing");
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    /**
     * builds ProductPriceDiscountsSetUpdatedPrice without checking for non null required values
     */
    public ProductPriceDiscountsSetUpdatedPrice buildUnchecked() {
        return new ProductPriceDiscountsSetUpdatedPriceImpl(variantId, variantKey, sku, priceId, discounted, staged);
    }

    public static ProductPriceDiscountsSetUpdatedPriceBuilder of() {
        return new ProductPriceDiscountsSetUpdatedPriceBuilder();
    }

    public static ProductPriceDiscountsSetUpdatedPriceBuilder of(final ProductPriceDiscountsSetUpdatedPrice template) {
        ProductPriceDiscountsSetUpdatedPriceBuilder builder = new ProductPriceDiscountsSetUpdatedPriceBuilder();
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
