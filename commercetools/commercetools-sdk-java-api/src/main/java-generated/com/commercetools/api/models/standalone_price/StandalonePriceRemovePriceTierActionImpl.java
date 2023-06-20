
package com.commercetools.api.models.standalone_price;

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
 *  <p>Removing a PriceTier from a StandalonePrice produces the Standalone Price Tier Removed Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceRemovePriceTierActionImpl implements StandalonePriceRemovePriceTierAction, ModelBase {

    private String action;

    private Long tierMinimumQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceRemovePriceTierActionImpl(@JsonProperty("tierMinimumQuantity") final Long tierMinimumQuantity) {
        this.tierMinimumQuantity = tierMinimumQuantity;
        this.action = REMOVE_PRICE_TIER;
    }

    /**
     * create empty instance
     */
    public StandalonePriceRemovePriceTierActionImpl() {
        this.action = REMOVE_PRICE_TIER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>minimumQuantity</code> of the PriceTier to be removed from the <code>tiers</code> field of the StandalonePrice.</p>
     */

    public Long getTierMinimumQuantity() {
        return this.tierMinimumQuantity;
    }

    public void setTierMinimumQuantity(final Long tierMinimumQuantity) {
        this.tierMinimumQuantity = tierMinimumQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceRemovePriceTierActionImpl that = (StandalonePriceRemovePriceTierActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(tierMinimumQuantity, that.tierMinimumQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tierMinimumQuantity).toHashCode();
    }

}
