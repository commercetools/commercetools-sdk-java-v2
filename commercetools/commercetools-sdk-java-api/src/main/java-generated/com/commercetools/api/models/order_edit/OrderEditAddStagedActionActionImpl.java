
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
 *  <p>The <code>stagedActions</code> field cannot be updated if the Order Edit <code>result</code> is <span>OrderEdit Applied</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditAddStagedActionActionImpl implements OrderEditAddStagedActionAction, ModelBase {

    private String action;

    private com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderEditAddStagedActionActionImpl(
            @JsonProperty("stagedAction") final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
        this.action = ADD_STAGED_ACTION;
    }

    /**
     * create empty instance
     */
    public OrderEditAddStagedActionActionImpl() {
        this.action = ADD_STAGED_ACTION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Order update action to append to the <code>stagedActions</code> array.</p>
     */

    public com.commercetools.api.models.order.StagedOrderUpdateAction getStagedAction() {
        return this.stagedAction;
    }

    public void setStagedAction(final com.commercetools.api.models.order.StagedOrderUpdateAction stagedAction) {
        this.stagedAction = stagedAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderEditAddStagedActionActionImpl that = (OrderEditAddStagedActionActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(stagedAction, that.stagedAction)
                .append(action, that.action)
                .append(stagedAction, that.stagedAction)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stagedAction).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("stagedAction", stagedAction)
                .build();
    }

    @Override
    public OrderEditAddStagedActionAction copyDeep() {
        return OrderEditAddStagedActionAction.deepCopy(this);
    }
}
