
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceExternalDiscountSetMessagePayloadBuilder {

    private Integer variantId;

    @Nullable
    private String variantKey;

    @Nullable
    private String sku;

    private String priceId;

    @Nullable
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    public ProductPriceExternalDiscountSetMessagePayloadBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public ProductPriceExternalDiscountSetMessagePayloadBuilder variantKey(@Nullable final String variantKey) {
        this.variantKey = variantKey;
        return this;
    }

    public ProductPriceExternalDiscountSetMessagePayloadBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    public ProductPriceExternalDiscountSetMessagePayloadBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductPriceExternalDiscountSetMessagePayloadBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
        return this;
    }

    public ProductPriceExternalDiscountSetMessagePayloadBuilder staged(final Boolean staged) {
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

    public ProductPriceExternalDiscountSetMessagePayload build() {
        return new ProductPriceExternalDiscountSetMessagePayloadImpl(variantId, variantKey, sku, priceId, discounted,
            staged);
    }

    public static ProductPriceExternalDiscountSetMessagePayloadBuilder of() {
        return new ProductPriceExternalDiscountSetMessagePayloadBuilder();
    }

    public static ProductPriceExternalDiscountSetMessagePayloadBuilder of(
            final ProductPriceExternalDiscountSetMessagePayload template) {
        ProductPriceExternalDiscountSetMessagePayloadBuilder builder = new ProductPriceExternalDiscountSetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.variantKey = template.getVariantKey();
        builder.sku = template.getSku();
        builder.priceId = template.getPriceId();
        builder.discounted = template.getDiscounted();
        builder.staged = template.getStaged();
        return builder;
    }

}
