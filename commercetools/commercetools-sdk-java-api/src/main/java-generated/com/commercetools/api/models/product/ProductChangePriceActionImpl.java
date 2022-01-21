
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
public class ProductChangePriceActionImpl implements ProductChangePriceAction, ModelBase {

    private String action;

    private String priceId;

    private com.commercetools.api.models.common.PriceDraft price;

    private Boolean staged;

    @JsonCreator
    ProductChangePriceActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.price = price;
        this.staged = staged;
        this.action = CHANGE_PRICE;
    }

    public ProductChangePriceActionImpl() {
        this.action = CHANGE_PRICE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>ID of the <a href="#price">Price</a></p>
    */
    public String getPriceId() {
        return this.priceId;
    }

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
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

        ProductChangePriceActionImpl that = (ProductChangePriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceId).append(price).append(staged).toHashCode();
    }

}
