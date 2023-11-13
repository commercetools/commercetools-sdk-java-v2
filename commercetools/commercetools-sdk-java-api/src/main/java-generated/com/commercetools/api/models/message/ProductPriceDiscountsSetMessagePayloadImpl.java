
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
 *  <p>Generated after a Price is updated due to a Product Discount.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceDiscountsSetMessagePayloadImpl implements ProductPriceDiscountsSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceDiscountsSetMessagePayloadImpl(
            @JsonProperty("updatedPrices") final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
        this.type = PRODUCT_PRICE_DISCOUNTS_SET;
    }

    /**
     * create empty instance
     */
    public ProductPriceDiscountsSetMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_DISCOUNTS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Array containing details about the Embedded Prices that were updated.</p>
     */

    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices() {
        return this.updatedPrices;
    }

    public void setUpdatedPrices(
            final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice... updatedPrices) {
        this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
    }

    public void setUpdatedPrices(
            final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceDiscountsSetMessagePayloadImpl that = (ProductPriceDiscountsSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(updatedPrices, that.updatedPrices)
                .append(type, that.type)
                .append(updatedPrices, that.updatedPrices)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(updatedPrices).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("updatedPrices", updatedPrices)
                .build();
    }

}
