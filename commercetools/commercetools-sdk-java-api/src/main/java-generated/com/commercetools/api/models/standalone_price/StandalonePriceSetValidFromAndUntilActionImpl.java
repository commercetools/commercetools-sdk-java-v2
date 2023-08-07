
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
 *  <p>Updating the <code>validFrom</code> and <code>validUntil</code> values generates the StandalonePriceValidFromAndUntilSet Message.</p>
 *  <p>As the validity dates are part of the price scope and are not allowed to overlap, this update might return the DuplicateStandalonePriceScope and OverlappingStandalonePriceValidity errors, respectively. A Price without validity period does not conflict with a Price defined for a time period.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetValidFromAndUntilActionImpl
        implements StandalonePriceSetValidFromAndUntilAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceSetValidFromAndUntilActionImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil) {
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    /**
     * create empty instance
     */
    public StandalonePriceSetValidFromAndUntilActionImpl() {
        this.action = SET_VALID_FROM_AND_UNTIL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceSetValidFromAndUntilActionImpl that = (StandalonePriceSetValidFromAndUntilActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(action, that.action)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validFrom).append(validUntil).toHashCode();
    }

}
