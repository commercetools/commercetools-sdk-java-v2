
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
 *  <p>Adding a <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceTierAddedMessage" rel="nofollow">Standalone Price Tier Added</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceAddPriceTierActionImpl implements StandalonePriceAddPriceTierAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.PriceTierDraft tier;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceAddPriceTierActionImpl(
            @JsonProperty("tier") final com.commercetools.api.models.common.PriceTierDraft tier) {
        this.tier = tier;
        this.action = ADD_PRICE_TIER;
    }

    /**
     * create empty instance
     */
    public StandalonePriceAddPriceTierActionImpl() {
        this.action = ADD_PRICE_TIER;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be added to the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>. The action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     */

    public com.commercetools.api.models.common.PriceTierDraft getTier() {
        return this.tier;
    }

    public void setTier(final com.commercetools.api.models.common.PriceTierDraft tier) {
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceAddPriceTierActionImpl that = (StandalonePriceAddPriceTierActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(tier, that.tier)
                .append(action, that.action)
                .append(tier, that.tier)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tier).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("tier", tier)
                .build();
    }

    @Override
    public StandalonePriceAddPriceTierAction copyDeep() {
        return StandalonePriceAddPriceTierAction.deepCopy(this);
    }
}
