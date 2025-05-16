
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
 *  <p>Generated after a successful Set Valid From update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidFromSetMessagePayloadImpl
        implements StandalonePriceValidFromSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime previousValidFrom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceValidFromSetMessagePayloadImpl(@JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("previousValidFrom") final java.time.ZonedDateTime previousValidFrom) {
        this.validFrom = validFrom;
        this.previousValidFrom = previousValidFrom;
        this.type = STANDALONE_PRICE_VALID_FROM_SET;
    }

    /**
     * create empty instance
     */
    public StandalonePriceValidFromSetMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_VALID_FROM_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> after the Set Valid From update action.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value of StandalonePrice <code>validFrom</code> before the Set Valid From update action.</p>
     */

    public java.time.ZonedDateTime getPreviousValidFrom() {
        return this.previousValidFrom;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setPreviousValidFrom(final java.time.ZonedDateTime previousValidFrom) {
        this.previousValidFrom = previousValidFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceValidFromSetMessagePayloadImpl that = (StandalonePriceValidFromSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(validFrom, that.validFrom)
                .append(previousValidFrom, that.previousValidFrom)
                .append(type, that.type)
                .append(validFrom, that.validFrom)
                .append(previousValidFrom, that.previousValidFrom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(validFrom).append(previousValidFrom).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("validFrom", validFrom)
                .append("previousValidFrom", previousValidFrom)
                .build();
    }

    @Override
    public StandalonePriceValidFromSetMessagePayload copyDeep() {
        return StandalonePriceValidFromSetMessagePayload.deepCopy(this);
    }
}
