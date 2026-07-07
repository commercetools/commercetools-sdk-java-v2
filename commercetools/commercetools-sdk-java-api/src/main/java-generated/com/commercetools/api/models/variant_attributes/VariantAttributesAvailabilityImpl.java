
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
 *  <p>Lightweight availability information for a Variant. Present only if <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a> exist for the Variant's SKU.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAttributesAvailabilityImpl implements VariantAttributesAvailability, ModelBase {

    private Boolean isOnStock;

    private Long availableQuantity;

    private com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap channels;

    /**
     * create instance with all properties
     */
    @JsonCreator
    VariantAttributesAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("availableQuantity") final Long availableQuantity,
            @JsonProperty("channels") final com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap channels) {
        this.isOnStock = isOnStock;
        this.availableQuantity = availableQuantity;
        this.channels = channels;
    }

    /**
     * create empty instance
     */
    public VariantAttributesAvailabilityImpl() {
    }

    /**
     *  <p>Indicates whether the Variant is in stock.</p>
     */

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    /**
     *  <p>Number of items of this Variant that are in stock.</p>
     */

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    /**
     *  <p>Per-channel availability for the requested supply <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channels</a>. Present only when the <code>filter[supplyChannels]</code> query parameter is provided.</p>
     */

    public com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap getChannels() {
        return this.channels;
    }

    public void setIsOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    public void setAvailableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void setChannels(
            final com.commercetools.api.models.variant_attributes.VariantAttributesChannelAvailabilityMap channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        VariantAttributesAvailabilityImpl that = (VariantAttributesAvailabilityImpl) o;

        return new EqualsBuilder().append(isOnStock, that.isOnStock)
                .append(availableQuantity, that.availableQuantity)
                .append(channels, that.channels)
                .append(isOnStock, that.isOnStock)
                .append(availableQuantity, that.availableQuantity)
                .append(channels, that.channels)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(isOnStock).append(availableQuantity).append(channels).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("isOnStock", isOnStock)
                .append("availableQuantity", availableQuantity)
                .append("channels", channels)
                .build();
    }

    @Override
    public VariantAttributesAvailability copyDeep() {
        return VariantAttributesAvailability.deepCopy(this);
    }
}
