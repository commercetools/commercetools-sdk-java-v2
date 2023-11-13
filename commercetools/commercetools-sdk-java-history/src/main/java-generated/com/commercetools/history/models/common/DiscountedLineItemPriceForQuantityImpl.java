
package com.commercetools.history.models.common;

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

    private Integer quantity;

    private com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPriceForQuantityImpl(@JsonProperty("quantity") final Integer quantity,
            @JsonProperty("discountedPrice") final com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice) {
        this.quantity = quantity;
        this.discountedPrice = discountedPrice;
    }

    /**
     * create empty instance
     */
    public DiscountedLineItemPriceForQuantityImpl() {
    }

    /**
     *
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.DiscountedLineItemPrice getDiscountedPrice() {
        return this.discountedPrice;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setDiscountedPrice(
            final com.commercetools.history.models.common.DiscountedLineItemPrice discountedPrice) {
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
