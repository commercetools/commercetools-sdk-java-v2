package com.commercetools.api.models.staged_quote;

import com.commercetools.api.models.staged_quote.StagedQuoteState;
import com.commercetools.api.models.staged_quote.StagedQuoteUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * StagedQuoteChangeStagedQuoteStateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteChangeStagedQuoteStateActionImpl implements StagedQuoteChangeStagedQuoteStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteChangeStagedQuoteStateActionImpl(@JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.action =  CHANGE_STAGED_QUOTE_STATE;
    }
    /**
     * create empty instance
     */
    public StagedQuoteChangeStagedQuoteStateActionImpl() {
        this.action =  CHANGE_STAGED_QUOTE_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New state to be set for the Staged Quote.</p>
     */
    
    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState(){
        return this.stagedQuoteState;
    }

    
    public void setStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState){
        this.stagedQuoteState = stagedQuoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedQuoteChangeStagedQuoteStateActionImpl that = (StagedQuoteChangeStagedQuoteStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(stagedQuoteState, that.stagedQuoteState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(stagedQuoteState)
            .toHashCode();
    }

}
