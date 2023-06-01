package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnItemDraft;
import java.time.ZonedDateTime;
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
 * OrderAddReturnInfoAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderAddReturnInfoActionImpl implements OrderAddReturnInfoAction, ModelBase {

    
    private String action;
    
    
    private String returnTrackingId;
    
    
    private java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items;
    
    
    private java.time.ZonedDateTime returnDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderAddReturnInfoActionImpl(@JsonProperty("returnTrackingId") final String returnTrackingId, @JsonProperty("items") final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items, @JsonProperty("returnDate") final java.time.ZonedDateTime returnDate) {
        this.returnTrackingId = returnTrackingId;
        this.items = items;
        this.returnDate = returnDate;
        this.action =  ADD_RETURN_INFO;
    }
    /**
     * create empty instance
     */
    public OrderAddReturnInfoActionImpl() {
        this.action =  ADD_RETURN_INFO;
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
    
    public String getReturnTrackingId(){
        return this.returnTrackingId;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.api.models.order.ReturnItemDraft> getItems(){
        return this.items;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getReturnDate(){
        return this.returnDate;
    }

    
    public void setReturnTrackingId(final String returnTrackingId){
        this.returnTrackingId = returnTrackingId;
    }
    
    
    public void setItems(final com.commercetools.api.models.order.ReturnItemDraft ...items){
       this.items = new ArrayList<>(Arrays.asList(items));
    }
    
    
    public void setItems(final java.util.List<com.commercetools.api.models.order.ReturnItemDraft> items){
       this.items = items;
    }
    
    
    public void setReturnDate(final java.time.ZonedDateTime returnDate){
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderAddReturnInfoActionImpl that = (OrderAddReturnInfoActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(returnTrackingId, that.returnTrackingId)
                .append(items, that.items)
                .append(returnDate, that.returnDate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(returnTrackingId)
            .append(items)
            .append(returnDate)
            .toHashCode();
    }

}
