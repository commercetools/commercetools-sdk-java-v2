package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderImportLineItemStateActionImpl implements StagedOrderImportLineItemStateAction {

    private String action;
    
    private String lineItemId;
    
    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    @JsonCreator
    StagedOrderImportLineItemStateActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.lineItemId = lineItemId;
        this.state = state;
        this.action = "importLineItemState";
    }
    public StagedOrderImportLineItemStateActionImpl() {
        this.action = "importLineItemState";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getLineItemId(){
        return this.lineItemId;
    }
    
    
    public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
        return this.state;
    }

    public void setLineItemId(final String lineItemId){
        this.lineItemId = lineItemId;
    }
    
    public void setState(final com.commercetools.api.models.order.ItemState ...state){
       this.state = new ArrayList<>(Arrays.asList(state));
    }
    
    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state){
       this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        StagedOrderImportLineItemStateActionImpl that = (StagedOrderImportLineItemStateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(state, that.state)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(lineItemId)
            .append(state)
            .toHashCode();
    }

}
