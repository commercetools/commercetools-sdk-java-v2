package com.commercetools.api.models.quote;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
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
 *  <p>Changes the owner of a Quote to a different Customer. Customer Group is not updated. This update action produces the Quote Customer Changed Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class QuoteChangeCustomerActionImpl implements QuoteChangeCustomerAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    QuoteChangeCustomerActionImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action =  CHANGE_CUSTOMER;
    }
    /**
     * create empty instance
     */
    public QuoteChangeCustomerActionImpl() {
        this.action =  CHANGE_CUSTOMER;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New Customer to own the Quote.</p>
     */
    
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }

    
    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer){
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        QuoteChangeCustomerActionImpl that = (QuoteChangeCustomerActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customer, that.customer)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customer)
            .toHashCode();
    }

}
