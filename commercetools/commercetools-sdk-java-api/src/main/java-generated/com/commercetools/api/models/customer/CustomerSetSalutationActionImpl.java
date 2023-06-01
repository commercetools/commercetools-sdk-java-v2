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
 * CustomerSetSalutationAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetSalutationActionImpl implements CustomerSetSalutationAction, ModelBase {

    
    private String action;
    
    
    private String salutation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetSalutationActionImpl(@JsonProperty("salutation") final String salutation) {
        this.salutation = salutation;
        this.action =  SET_SALUTATION;
    }
    /**
     * create empty instance
     */
    public CustomerSetSalutationActionImpl() {
        this.action =  SET_SALUTATION;
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
    
    public String getSalutation(){
        return this.salutation;
    }

    
    public void setSalutation(final String salutation){
        this.salutation = salutation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetSalutationActionImpl that = (CustomerSetSalutationActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(salutation, that.salutation)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(salutation)
            .toHashCode();
    }

}
