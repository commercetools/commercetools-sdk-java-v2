
package com.commercetools.api.models.variant_attributes;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Availability of a Variant in a specific supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesChannelAvailabilityImpl implements VariantAttributesChannelAvailability, ModelBase {

    private Boolean isOnStock;

    private Long restockableInDays;

    private Long availableQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAttributesChannelAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("availableQuantity") final Long availableQuantity) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
    }

    /**
     * create empty instance
     */
    public VariantAttributesChannelAvailabilityImpl() {
    }

    /**
     *  <p>Whether the Variant is in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     */

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     *  <p>Number of days to restock the Variant once it is out of stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     */

    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    /**
     *  <p>Number of items of this Variant that are in stock in the specified <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     */

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setIsOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    public void setRestockableInDays(final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setAvailableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantAttributesChannelAvailabilityImpl that = (VariantAttributesChannelAvailabilityImpl) o;

        return new EqualsBuilder().append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(isOnStock)
                .append(restockableInDays)
                .append(availableQuantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("isOnStock", isOnStock)
                .append("restockableInDays", restockableInDays)
                .append("availableQuantity", availableQuantity)
                .build();
    }

    @Override
    public VariantAttributesChannelAvailability copyDeep() {
        return VariantAttributesChannelAvailability.deepCopy(this);
    }
}
