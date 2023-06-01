package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
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
 * MyCartSetCustomerEmailAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartSetCustomerEmailActionImpl implements MyCartSetCustomerEmailAction, ModelBase {

    
    private String action;
    
    
    private String email;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartSetCustomerEmailActionImpl(@JsonProperty("email") final String email) {
        this.email = email;
        this.action =  SET_CUSTOMER_EMAIL;
    }
    /**
     * create empty instance
     */
    public MyCartSetCustomerEmailActionImpl() {
        this.action =  SET_CUSTOMER_EMAIL;
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
    
    public String getEmail(){
        return this.email;
    }

    
    public void setEmail(final String email){
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MyCartSetCustomerEmailActionImpl that = (MyCartSetCustomerEmailActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(email, that.email)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(email)
            .toHashCode();
    }

}
