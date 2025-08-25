
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Removing a <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> from a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceTierRemovedMessage" rel="nofollow">Standalone Price Tier Removed</a> Message.</p>
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
     *  <p>The <code>minimumQuantity</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be removed from the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
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
                .append(action, that.action)
                .append(tierMinimumQuantity, that.tierMinimumQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tierMinimumQuantity).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("tierMinimumQuantity", tierMinimumQuantity)
                .build();
    }

    @Override
    public StandalonePriceRemovePriceTierAction copyDeep() {
        return StandalonePriceRemovePriceTierAction.deepCopy(this);
    }
}
