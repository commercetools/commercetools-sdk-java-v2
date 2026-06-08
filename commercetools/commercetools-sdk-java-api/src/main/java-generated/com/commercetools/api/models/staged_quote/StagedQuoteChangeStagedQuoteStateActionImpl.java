
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * StagedQuoteChangeStagedQuoteStateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteChangeStagedQuoteStateActionImpl implements StagedQuoteChangeStagedQuoteStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteChangeStagedQuoteStateActionImpl(
            @JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.action = CHANGE_STAGED_QUOTE_STATE;
    }

    /**
     * create empty instance
     */
    public StagedQuoteChangeStagedQuoteStateActionImpl() {
        this.action = CHANGE_STAGED_QUOTE_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New state to be set for the Staged Quote.</p>
     */

    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState() {
        return this.stagedQuoteState;
    }

    public void setStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedQuoteChangeStagedQuoteStateActionImpl that = (StagedQuoteChangeStagedQuoteStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(stagedQuoteState, that.stagedQuoteState)
                .append(action, that.action)
                .append(stagedQuoteState, that.stagedQuoteState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stagedQuoteState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stagedQuoteState", stagedQuoteState)
                .build();
    }

    @Override
    public StagedQuoteChangeStagedQuoteStateAction copyDeep() {
        return StagedQuoteChangeStagedQuoteStateAction.deepCopy(this);
    }
}
