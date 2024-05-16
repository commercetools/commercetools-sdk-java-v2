
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The <code>stagedActions</code> field cannot be updated if the Order Edit <code>result</code> is OrderEdit Applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditSetStagedActionsActionImpl implements OrderEditSetStagedActionsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditSetStagedActionsActionImpl(
            @JsonProperty("stagedActions") final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        this.action = SET_STAGED_ACTIONS;
    }

    /**
     * create empty instance
     */
    public OrderEditSetStagedActionsActionImpl() {
        this.action = SET_STAGED_ACTIONS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to replace the <code>stagedActions</code> of the Order Edit.</p>
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

        return new EqualsBuilder().append(action, that.action)
                .append(stagedActions, that.stagedActions)
                .append(action, that.action)
                .append(stagedActions, that.stagedActions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stagedActions).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stagedActions", stagedActions)
                .build();
    }

}
