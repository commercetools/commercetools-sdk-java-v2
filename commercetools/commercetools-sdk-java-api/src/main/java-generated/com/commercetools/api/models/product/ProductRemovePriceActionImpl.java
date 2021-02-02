
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
public final class ProductRemovePriceActionImpl implements ProductRemovePriceAction {

    private String action;

    private String priceId;

    private Boolean staged;

    @JsonCreator
    ProductRemovePriceActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.staged = staged;
        this.action = REMOVE_PRICE;
    }

    public ProductRemovePriceActionImpl() {
        this.action = REMOVE_PRICE;
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

    public Boolean getStaged() {
        return this.staged;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
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

        ProductRemovePriceActionImpl that = (ProductRemovePriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(priceId, that.priceId).append(staged,
            that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceId).append(staged).toHashCode();
    }

}
