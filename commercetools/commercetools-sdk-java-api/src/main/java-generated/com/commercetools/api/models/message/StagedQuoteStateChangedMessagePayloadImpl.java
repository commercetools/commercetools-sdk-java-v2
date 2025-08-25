
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteStateChangedMessagePayloadImpl implements StagedQuoteStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    private com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteStateChangedMessagePayloadImpl(
            @JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState,
            @JsonProperty("oldStagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.oldStagedQuoteState = oldStagedQuoteState;
        this.type = STAGED_QUOTE_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
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
     *  <p>State of the Staged Quote after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    /**
     *  <p>State of the Staged Quote before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedQuoteChangeStagedQuoteStateAction" rel="nofollow">Change Staged Quote State</a> update action.</p>
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
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("stagedQuoteState", stagedQuoteState)
                .append("oldStagedQuoteState", oldStagedQuoteState)
                .build();
    }

    @Override
    public StagedQuoteStateChangedMessagePayload copyDeep() {
        return StagedQuoteStateChangedMessagePayload.deepCopy(this);
    }
}
