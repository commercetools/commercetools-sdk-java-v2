package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.quote_request.QuoteRequest;
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
 *  <p>Generated after a successful Create Quote Request request.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestCreatedMessagePayloadImpl implements QuoteRequestCreatedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.quote_request.QuoteRequest quoteRequest;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestCreatedMessagePayloadImpl(@JsonProperty("quoteRequest") final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest) {
        this.quoteRequest = quoteRequest;
        this.type =  QUOTE_REQUEST_CREATED;
    }
    /**
     * create empty instance
     */
    public QuoteRequestCreatedMessagePayloadImpl() {
        this.type =  QUOTE_REQUEST_CREATED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Quote Request that was created.</p>
     */
    
    public com.commercetools.api.models.quote_request.QuoteRequest getQuoteRequest(){
        return this.quoteRequest;
    }

    
    public void setQuoteRequest(final com.commercetools.api.models.quote_request.QuoteRequest quoteRequest){
        this.quoteRequest = quoteRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteRequestCreatedMessagePayloadImpl that = (QuoteRequestCreatedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(quoteRequest, that.quoteRequest)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(quoteRequest)
            .toHashCode();
    }

}
