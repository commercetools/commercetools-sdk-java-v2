
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
 * StagedQuoteStateChangedMessagePayload
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteStateChangedMessagePayloadImpl implements StagedQuoteStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    private com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState;

    @JsonCreator
    StagedQuoteStateChangedMessagePayloadImpl(
            @JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState,
            @JsonProperty("oldStagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.oldStagedQuoteState = oldStagedQuoteState;
        this.type = STAGED_QUOTE_STATE_CHANGED;
    }

    public StagedQuoteStateChangedMessagePayloadImpl() {
        this.type = STAGED_QUOTE_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    /**
     *  <p>Predefined states tracking the status of the Staged Quote.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getOldStagedQuoteState() {
        return this.oldStagedQuoteState;
    }

    public void setStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
    }

    public void setOldStagedQuoteState(
            final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState) {
        this.oldStagedQuoteState = oldStagedQuoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteStateChangedMessagePayloadImpl that = (StagedQuoteStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(stagedQuoteState, that.stagedQuoteState)
                .append(oldStagedQuoteState, that.oldStagedQuoteState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(stagedQuoteState)
                .append(oldStagedQuoteState)
                .toHashCode();
    }

}
