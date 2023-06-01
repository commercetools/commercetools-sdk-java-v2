package com.commercetools.api.models.me;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.me.MyBusinessUnitUpdateAction;
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
 *  <p>Removing an Associate from a Business Unit generates a BusinessUnitAssociateRemoved Message.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyBusinessUnitRemoveAssociateActionImpl implements MyBusinessUnitRemoveAssociateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyBusinessUnitRemoveAssociateActionImpl(@JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        this.action =  REMOVE_ASSOCIATE;
    }
    /**
     * create empty instance
     */
    public MyBusinessUnitRemoveAssociateActionImpl() {
        this.action =  REMOVE_ASSOCIATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Associate to remove.</p>
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
    
        MyBusinessUnitRemoveAssociateActionImpl that = (MyBusinessUnitRemoveAssociateActionImpl) o;
    
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
