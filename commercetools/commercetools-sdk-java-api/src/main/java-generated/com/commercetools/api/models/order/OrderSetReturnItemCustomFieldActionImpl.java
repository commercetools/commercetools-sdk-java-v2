package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
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
 * OrderSetReturnItemCustomFieldAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnItemCustomFieldActionImpl implements OrderSetReturnItemCustomFieldAction, ModelBase {

    
    private String action;
    
    
    private String returnItemId;
    
    
    private String name;
    
    
    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnItemCustomFieldActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.returnItemId = returnItemId;
        this.name = name;
        this.value = value;
        this.action =  SET_RETURN_ITEM_CUSTOM_FIELD;
    }
    /**
     * create empty instance
     */
    public OrderSetReturnItemCustomFieldActionImpl() {
        this.action =  SET_RETURN_ITEM_CUSTOM_FIELD;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *
     */
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    /**
     *  <p>Name of the Custom Field.</p>
     */
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */
    
    public java.lang.Object getValue(){
        return this.value;
    }

    
    public void setReturnItemId(final String returnItemId){
        this.returnItemId = returnItemId;
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
    
        OrderSetReturnItemCustomFieldActionImpl that = (OrderSetReturnItemCustomFieldActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(returnItemId)
            .append(name)
            .append(value)
            .toHashCode();
    }

}
