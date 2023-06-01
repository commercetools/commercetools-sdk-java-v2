package com.commercetools.api.models.quote_request;

import com.commercetools.api.models.quote_request.QuoteRequestState;
import com.commercetools.api.models.quote_request.QuoteRequestUpdateAction;
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
 *  <p>Transitions the Quote Request to a different state. A Buyer is only allowed to cancel a Quote Request when it is in <code>Submitted</code> state.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestChangeQuoteRequestStateActionImpl implements QuoteRequestChangeQuoteRequestStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestChangeQuoteRequestStateActionImpl(@JsonProperty("quoteRequestState") final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        this.action =  CHANGE_QUOTE_REQUEST_STATE;
    }
    /**
     * create empty instance
     */
    public QuoteRequestChangeQuoteRequestStateActionImpl() {
        this.action =  CHANGE_QUOTE_REQUEST_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New state to be set for the Quote Request.</p>
     */
    
    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState(){
        return this.quoteRequestState;
    }

    
    public void setQuoteRequestState(final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState){
        this.quoteRequestState = quoteRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteRequestChangeQuoteRequestStateActionImpl that = (QuoteRequestChangeQuoteRequestStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(quoteRequestState, that.quoteRequestState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(quoteRequestState)
            .toHashCode();
    }

}
