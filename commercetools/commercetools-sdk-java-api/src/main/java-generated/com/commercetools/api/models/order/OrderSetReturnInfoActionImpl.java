package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnInfoDraft;
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
 * OrderSetReturnInfoAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnInfoActionImpl implements OrderSetReturnInfoAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnInfoActionImpl(@JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items) {
        this.items = items;
        this.action =  SET_RETURN_INFO;
    }
    /**
     * create empty instance
     */
    public OrderSetReturnInfoActionImpl() {
        this.action =  SET_RETURN_INFO;
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
    
    public java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> getItems(){
        return this.items;
    }

    
    public void setItems(final com.commercetools.api.models.order.ReturnInfoDraft ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    
    public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnInfoDraft> items){
       this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderSetReturnInfoActionImpl that = (OrderSetReturnInfoActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(items, that.items)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(items)
            .toHashCode();
    }

}
