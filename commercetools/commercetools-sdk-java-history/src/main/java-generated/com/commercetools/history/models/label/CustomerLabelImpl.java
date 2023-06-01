package com.commercetools.history.models.label;

import com.commercetools.history.models.label.Label;
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
 * CustomerLabel
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerLabelImpl implements CustomerLabel, ModelBase {

    
    private String type;
    
    
    private String firstName;
    
    
    private String lastName;
    
    
    private String customerNumber;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerLabelImpl(@JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName, @JsonProperty("customerNumber") final String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.type =  CUSTOMER_LABEL;
    }
    /**
     * create empty instance
     */
    public CustomerLabelImpl() {
        this.type =  CUSTOMER_LABEL;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
     *
     */
    
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     *
     */
    
    public String getCustomerNumber(){
        return this.customerNumber;
    }

    
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }
    
    
    public void setLastName(final String lastName){
        this.lastName = lastName;
    }
    
    
    public void setCustomerNumber(final String customerNumber){
        this.customerNumber = customerNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerLabelImpl that = (CustomerLabelImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(customerNumber, that.customerNumber)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(firstName)
            .append(lastName)
            .append(customerNumber)
            .toHashCode();
    }

}
