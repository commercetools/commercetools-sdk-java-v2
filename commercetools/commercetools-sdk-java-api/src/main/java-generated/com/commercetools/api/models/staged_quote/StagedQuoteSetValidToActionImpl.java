
package com.commercetools.api.models.staged_quote;

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
 * StagedQuoteSetValidToAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteSetValidToActionImpl implements StagedQuoteSetValidToAction, ModelBase {

    private String action;

    private java.time.ZonedDateTime validTo;

    @JsonCreator
    StagedQuoteSetValidToActionImpl(@JsonProperty("validTo") final java.time.ZonedDateTime validTo) {
        this.validTo = validTo;
        this.action = SET_VALID_TO;
    }

    public StagedQuoteSetValidToActionImpl() {
        this.action = SET_VALID_TO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>If <code>validTo</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
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

        StagedQuoteSetValidToActionImpl that = (StagedQuoteSetValidToActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(validTo, that.validTo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(validTo).toHashCode();
    }

}
