
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
 *  <p>Sets all PriceTiers for a StandalonePrice in one action, produces the Standalone Price Tiers Set Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetPriceTiersActionImpl implements StandalonePriceSetPriceTiersAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceSetPriceTiersActionImpl(
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        this.action = SET_PRICE_TIERS;
    }

    /**
     * create empty instance
     */
    public StandalonePriceSetPriceTiersActionImpl() {
        this.action = SET_PRICE_TIERS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an InvalidField error is returned.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    public void setTiers(final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceSetPriceTiersActionImpl that = (StandalonePriceSetPriceTiersActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(tiers, that.tiers).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(tiers).toHashCode();
    }

}
