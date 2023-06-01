package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.staged_quote.StagedQuoteState;
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
 *  <p>Generated after a successful Change Staged Quote State update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteStateChangedMessagePayloadImpl implements StagedQuoteStateChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;
    
    
    private com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedQuoteStateChangedMessagePayloadImpl(@JsonProperty("stagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState, @JsonProperty("oldStagedQuoteState") final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        this.oldStagedQuoteState = oldStagedQuoteState;
        this.type =  STAGED_QUOTE_STATE_CHANGED;
    }
    /**
     * create empty instance
     */
    public StagedQuoteStateChangedMessagePayloadImpl() {
        this.type =  STAGED_QUOTE_STATE_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>State of the Staged Quote after the Change Staged Quote State update action.</p>
     */
    
    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState(){
        return this.stagedQuoteState;
    }
    
    /**
     *  <p>State of the Staged Quote before the Change Staged Quote State update action.</p>
     */
    
    public com.commercetools.api.models.staged_quote.StagedQuoteState getOldStagedQuoteState(){
        return this.oldStagedQuoteState;
    }

    
    public void setStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState){
        this.stagedQuoteState = stagedQuoteState;
    }
    
    
    public void setOldStagedQuoteState(final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState){
        this.oldStagedQuoteState = oldStagedQuoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedQuoteStateChangedMessagePayloadImpl that = (StagedQuoteStateChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(stagedQuoteState, that.stagedQuoteState)
                .append(oldStagedQuoteState, that.oldStagedQuoteState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(stagedQuoteState)
            .append(oldStagedQuoteState)
            .toHashCode();
    }

}
