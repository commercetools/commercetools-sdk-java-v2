package com.commercetools.api.models.quote;

import com.commercetools.api.models.quote.QuoteState;
import com.commercetools.api.models.quote.QuoteUpdateAction;
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
 * QuoteChangeQuoteStateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteChangeQuoteStateActionImpl implements QuoteChangeQuoteStateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.quote.QuoteState quoteState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteChangeQuoteStateActionImpl(@JsonProperty("quoteState") final com.commercetools.api.models.quote.QuoteState quoteState) {
        this.quoteState = quoteState;
        this.action =  CHANGE_QUOTE_STATE;
    }
    /**
     * create empty instance
     */
    public QuoteChangeQuoteStateActionImpl() {
        this.action =  CHANGE_QUOTE_STATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New state to be set for the Quote.</p>
     */
    
    public com.commercetools.api.models.quote.QuoteState getQuoteState(){
        return this.quoteState;
    }

    
    public void setQuoteState(final com.commercetools.api.models.quote.QuoteState quoteState){
        this.quoteState = quoteState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteChangeQuoteStateActionImpl that = (QuoteChangeQuoteStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(quoteState, that.quoteState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(quoteState)
            .toHashCode();
    }

}
