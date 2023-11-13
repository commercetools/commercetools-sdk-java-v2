
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ExternalLineItemTotalPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalLineItemTotalPriceImpl implements ExternalLineItemTotalPrice, ModelBase {

    private com.commercetools.api.models.common.Money price;

    private com.commercetools.api.models.common.Money totalPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ExternalLineItemTotalPriceImpl(@JsonProperty("price") final com.commercetools.api.models.common.Money price,
            @JsonProperty("totalPrice") final com.commercetools.api.models.common.Money totalPrice) {
        this.price = price;
        this.totalPrice = totalPrice;
    }

    /**
     * create empty instance
     */
    public ExternalLineItemTotalPriceImpl() {
    }

    /**
     *  <p>Price of the Line Item.</p>
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Total price of the Line Item.</p>
     */

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

        return new EqualsBuilder().append(price, that.price)
                .append(totalPrice, that.totalPrice)
                .append(price, that.price)
                .append(totalPrice, that.totalPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(price).append(totalPrice).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("price", price)
                .append("totalPrice", totalPrice)
                .build();
    }

}
