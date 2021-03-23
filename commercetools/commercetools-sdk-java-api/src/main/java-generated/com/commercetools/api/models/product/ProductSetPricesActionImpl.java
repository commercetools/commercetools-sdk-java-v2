
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetPricesActionImpl implements ProductSetPricesAction {

    private String action;

    private Long variantId;

    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    private Boolean staged;

    @JsonCreator
    ProductSetPricesActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.prices = prices;
        this.staged = staged;
        this.action = SET_PRICES;
    }

    public ProductSetPricesActionImpl() {
        this.action = SET_PRICES;
    }

    public String getAction() {
        return this.action;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public String getSku() {
        return this.sku;
    }

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPrices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
    }

    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
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

        ProductSetPricesActionImpl that = (ProductSetPricesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(prices, that.prices)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(prices)
                .append(staged)
                .toHashCode();
    }

}
