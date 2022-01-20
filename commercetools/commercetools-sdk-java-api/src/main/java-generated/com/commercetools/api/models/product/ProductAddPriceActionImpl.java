
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductAddPriceActionImpl implements ProductAddPriceAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private com.commercetools.api.models.common.PriceDraft price;

    private Boolean staged;

    @JsonCreator
    ProductAddPriceActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.price = price;
        this.staged = staged;
        this.action = ADD_PRICE;
    }

    public ProductAddPriceActionImpl() {
        this.action = ADD_PRICE;
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

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
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

    public void setPrice(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
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

        ProductAddPriceActionImpl that = (ProductAddPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(price)
                .append(staged)
                .toHashCode();
    }

}
