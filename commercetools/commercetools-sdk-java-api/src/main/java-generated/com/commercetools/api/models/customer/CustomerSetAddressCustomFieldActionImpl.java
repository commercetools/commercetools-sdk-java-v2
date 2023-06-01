package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import java.lang.Object;
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
 * CustomerSetAddressCustomFieldAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetAddressCustomFieldActionImpl implements CustomerSetAddressCustomFieldAction, ModelBase {

    
    private String action;
    
    
    private String addressId;
    
    
    private String name;
    
    
    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSetAddressCustomFieldActionImpl(@JsonProperty("addressId") final String addressId, @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.addressId = addressId;
        this.name = name;
        this.value = value;
        this.action =  SET_ADDRESS_CUSTOM_FIELD;
    }
    /**
     * create empty instance
     */
    public CustomerSetAddressCustomFieldActionImpl() {
        this.action =  SET_ADDRESS_CUSTOM_FIELD;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>User-defined unique identifier of the Address to be updated.</p>
     */
    
    public String getAddressId(){
        return this.addressId;
    }
    
    /**
     *  <p>Name of the Custom Field.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. If <code>value</code> is provided, it is set for the field defined by <code>name</code>. Trying to remove a field that does not exist will fail with an InvalidOperation error.</p>
     */
    
    public java.lang.Object getValue(){
        return this.value;
    }

    
    public void setAddressId(final String addressId){
        this.addressId = addressId;
    }
    
    
    public void setName(final String name){
        this.name = name;
    }
    
    
    public void setValue(final java.lang.Object value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomerSetAddressCustomFieldActionImpl that = (CustomerSetAddressCustomFieldActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(addressId)
            .append(name)
            .append(value)
            .toHashCode();
    }

}
