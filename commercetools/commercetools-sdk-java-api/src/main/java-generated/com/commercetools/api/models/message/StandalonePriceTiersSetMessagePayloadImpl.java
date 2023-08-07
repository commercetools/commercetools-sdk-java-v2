
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
 *  <p>Generated after a successful Set Price Tier update action</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTiersSetMessagePayloadImpl implements StandalonePriceTiersSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceTiersSetMessagePayloadImpl(
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.common.PriceTier> tiers,
            @JsonProperty("previousTiers") final java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers) {
        this.tiers = tiers;
        this.previousTiers = previousTiers;
        this.type = STANDALONE_PRICE_TIERS_SET;
    }

    /**
     * create empty instance
     */
    public StandalonePriceTiersSetMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_TIERS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getPreviousTiers() {
        return this.previousTiers;
    }

    public void setTiers(final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
    }

    public void setPreviousTiers(final com.commercetools.api.models.common.PriceTier... previousTiers) {
        this.previousTiers = new ArrayList<>(Arrays.asList(previousTiers));
    }

    public void setPreviousTiers(final java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers) {
        this.previousTiers = previousTiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceTiersSetMessagePayloadImpl that = (StandalonePriceTiersSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(tiers, that.tiers)
                .append(previousTiers, that.previousTiers)
                .append(type, that.type)
                .append(tiers, that.tiers)
                .append(previousTiers, that.previousTiers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(tiers).append(previousTiers).toHashCode();
    }

}
