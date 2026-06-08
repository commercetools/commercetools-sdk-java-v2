
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidFromAndUntilSetMessagePayloadImpl
        implements StandalonePriceValidFromAndUntilSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime previousValidFrom;

    private java.time.ZonedDateTime validUntil;

    private java.time.ZonedDateTime previousValidUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceValidFromAndUntilSetMessagePayloadImpl(
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("previousValidFrom") final java.time.ZonedDateTime previousValidFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("previousValidUntil") final java.time.ZonedDateTime previousValidUntil) {
        this.validFrom = validFrom;
        this.previousValidFrom = previousValidFrom;
        this.validUntil = validUntil;
        this.previousValidUntil = previousValidUntil;
        this.type = STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET;
    }

    /**
     * create empty instance
     */
    public StandalonePriceValidFromAndUntilSetMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getPreviousValidFrom() {
        return this.previousValidFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getPreviousValidUntil() {
        return this.previousValidUntil;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setPreviousValidFrom(final java.time.ZonedDateTime previousValidFrom) {
        this.previousValidFrom = previousValidFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setPreviousValidUntil(final java.time.ZonedDateTime previousValidUntil) {
        this.previousValidUntil = previousValidUntil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StandalonePriceValidFromAndUntilSetMessagePayloadImpl that = (StandalonePriceValidFromAndUntilSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(validFrom, that.validFrom)
                .append(previousValidFrom, that.previousValidFrom)
                .append(validUntil, that.validUntil)
                .append(previousValidUntil, that.previousValidUntil)
                .append(type, that.type)
                .append(validFrom, that.validFrom)
                .append(previousValidFrom, that.previousValidFrom)
                .append(validUntil, that.validUntil)
                .append(previousValidUntil, that.previousValidUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(validFrom)
                .append(previousValidFrom)
                .append(validUntil)
                .append(previousValidUntil)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("validFrom", validFrom)
                .append("previousValidFrom", previousValidFrom)
                .append("validUntil", validUntil)
                .append("previousValidUntil", previousValidUntil)
                .build();
    }

    @Override
    public StandalonePriceValidFromAndUntilSetMessagePayload copyDeep() {
        return StandalonePriceValidFromAndUntilSetMessagePayload.deepCopy(this);
    }
}
