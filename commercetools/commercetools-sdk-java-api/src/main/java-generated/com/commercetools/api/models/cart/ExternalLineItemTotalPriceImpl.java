
package com.commercetools.api.models.cart;

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
public class ExternalLineItemTotalPriceImpl implements ExternalLineItemTotalPrice, ModelBase {

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.common.Money totalPrice;

    @JsonCreator
    ExternalLineItemTotalPriceImpl(@JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice) {
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public ExternalLineItemTotalPriceImpl() {
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    public com.commercetools.api.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    public void setPrice(final com.commercetools.api.models.common.Money price) {
        this.price = price;
    }

    public void setTotalPrice(final com.commercetools.api.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ExternalLineItemTotalPriceImpl that = (ExternalLineItemTotalPriceImpl) o;

        return new EqualsBuilder().append(price, that.price).append(totalPrice, that.totalPrice).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price).append(totalPrice).toHashCode();
    }

}
