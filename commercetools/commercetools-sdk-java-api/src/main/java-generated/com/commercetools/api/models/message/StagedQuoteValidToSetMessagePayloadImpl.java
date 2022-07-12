
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
 * StagedQuoteValidToSetMessagePayload
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteValidToSetMessagePayloadImpl implements StagedQuoteValidToSetMessagePayload, ModelBase {

    private String type;

    private java.time.ZonedDateTime validTo;

    @JsonCreator
    StagedQuoteValidToSetMessagePayloadImpl(@JsonProperty("validTo") final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        this.type = STAGED_QUOTE_VALID_TO_SET;
    }

    public StagedQuoteValidToSetMessagePayloadImpl() {
        this.type = STAGED_QUOTE_VALID_TO_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public java.time.ZonedDateTime getValidTo() {
        return this.validTo;
    }

    public void setValidTo(final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteValidToSetMessagePayloadImpl that = (StagedQuoteValidToSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(validTo, that.validTo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(validTo).toHashCode();
    }

}
