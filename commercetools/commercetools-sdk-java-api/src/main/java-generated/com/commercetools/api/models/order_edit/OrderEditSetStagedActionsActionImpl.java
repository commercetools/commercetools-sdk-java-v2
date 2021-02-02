
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetStagedActionsActionImpl implements OrderEditSetStagedActionsAction {

    private String action;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    @JsonCreator
    OrderEditSetStagedActionsActionImpl(
            @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        this.action = SET_STAGED_ACTIONS;
    }

    public OrderEditSetStagedActionsActionImpl() {
        this.action = SET_STAGED_ACTIONS;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>The actions to edit the <code>resource</code>.</p>
    */
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    public void setStagedActions(final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
    }

    public void setStagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditSetStagedActionsActionImpl that = (OrderEditSetStagedActionsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(stagedActions, that.stagedActions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stagedActions).toHashCode();
    }

}
