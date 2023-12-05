
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful recalculation of a Discount on a Custom Line Item.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemDiscountSetMessagePayloadImpl
        implements OrderCustomLineItemDiscountSetMessagePayload, ModelBase {

    private String type;

    private String customLineItemId;

    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderCustomLineItemDiscountSetMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.discountedPricePerQuantity = discountedPricePerQuantity;
        this.taxedPrice = taxedPrice;
        this.type = ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET;
    }

    /**
     * create empty instance
     */
    public OrderCustomLineItemDiscountSetMessagePayloadImpl() {
        this.type = ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier for the Custom Line Item.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     */

    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Array of DiscountedLineItemPriceForQuantity after the Discount recalculation.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity() {
        return this.discountedPricePerQuantity;
    }

    /**
     *  <p>TaxedItemPrice of the Custom Line Item after the Discount recalculation.</p>
     */

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setDiscountedPricePerQuantity(
            final com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity... discountedPricePerQuantity) {
        this.discountedPricePerQuantity = new ArrayList<>(Arrays.asList(discountedPricePerQuantity));
    }

    public void setDiscountedPricePerQuantity(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderCustomLineItemDiscountSetMessagePayloadImpl that = (OrderCustomLineItemDiscountSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(taxedPrice, that.taxedPrice)
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(discountedPricePerQuantity, that.discountedPricePerQuantity)
                .append(taxedPrice, that.taxedPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(discountedPricePerQuantity)
                .append(taxedPrice)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("discountedPricePerQuantity", discountedPricePerQuantity)
                .append("taxedPrice", taxedPrice)
                .build();
    }

}
