
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemovePriceTierAction" rel="nofollow">Remove Price Tier</a> update action</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTierRemovedMessagePayloadImpl
        implements StandalonePriceTierRemovedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.PriceTier removedTier;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceTierRemovedMessagePayloadImpl(
            @JsonProperty("removedTier") final com.commercetools.api.models.common.PriceTier removedTier) {
        this.removedTier = removedTier;
        this.type = STANDALONE_PRICE_TIER_REMOVED;
    }

    /**
     * create empty instance
     */
    public StandalonePriceTierRemovedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_TIER_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     */

    public com.commercetools.api.models.common.PriceTier getRemovedTier() {
        return this.removedTier;
    }

    public void setRemovedTier(final com.commercetools.api.models.common.PriceTier removedTier) {
        this.removedTier = removedTier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceTierRemovedMessagePayloadImpl that = (StandalonePriceTierRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(removedTier, that.removedTier)
                .append(type, that.type)
                .append(removedTier, that.removedTier)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(removedTier).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("removedTier", removedTier)
                .build();
    }

    @Override
    public StandalonePriceTierRemovedMessagePayload copyDeep() {
        return StandalonePriceTierRemovedMessagePayload.deepCopy(this);
    }
}
