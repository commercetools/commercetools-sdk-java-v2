package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.state.StateReference;
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
 *  <p>Generated after a successful Transition Custom Line Item State update action.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomLineItemStateTransitionMessagePayloadImpl implements CustomLineItemStateTransitionMessagePayload, ModelBase {

    
    private String type;
    
    
    private String customLineItemId;
    
    
    private java.time.ZonedDateTime transitionDate;
    
    
    private Long quantity;
    
    
    private com.commercetools.api.models.state.StateReference fromState;
    
    
    private com.commercetools.api.models.state.StateReference toState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemStateTransitionMessagePayloadImpl(@JsonProperty("customLineItemId") final String customLineItemId, @JsonProperty("transitionDate") final java.time.ZonedDateTime transitionDate, @JsonProperty("quantity") final Long quantity, @JsonProperty("fromState") final com.commercetools.api.models.state.StateReference fromState, @JsonProperty("toState") final com.commercetools.api.models.state.StateReference toState) {
        this.customLineItemId = customLineItemId;
        this.transitionDate = transitionDate;
        this.quantity = quantity;
        this.fromState = fromState;
        this.toState = toState;
        this.type =  CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }
    /**
     * create empty instance
     */
    public CustomLineItemStateTransitionMessagePayloadImpl() {
        this.type =  CUSTOM_LINE_ITEM_STATE_TRANSITION;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     */
    
    public String getCustomLineItemId(){
        return this.customLineItemId;
    }
    
    /**
     *  <p>Date and time (UTC) when the transition of the Custom Line Item State was performed.</p>
     */
    
    public java.time.ZonedDateTime getTransitionDate(){
        return this.transitionDate;
    }
    
    /**
     *  <p>Number of Custom Line Items for which the State was transitioned.</p>
     */
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>State the Custom Line Item was transitioned from.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getFromState(){
        return this.fromState;
    }
    
    /**
     *  <p>State the Custom Line Item was transitioned to.</p>
     */
    
    public com.commercetools.api.models.state.StateReference getToState(){
        return this.toState;
    }

    
    public void setCustomLineItemId(final String customLineItemId){
        this.customLineItemId = customLineItemId;
    }
    
    
    public void setTransitionDate(final java.time.ZonedDateTime transitionDate){
        this.transitionDate = transitionDate;
    }
    
    
    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }
    
    
    public void setFromState(final com.commercetools.api.models.state.StateReference fromState){
        this.fromState = fromState;
    }
    
    
    public void setToState(final com.commercetools.api.models.state.StateReference toState){
        this.toState = toState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        CustomLineItemStateTransitionMessagePayloadImpl that = (CustomLineItemStateTransitionMessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(customLineItemId, that.customLineItemId)
                .append(transitionDate, that.transitionDate)
                .append(quantity, that.quantity)
                .append(fromState, that.fromState)
                .append(toState, that.toState)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(customLineItemId)
            .append(transitionDate)
            .append(quantity)
            .append(fromState)
            .append(toState)
            .toHashCode();
    }

}
