
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

/**
 *  <p>Generated after a successful Add Price Tier update action</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTierAddedMessagePayloadImpl implements StandalonePriceTierAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.PriceTier tier;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceTierAddedMessagePayloadImpl(
            @JsonProperty("tier") final com.commercetools.api.models.common.PriceTier tier) {
        this.tier = tier;
        this.type = STANDALONE_PRICE_TIER_ADDED;
    }

    /**
     * create empty instance
     */
    public StandalonePriceTierAddedMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_TIER_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     */

    public com.commercetools.api.models.common.PriceTier getTier() {
        return this.tier;
    }

    public void setTier(final com.commercetools.api.models.common.PriceTier tier) {
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceTierAddedMessagePayloadImpl that = (StandalonePriceTierAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(tier, that.tier).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(tier).toHashCode();
    }

}
