
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
 * DiscountedLineItemPriceForQuantity
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceForQuantityImpl implements DiscountedLineItemPriceForQuantity, ModelBase {

    private Long quantity;

    private com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPriceForQuantityImpl(@JsonProperty("quantity") final Long quantity,
            @JsonProperty("discountedPrice") final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.quantity = quantity;
        this.discountedPrice = discountedPrice;
    }

    /**
     * create empty instance
     */
    public DiscountedLineItemPriceForQuantityImpl() {
    }

    /**
     *  <p>Number of Line Items or Custom Line Items in the Cart.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Discounted price of the Line Item or Custom Line Item.</p>
     */

    public com.commercetools.api.models.cart.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setDiscountedPrice(final com.commercetools.api.models.cart.DiscountedLineItemPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPriceForQuantityImpl that = (DiscountedLineItemPriceForQuantityImpl) o;

        return new EqualsBuilder().append(quantity, that.quantity)
                .append(discountedPrice, that.discountedPrice)
                .append(quantity, that.quantity)
                .append(discountedPrice, that.discountedPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(quantity).append(discountedPrice).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("quantity", quantity)
                .append("discountedPrice", discountedPrice)
                .build();
    }

}
