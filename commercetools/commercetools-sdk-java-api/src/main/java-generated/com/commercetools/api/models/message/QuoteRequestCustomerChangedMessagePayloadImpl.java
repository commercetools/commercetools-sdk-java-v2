package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.message.MessagePayload;
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
 *  <p>Generated after a successful Change Customer update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteRequestCustomerChangedMessagePayloadImpl implements QuoteRequestCustomerChangedMessagePayload, ModelBase {

    
    private String type;
    
    
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    private com.commercetools.api.models.customer.CustomerReference previousCustomer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteRequestCustomerChangedMessagePayloadImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer, @JsonProperty("previousCustomer") final com.commercetools.api.models.customer.CustomerReference previousCustomer) {
        this.customer = customer;
        this.previousCustomer = previousCustomer;
        this.type =  QUOTE_REQUEST_CUSTOMER_CHANGED;
    }
    /**
     * create empty instance
     */
    public QuoteRequestCustomerChangedMessagePayloadImpl() {
        this.type =  QUOTE_REQUEST_CUSTOMER_CHANGED;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>The Buyer who now owns the Quote Request.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>The previous Buyer.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerReference getPreviousCustomer(){
        return this.previousCustomer;
    }

    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer){
        this.customer = customer;
    }
    
    
    public void setPreviousCustomer(final com.commercetools.api.models.customer.CustomerReference previousCustomer){
        this.previousCustomer = previousCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteRequestCustomerChangedMessagePayloadImpl that = (QuoteRequestCustomerChangedMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customer, that.customer)
                .append(previousCustomer, that.previousCustomer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customer)
            .append(previousCustomer)
            .toHashCode();
    }

}
