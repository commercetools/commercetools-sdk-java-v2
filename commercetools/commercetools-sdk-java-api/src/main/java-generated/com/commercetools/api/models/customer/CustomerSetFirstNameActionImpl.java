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
 * CustomerSetFirstNameAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetFirstNameActionImpl implements CustomerSetFirstNameAction, ModelBase {

    
    private String action;
    
    
    private String firstName;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetFirstNameActionImpl(@JsonProperty("firstName") final String firstName) {
        this.firstName = firstName;
        this.action =  SET_FIRST_NAME;
    }
    /**
     * create empty instance
     */
    public CustomerSetFirstNameActionImpl() {
        this.action =  SET_FIRST_NAME;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */
    
    public String getFirstName(){
        return this.firstName;
    }

    
    public void setFirstName(final String firstName){
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetFirstNameActionImpl that = (CustomerSetFirstNameActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(firstName, that.firstName)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(firstName)
            .toHashCode();
    }

}
