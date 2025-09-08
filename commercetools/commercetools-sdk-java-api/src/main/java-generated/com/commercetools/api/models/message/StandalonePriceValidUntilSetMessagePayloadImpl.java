
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValidUntilSetMessagePayloadImpl
        implements StandalonePriceValidUntilSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime validUntil;

    private java.time.ZonedDateTime previousValidUntil;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StandalonePriceValidUntilSetMessagePayloadImpl(@JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("previousValidUntil") final java.time.ZonedDateTime previousValidUntil) {
        this.validUntil = validUntil;
        this.previousValidUntil = previousValidUntil;
        this.type = STANDALONE_PRICE_VALID_UNTIL_SET;
    }

    /**
     * create empty instance
     */
    public StandalonePriceValidUntilSetMessagePayloadImpl() {
        this.type = STANDALONE_PRICE_VALID_UNTIL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidUntilAction" rel="nofollow">Set Valid Until</a> update action.</p>
     */

    public java.time.ZonedDateTime getPreviousValidUntil() {
        return this.previousValidUntil;
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

        StandalonePriceValidUntilSetMessagePayloadImpl that = (StandalonePriceValidUntilSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(validUntil, that.validUntil)
                .append(previousValidUntil, that.previousValidUntil)
                .append(type, that.type)
                .append(validUntil, that.validUntil)
                .append(previousValidUntil, that.previousValidUntil)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(validUntil).append(previousValidUntil).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("validUntil", validUntil)
                .append("previousValidUntil", previousValidUntil)
                .build();
    }

    @Override
    public StandalonePriceValidUntilSetMessagePayload copyDeep() {
        return StandalonePriceValidUntilSetMessagePayload.deepCopy(this);
    }
}
