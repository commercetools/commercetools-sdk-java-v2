
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
 * StagedQuoteChangeStagedQuoteStateAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedQuoteChangeStagedQuoteStateActionImpl implements StagedQuoteChangeStagedQuoteStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    @JsonCreator
    StagedQuoteChangeStagedQuoteStateActionImpl(
            @JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.action = CHANGE_STAGED_QUOTE_STATE;
    }

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
     *  <p>The new quote staged state to be set for the Quote Staged.</p>
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stagedQuoteState).toHashCode();
    }

}
