package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.quote_request.QuoteRequestState;
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
 *  <p>Generated after a successful Change Quote Request State update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestStateChangedMessagePayloadImpl implements QuoteRequestStateChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;
    
    
    private com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestStateChangedMessagePayloadImpl(@JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState, @JsonProperty("oldQuoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        this.oldQuoteRequestState = oldQuoteRequestState;
        this.type =  QUOTE_REQUEST_STATE_CHANGED;
    }
    /**
     * create empty instance
     */
    public QuoteRequestStateChangedMessagePayloadImpl() {
        this.type =  QUOTE_REQUEST_STATE_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>State of the Quote Request after the Change Quote Request State update action.</p>
     */
    
    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState(){
        return this.quoteRequestState;
    }
    
    /**
     *  <p>State of the Quote Request before the Change Quote Request State update action.</p>
     */
    
    public com.commercetools.api.models.quote_request.QuoteRequestState getOldQuoteRequestState(){
        return this.oldQuoteRequestState;
    }

    
    public void setQuoteRequestState(final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState){
        this.quoteRequestState = quoteRequestState;
    }
    
    
    public void setOldQuoteRequestState(final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState){
        this.oldQuoteRequestState = oldQuoteRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteRequestStateChangedMessagePayloadImpl that = (QuoteRequestStateChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(quoteRequestState, that.quoteRequestState)
                .append(oldQuoteRequestState, that.oldQuoteRequestState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(quoteRequestState)
            .append(oldQuoteRequestState)
            .toHashCode();
    }

}
