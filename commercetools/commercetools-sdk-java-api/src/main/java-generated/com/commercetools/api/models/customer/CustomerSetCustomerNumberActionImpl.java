package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
 *  <p>Sets a new ID that can be used to refer to a Customer in a human-reabable way (for use in emails, invoices, etc).</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetCustomerNumberActionImpl implements CustomerSetCustomerNumberAction, ModelBase {

    
    private String action;
    
    
    private String customerNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetCustomerNumberActionImpl(@JsonProperty("customerNumber") final String customerNumber) {
        this.customerNumber = customerNumber;
        this.action =  SET_CUSTOMER_NUMBER;
    }
    /**
     * create empty instance
     */
    public CustomerSetCustomerNumberActionImpl() {
        this.action =  SET_CUSTOMER_NUMBER;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     */
    
    public String getCustomerNumber(){
        return this.customerNumber;
    }

    
    public void setCustomerNumber(final String customerNumber){
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetCustomerNumberActionImpl that = (CustomerSetCustomerNumberActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(customerNumber, that.customerNumber)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(customerNumber)
            .toHashCode();
    }

}
