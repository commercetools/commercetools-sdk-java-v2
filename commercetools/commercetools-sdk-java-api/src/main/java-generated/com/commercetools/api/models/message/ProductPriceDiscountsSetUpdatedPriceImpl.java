
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductPriceDiscountsSetUpdatedPriceImpl implements ProductPriceDiscountsSetUpdatedPrice {

    private Integer variantId;

    private String variantKey;

    private String sku;

    private String priceId;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    @JsonCreator
    ProductPriceDiscountsSetUpdatedPriceImpl(@JsonProperty("variantId") final Integer variantId,
            @JsonProperty("variantKey") final String variantKey, @JsonProperty("sku") final String sku,
            @JsonProperty("priceId") final String priceId,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.variantKey = variantKey;
        this.sku = sku;
        this.priceId = priceId;
        this.discounted = discounted;
        this.staged = staged;
    }

    public ProductPriceDiscountsSetUpdatedPriceImpl() {
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public String getVariantKey() {
        return this.variantKey;
    }

    public String getSku() {
        return this.sku;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setVariantKey(final String variantKey) {
        this.variantKey = variantKey;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceDiscountsSetUpdatedPriceImpl that = (ProductPriceDiscountsSetUpdatedPriceImpl) o;

        return new EqualsBuilder().append(variantId, that.variantId).append(variantKey, that.variantKey).append(sku,
            that.sku).append(priceId, that.priceId).append(discounted, that.discounted).append(staged,
                that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(variantId).append(variantKey).append(sku).append(priceId).append(
            discounted).append(staged).toHashCode();
    }

}
