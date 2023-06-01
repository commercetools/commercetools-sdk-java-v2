package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
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
 * StagedOrderTransitionLineItemStateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderTransitionLineItemStateActionImpl implements StagedOrderTransitionLineItemStateAction, ModelBase {

    
    private String action;
    
    
    private String lineItemId;
    
    
    private Long quantity;
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier fromState;
    
    
    private com.commercetools.api.models.state.StateResourceIdentifier toState;
    
    
    private java.time.ZonedDateTime actualTransitionDate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderTransitionLineItemStateActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("quantity") final Long quantity, @JsonProperty("fromState") final com.commercetools.api.models.state.StateResourceIdentifier fromState, @JsonProperty("toState") final com.commercetools.api.models.state.StateResourceIdentifier toState, @JsonProperty("actualTransitionDate") final java.time.ZonedDateTime actualTransitionDate) {
        this.lineItemId = lineItemId;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.actualTransitionDate = actualTransitionDate;
        this.action =  TRANSITION_LINE_ITEM_STATE;
    }
    /**
     * create empty instance
     */
    public StagedOrderTransitionLineItemStateActionImpl() {
        this.action =  TRANSITION_LINE_ITEM_STATE;
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
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    /**
     *
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    
    public com.commercetools.api.models.state.StateResourceIdentifier getFromState(){
        return this.fromState;
    }
    
    /**
     *  <p>ResourceIdentifier to a State.</p>
     */
    
    public com.commercetools.api.models.state.StateResourceIdentifier getToState(){
        return this.toState;
    }
    
    /**
     *
     */
    
    public java.time.ZonedDateTime getActualTransitionDate(){
        return this.actualTransitionDate;
    }

    
    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    
    public void setFromState(final com.commercetools.api.models.state.StateResourceIdentifier fromState){
        this.fromState = fromState;
    }
    
    
    public void setToState(final com.commercetools.api.models.state.StateResourceIdentifier toState){
        this.toState = toState;
    }
    
    
    public void setActualTransitionDate(final java.time.ZonedDateTime actualTransitionDate){
        this.actualTransitionDate = actualTransitionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderTransitionLineItemStateActionImpl that = (StagedOrderTransitionLineItemStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .append(actualTransitionDate, that.actualTransitionDate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(quantity)
            .append(fromState)
            .append(toState)
            .append(actualTransitionDate)
            .toHashCode();
    }

}
