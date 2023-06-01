package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
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
 * OrderEditSetStagedActionsAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderEditSetStagedActionsActionImpl implements OrderEditSetStagedActionsAction, ModelBase {

    
    private String action;
    
    
    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditSetStagedActionsActionImpl(@JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        this.action =  SET_STAGED_ACTIONS;
    }
    /**
     * create empty instance
     */
    public OrderEditSetStagedActionsActionImpl() {
        this.action =  SET_STAGED_ACTIONS;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>The actions to edit the <code>resource</code>.</p>
     */
    
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions(){
        return this.stagedActions;
    }

    
    public void setStagedActions(final com.commercetools.api.models.order.StagedOrderUpdateAction ...stagedActions){
       this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
    }
    
    
    public void setStagedActions(final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions){
       this.stagedActions = stagedActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditSetStagedActionsActionImpl that = (OrderEditSetStagedActionsActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(stagedActions, that.stagedActions)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(stagedActions)
            .toHashCode();
    }

}
